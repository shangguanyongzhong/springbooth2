package com.sgyz.test;

import com.sgyz.entity.User;
import com.sgyz.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootH2ApplicationTest {
    @Autowired
    private UserRepository repository;

    @Test
    public void test(){
        User u = repository.findOne(1L);
        Assert.assertEquals("成功的测试用例", "上官", u.getName());
    }


}
