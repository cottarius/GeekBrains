import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Programm {
    public static void main(String[] args) throws IOException {
        File file = new File(".");
        File file2 = new File("./backup");
        copyDir(file, file2);
    }

    /**
     * Метод копирования директорий
     *
     * @param sourceDir      директория источник
     * @param destinationDir директория назначения
     * @throws IOException
     */
    static void copyDir(File sourceDir, File destinationDir) throws IOException {
        if (!destinationDir.exists()) {
            destinationDir.mkdir();
        }
        for (String f : sourceDir.list()) {
            if(f.equalsIgnoreCase("backup")) {
                continue;
            }
            File source = new File(sourceDir, f);
            File destination = new File(destinationDir, f);

            if (source.isDirectory()) {
                copyDir(source, destination);
            } else {
                copyFile(source, destination);
            }
        }

    }

    /**
     * Метод копирования файлов
     *
     * @param sourceFile     файл источник
     * @param destinationFile файл назначения
     * @throws IOException
     */
    static void copyFile(File sourceFile, File destinationFile) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(sourceFile);
             FileOutputStream fileOutputStream = new FileOutputStream(destinationFile)) {

            int c;
            byte[] buffer = new byte[1024];
            while ((c = fileInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, c);
            }
        }
    }
}
