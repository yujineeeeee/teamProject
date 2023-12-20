package com.bitc.java501_team2.service;

import com.bitc.java501_team2.dto.ReservationDto;
import com.bitc.java501_team2.dto.UserDTO;

import java.util.List;

public interface UserService {
    int isUserInfo(String userId, String userPass) throws Exception;

    UserDTO getUserInfo(String userId) throws Exception;

    List<ReservationDto> getReservationInfo(String userId) throws Exception;

    List<UserDTO> getUserList() throws Exception;

    void userDelete(String selUserId) throws Exception;

    List<ReservationDto> userReservationList() throws Exception;

    void myReservationDelete(String reservationNum) throws Exception;
}
