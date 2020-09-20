package io.lichen.javaweb.dao;

import io.lichen.javaweb.domain.User;

public class UserDao {
    public User find() {
        return new User("James Bond", "secret_password");
    }
}
