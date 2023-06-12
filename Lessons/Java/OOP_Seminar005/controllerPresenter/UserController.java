package controllerPresenter;

import model.User;
import service.UserService;
import service.UserServiceServiceImpl;

import java.util.Scanner;

public class UserController {
    private UserService userService = new UserServiceServiceImpl();
    public void saveUser(String name, String lastName, long moneyAmount){
        userService.saveUser(name, lastName, moneyAmount);
    }
    public void deleteUser(int index){
        if(index != -1) {
            userService.deleteUser(index);
            System.out.println("Delete has been performed");
        } else {
            System.out.println("User is null!");
        }
    }
    public void getAllUsers(){
        System.out.println(userService.getAllUsers());
    }
}
