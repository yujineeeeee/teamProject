package com.bitc.java501_team2.service;

import com.bitc.java501_team2.dto.UserDTO;
import com.bitc.java501_team2.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int isUserInfo(String userId, String userPass) throws Exception {
        return userMapper.isUserInfo(userId, userPass);
    }

    @Override
    public UserDTO getUserInfo(String userId) throws Exception {
        return userMapper.getUserInfo(userId);
    }

}
