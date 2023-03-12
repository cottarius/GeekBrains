class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def PrintPerson(self):
        print(f"Name: {self.name} Age: {self.age}")


tom = Person('Tom', 25)
tom.PrintPerson()
