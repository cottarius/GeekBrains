import java.io.*;
import java.nio.file.FileSystemException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Operation {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd.mm.yyyy");
    public void run() throws Exception {
        String[] text = inputRecord();
        User user = parseFromString(text);
        saveToFile(user);
    }

    private void saveToFile (User user) throws FileSystemException {
        String fileName = user.getLastName().toLowerCase() + ".txt";
        File file = new File(fileName);
        try (FileWriter fw = new FileWriter(file, true)){
            if (file.length() > 0){
                fw.write('\n');
            }
            fw.write(String.format("<%s><%s><%s><%s><%s><%s>", user.getLastName(), user.getFirstName(),
                    user.getPatronymic(), dateFormat.format(user.getBorn()), user.getPhone(), user.getGender()));
        } catch (IOException e){
            throw new FileSystemException("Возникла ошибка при работе с файлом");
        }
    }
    private String[] inputRecord() throws Exception {
        System.out.println("Введите фамилию, имя, отчество, дату рождения (в формате dd.mm.yyyy), номер телефона " +
                "(число без разделителей) и пол(символ латиницей f или m), разделенные пробелом");

        String inputText;
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
            inputText = bf.readLine();
        } catch (IOException e) {
            throw new Exception("Произошла ошибка при работе с консолью");
        }

        String[] splitArray = inputText.split(" ");
        if (splitArray.length != 6) {
            throw new Exception("Введено неверное количество параметров");
        }
        return splitArray;
    }

    private User parseFromString(String[] splitArray) throws Exception {

        String lastName = splitArray[0];
        String firstName = splitArray[1];
        String patronymic = splitArray[2];

        Date born;
        try {
            born = dateFormat.parse(splitArray[3]);
        } catch (ParseException ex) {
            throw new ParseException("Неверный формат даты рождения", ex.getErrorOffset());
        }
        String phone;
        try {
            phone = splitArray[4];
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Неверный формат телефона");
        }

        String gender = splitArray[5];
        if (!gender.equalsIgnoreCase("m") && !gender.equalsIgnoreCase("f")) {
            throw new RuntimeException("Неверно введен пол");
        }
        return new User(lastName, firstName, patronymic, born, phone, gender);
    }
}
