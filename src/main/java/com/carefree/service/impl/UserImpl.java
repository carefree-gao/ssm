package com.carefree.service.impl;


import com.carefree.dao.UserMapper;
import com.carefree.model.User;
import com.carefree.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserService")
public class UserImpl implements UserService {


    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> findList(int PageNo, int PageSize) {
        PageHelper.startPage(PageNo,PageSize);
        List<User> list = userMapper.findList();
        PageInfo<User> dd = new PageInfo(list);

        return dd.getList();
    }
}
