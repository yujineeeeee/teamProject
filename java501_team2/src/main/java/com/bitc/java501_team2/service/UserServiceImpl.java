package com.bitc.java501_team2.service;

import com.bitc.java501_team2.dto.ReservationDto;
import com.bitc.java501_team2.dto.UserDTO;
import com.bitc.java501_team2.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<ReservationDto> getReservationInfo(String userId) throws Exception {
        return userMapper.getReservationInfo(userId);
    }

    @Override
    public List<UserDTO> getUserList() throws Exception {
        return userMapper.getUserList();
    }

    @Override
    public void userDelete(String selUserId) throws Exception {
        userMapper.userDelete(selUserId);
    }

    @Override
    public List<ReservationDto> userReservationList() throws Exception {
        return userMapper.userReservationList();
    }

    @Override
    public void myReservationDelete(String reservationNum) throws Exception {
        userMapper.myReservationDelete(reservationNum);
    }

}
