package pers.aftercoding.dao;

import org.springframework.stereotype.Repository;
import pers.aftercoding.pojo.Users;

//data access level
@Repository
public class UsersMapperImpl implements UsersMapper{
    @Override
    public int insert(Users users) {
        System.out.println(users.getUname() + " user has been inserted successfully!");
        return 1;
    }
}
