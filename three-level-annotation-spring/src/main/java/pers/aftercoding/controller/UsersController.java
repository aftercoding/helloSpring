package pers.aftercoding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pers.aftercoding.pojo.Users;
import pers.aftercoding.service.UsersService;
import pers.aftercoding.service.impl.UsersServiceImpl;

//UI level
@Controller
public class UsersController {
    // UI, how to access service level

    public void setUsersService(UsersService usersService) {

        this.usersService = usersService;
    }

    @Autowired
    public UsersService usersService;// = new UsersServiceImpl();
    public int insert(Users users){

        return usersService.insert(users);
    }
}
