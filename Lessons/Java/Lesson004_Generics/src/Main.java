import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Repository audioStorage = new Repository("audioStorage");
        audioStorage.add(new AudioContent("track_001.mp3"));
        audioStorage.add(new AudioContent("03 Дорожка 03.wma"));

        for (Content content : (Iterable<Content>) audioStorage) {
            System.out.println(content);
        }

        Repository videoStorage = new Repository("videoStorage");
        videoStorage.add(new VideoContent("Новый фильм 1.wmv"));
        videoStorage.add(new VideoContent("Новый фильм 5.3gp"));

        for (int index = 0; index < videoStorage.count(); index++){
            System.out.println(videoStorage.get(index));
        }



    }
}