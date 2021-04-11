package com.y.repository;

import com.y.entity.User;

import java.util.List;

public interface UserRepository {
    public List<User> findAll();
}