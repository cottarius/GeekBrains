/*
Дана json строка [{ "фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4",
"предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
Задача написать метод(ы), который распарсит строку и выдаст ответ вида:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.

Используйте StringBuilder для подготовки ответа

Исходная json строка это просто String !!! Для работы используйте методы String, такие как replace, split,
substring и т.д. по необходимости

Создать метод, который запишет результат работы в файл. Обработайте исключения и запишите ошибки в лог файл.
2. *Получить исходную json строку из файла, используя FileReader или Scanner
3. *Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
 */

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String jsonString = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";

        ObjectMapper objectMapper = new ObjectMapper();
        StringBuilder stringBuilder = new StringBuilder();

        try {
            Student[] students = objectMapper.readValue(jsonString, Student[].class);
            for (Student student : students) {
                stringBuilder.append(student.getList());
                stringBuilder.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String str = stringBuilder.toString();
        System.out.println(str);
        saveToFile(str);
    }

    static void saveToFile(String s) {
        String path = "file.txt";
        try (FileWriter fWriter = new FileWriter(path, true)) {
            fWriter.append(s);
            fWriter.append("\n");
            fWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class Student {
    @JsonProperty("фамилия")
    private String name;
    @JsonProperty("оценка")
    private Integer grade;
    @JsonProperty("предмет")
    private String subject;
    public String getList() {
        return ("Студент " + name + " получил " + grade + " по предмету " + subject);
    }
}

