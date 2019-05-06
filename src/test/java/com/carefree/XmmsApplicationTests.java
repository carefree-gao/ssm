package com.carefree;

import com.carefree.dao.UserMapper;
import com.carefree.model.User;
import com.carefree.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;





@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@Transactional
public class XmmsApplicationTests {


    @Autowired
    UserService userService;


    @Test
    public void contextLoads() {

        List<User> user = userService.findList(1,8);
        System.out.print(user);

    }

}
