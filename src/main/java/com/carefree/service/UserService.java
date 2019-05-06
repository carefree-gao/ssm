package com.carefree.service;


import com.carefree.model.User;

import java.util.List;

public interface UserService {

    List<User> findList(int PageNo,int PageSize);
}
