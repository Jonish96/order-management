package com.paryogsaala.ordermanagement;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private Long id=1L;
    public List<User> userList = new ArrayList<>();

    public List<User> getAllUsers() {
        return userList;
    }

    public void addUser(User user) {
        user.setId(id++);
        userList.add(user);
    }

    public Optional<User> getUserById(Long id) {
//        for(User user: userList) {
//            if(user.getId().equals(id)) {
//                return user;
//            }
//        }
//        return null;
        return userList.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
    }

}
