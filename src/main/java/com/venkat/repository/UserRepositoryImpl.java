package com.venkat.repository;

import com.venkat.entity.User;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class UserRepositoryImpl implements UserRepository{
    @Override
    public User save(User user) {
        return user;
    }

    @Override
    public Iterable<User> findAll() {
        return Collections.emptyList();
    }
}
