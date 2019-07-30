package com.qf.j1902.mapper;



import com.qf.j1902.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

/**
 * Created by Administrator on 2019/6/13.
 */
@Mapper
public interface UserMapper {
   //定义一个 通过用户名查询用户的方法
   public User getUsersByName(@Param("loginName") String name);
   //定义一个 查询全部用户的方法
   ArrayList<User> getUsers();
   //定义一个 添加用户的方法
   boolean addUser(User user);
   //定义一个 删除用户的方法
   boolean delUser(int id);
}
