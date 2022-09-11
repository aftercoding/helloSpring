package pers.aftercoding.service.impl;

import pers.aftercoding.dao.UsersMapper;
import pers.aftercoding.dao.UsersMapperImpl;
import pers.aftercoding.pojo.Users;
import pers.aftercoding.service.UsersService;

//service level
public class UsersServiceImpl implements UsersService {
    //Remember: Almost every service level need some objects of data access level
    private UsersMapper usersMapper;// = new UsersMapperImpl();

    public void setUsersMapper(UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
    }

    // add setter method
    @Override
    public int insert(Users users) {

        return usersMapper.insert(users);
    }
}
