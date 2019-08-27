package com.funtl.gmall.user.service.impl;

import com.funtl.gmall.user.bean.UmsMember;
import com.funtl.gmall.user.mapper.UserMapper;
import com.funtl.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author songtao
 * @create 2019-08-2019/8/27-22:33
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMemberList = userMapper.selectAllUser();
        return umsMemberList;
    }
}
