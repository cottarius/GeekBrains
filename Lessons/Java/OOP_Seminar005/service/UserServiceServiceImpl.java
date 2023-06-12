package service;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserServiceServiceImpl implements UserService {
    List<User> users = new ArrayList<>();
    @Override
    public void saveUser(String name, String lastName, long moneyAmount) {
        users.add(new User(name, lastName, moneyAmount));
    }

    @Override
    public void deleteUser(int index) {
        if(index < users.size()) {
            users.remove(index);
        } else {
            System.out.println("no such user!");
        }
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }
}
