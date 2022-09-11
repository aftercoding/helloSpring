package pers.aftercoding.controller;

import pers.aftercoding.pojo.Users;
import pers.aftercoding.service.UsersService;
import pers.aftercoding.service.impl.UsersServiceImpl;

//UI level
public class UsersController {
    // UI, how to access service level

    public UsersService usersService = new UsersServiceImpl();
    public int insert(Users users){

        return usersService.insert(users);
    }
}
