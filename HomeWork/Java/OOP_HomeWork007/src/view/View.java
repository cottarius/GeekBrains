package view;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);
    public double getValue(String title){
        System.out.printf("%s", title);
        return in.nextDouble();
    }
    public char getOperationSign(String title){
        System.out.printf("%s", title);
        return in.next(".").charAt(0);
    }
}
