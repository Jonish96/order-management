package com.paryogsaala.ordermanagement;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    public List<User> userList = new ArrayList<>();

    public List<User> getAllUsers() {
        return userList;
    }

    public List<User> addUser(User user) {
        userList.add(user);
        return userList;
    }

}
