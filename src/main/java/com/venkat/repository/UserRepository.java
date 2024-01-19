package com.venkat.repository;


import com.venkat.entity.User;

@SuppressWarnings("unused")
public interface UserRepository {

    User save(User user);

    Iterable<User> findAll();
}