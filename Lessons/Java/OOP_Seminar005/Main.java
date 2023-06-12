import controllerPresenter.UserController;

import java.util.Scanner;

// View - консоль
public class Main {
    public static void main(String[] args) {
        UserController userController = new UserController();
        Scanner scanner = new Scanner(System.in);

        userController.saveUser(scanner.nextLine(), scanner.next(), scanner.nextLong());
        Scanner scanner1 = new Scanner(System.in);
        userController.saveUser(scanner1.nextLine(), scanner1.next(), scanner1.nextLong());
        userController.getAllUsers();
        userController.deleteUser(0);
        userController.getAllUsers();
    }

}
