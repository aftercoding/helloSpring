package pers.aftercoding.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.aftercoding.controller.UsersController;
import pers.aftercoding.pojo.Users;

public class MyTest {
    @Test
    public void testInsertUsers(){
       // create contain and start
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UsersController usersController = (UsersController) ac.getBean("uController");
        int num = usersController.insert(new Users(200, "wang", 26));
        System.out.println(num);
    }
}
