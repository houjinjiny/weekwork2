package com.itdr.service;

import com.itdr.pojo.Users;

import java.util.List;

public interface UserService {
    List<Users> getAll();

    List<Users> getFast();

    int deleteOne(String id);

    int addOne(String username, String birthday, String interest, String phonenumber, String qq);
}
