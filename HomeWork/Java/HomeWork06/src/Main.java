import java.util.*;

public class Main {
    public static void main(String[] args) {
        printFilteredNotebooks();
    }
    static void printFilteredNotebooks(){
        Set<Notebook> notebooks = setNotebooks();
        Notebook compareNotebook = filter();
        for (Notebook notebook : notebooks){
            if(notebook.getRam() >= compareNotebook.getRam()
                    && notebook.getHdd() >= compareNotebook.getHdd()
                    && notebook.getOs().contains(compareNotebook.getOs())
                    && notebook.getColor().contains(compareNotebook.getColor()))
            {
                notebook.print();
            }
        }
    }
    static Set<Notebook> setNotebooks(){
        Notebook notebook1 = new Notebook(32, 2000, "Windows", "Black");
        Notebook notebook2 = new Notebook(16, 1000, "Linux", "Silver");
        Notebook notebook3 = new Notebook(16, 1000, "Windows", "Black");
        Notebook notebook4 = new Notebook(32, 2000, "Linux", "Silver");
        Notebook notebook5 = new Notebook(16, 1000, "Mac OS", "Black");
        Notebook notebook6 = new Notebook(8, 500, "Windows", "Silver");
        Notebook notebook7 = new Notebook(16, 500, "Windows", "Black");
        Notebook notebook8 = new Notebook(8, 1000, "Linux", "Silver");
        Notebook notebook9 = new Notebook(8, 500, "Msc OS", "Black");
        Notebook notebook10 = new Notebook(32, 1000, "Mac OS", "Silver");

        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        notebooks.add(notebook5);
        notebooks.add(notebook6);
        notebooks.add(notebook7);
        notebooks.add(notebook8);
        notebooks.add(notebook9);
        notebooks.add(notebook10);

        return notebooks;
    }
    static void menu(){
        System.out.println("Параметры фильтрации:");
        System.out.println("1 - RAM");
        System.out.println("2 - HDD");
        System.out.println("3 - OS");
        System.out.println("4 - Color");
        System.out.println("0 - Применить параметры фильтра");
        System.out.print("Введите номер параметра: ");
    }

    static Notebook filter() {
        Notebook compareNotebook = new Notebook(0, 0, "", "");
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            menu();
            switch (in.nextInt()){
                case 0:
                    flag = false;
                    break;
                case 1:
                    System.out.print("Введите значение RAM: ");
                    int ram = in.nextInt();
                    compareNotebook.setRam(ram);
                    break;
                case 2:
                    System.out.print("Введите значение HDD: ");
                    int hdd = in.nextInt();
                    compareNotebook.setHdd(hdd);
                    break;
                case 3:
                    System.out.print("Введите OS: ");
                    String os = in.next();
                    compareNotebook.setOs(os);
                    break;
                case 4:
                    System.out.print("Введите color: ");
                    String color = in.next();
                    compareNotebook.setColor(color);
                    break;
                default:
                    System.out.println("Что-то пошло не так...");
            }
        }
        in.close();
        return compareNotebook;
    }
}