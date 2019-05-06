package com.carefree.dao;

import com.carefree.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserMapper {

    List<User> findList();

    void insert(String s, String s1, String s2);
}