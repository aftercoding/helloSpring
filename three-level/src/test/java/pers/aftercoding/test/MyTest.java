package pers.aftercoding.test;

import org.junit.Test;
import pers.aftercoding.controller.UsersController;
import pers.aftercoding.pojo.Users;

public class MyTest {
    @Test
    public void testInsertUsers(){
        UsersController usersController = new UsersController();
        int num = usersController.insert(new Users(100, "Tom", 22));
        System.out.println(num);
    }
}
