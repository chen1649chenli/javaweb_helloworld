package io.lichen.javaweb.service;

import io.lichen.javaweb.dao.UserDao;
import io.lichen.javaweb.domain.User;

public class UserService {
    private UserDao userDao = new UserDao();

    public User find() {
        return  userDao.find();
    }
}
