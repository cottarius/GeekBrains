package service;

import model.User;

import java.util.List;

public interface UserService {
    void saveUser(String name, String lastName, long moneyAmount);
    void deleteUser(int index);
    List<User> getAllUsers();

}
