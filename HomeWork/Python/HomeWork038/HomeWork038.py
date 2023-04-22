
"""
Задача 49:
Создать телефонный справочник
"""
import json
import os.path


def create_contact_dict():
    pass


def find_contact(contacts: list) -> None:
    what = input('Кого ищем?\n>>> ')
    found = list(filter(lambda el: what in el['first_name'] or what in el['second_name'], contacts))
    if found:
        show_on_screen(list(found))
    else:
        print('Никого не нашли...')


def file_path(file_name='contact_list'):
    return os.path.join(os.path.dirname(__file__), f'{file_name}.txt')


def save_to_file(contact: list) -> None:
    path = file_path()

    with open(path, 'w', encoding='UTF-8') as file:
        json.dump(contact, file, ensure_ascii=False)
    #print('Записано!')


def load_from_file():
    path = file_path()

    with open(path, 'r', encoding='UTF-8') as file:
        data = json.load(file)

    return data


def show_on_screen(contacts: list) -> None:
    decode_keys = dict(
        first_name='Имя:',
        second_name='Фамилия:',
        contacts='Телефон:'
    )
    pretty_text = str()
    for num, elem in enumerate(contacts, 1):
        pretty_text += f'Контакт №{num}:\n'
        pretty_text += '\n'.join(f'{decode_keys[k]} {v}' for k, v in elem.items())
        pretty_text += '\n_______\n'

    print(pretty_text)


def new_contact(contacts: list) -> None:
    contacts.append(
        dict(
            first_name=input('Введите имя контакта:\n>>> '),
            second_name=input('Введите фамилию контакта:\n>>> '),
            contacts=input('Введите номер телефона:\n>>> ')
        )
    )
    print('Контакт добавлен!')


def remove_from_contacts(contacts: list) -> None:
    show_on_screen(contacts)
    deleting = int(input('Введите номер контакта:\n>>> '))
    contacts.remove(contacts[deleting - 1])
    print('Контакт удалён!')


def change_contact(contacts: list) -> None:
    show_on_screen(contacts)
    changing = int(input('Введите номер контакта:\n>>> '))
    contacts[changing - 1] = dict(
        first_name=input('Введите имя контакта:\n>>> '),
        second_name=input('Введите фамилию контакта:\n>>> '),
        contacts=input('Введите номер телефона:\n>>> ')
    )
    print('Успешно!')


def menu():
    commands = [
        'Показать все контакты',
        'Найти контакт',
        'Создать контакт',
        'Удалить контакт',
        'Изменить контакт'
    ]
    print('Укажите номер команды:')
    print('\n'.join(f'{n}. {v}' for n, v in enumerate(commands, 1)))
    choice = input('>>> ')

    try:
        choice = int(choice)
        if choice < 0 or len(commands) < choice:
            raise Exception('Такой команды нет...')
        choice -= 1
    except ValueError as ex:
        print('Я вас не понял повторите...')
        menu()
    except Exception as ex:
        print(ex)
        main()
    else:
        return choice


def main() -> None:
    print('Программа запущена...')
    data = load_from_file()

    command = menu()

    if command == 0:
        show_on_screen(data)
    elif command == 1:
        find_contact(data)
    elif command == 2:
        new_contact(data)
    elif command == 3:
        remove_from_contacts(data)
    elif command == 4:
        change_contact(data)

    save_to_file(data)
    print('Конец программы!')


def tests():
    contact = dict(
        first_name='Иван',
        second_name='Иванов',
        contacts='123'
    )
    contact2 = dict(
        first_name='Петр',
        second_name='Петров',
        contacts='123'
    )
    contact3 = dict(
        first_name='Петр',
        second_name='Иванов',
        contacts='123'
    )
    contact4 = dict(
        first_name='Иван',
        second_name='Петров',
        contacts='123'
    )
    contacts = [contact, contact2, contact3, contact4]


if __name__ == '__main__':
    main()

