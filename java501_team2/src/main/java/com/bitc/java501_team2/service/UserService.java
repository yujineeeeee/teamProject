package com.bitc.java501_team2.service;

import com.bitc.java501_team2.dto.UserDTO;

public interface UserService {
    int isUserInfo(String userId, String userPass) throws Exception;

    UserDTO getUserInfo(String userId) throws Exception;
}
