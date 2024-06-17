package com.asac.springtutorial.service.user;

import com.asac.springtutorial.user.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public User getUser(Integer id){
        return new User("Aaron",10,null);
    }
}
