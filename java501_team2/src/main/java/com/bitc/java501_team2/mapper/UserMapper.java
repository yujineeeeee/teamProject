package com.bitc.java501_team2.mapper;

import com.bitc.java501_team2.dto.ReservationDto;
import com.bitc.java501_team2.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    int isUserInfo(@Param("userId") String userId, @Param("userPass") String userPass) throws Exception;

    UserDTO getUserInfo(@Param("userId") String userId) throws Exception;

    List<ReservationDto> getReservationInfo(String userId) throws Exception;

    List<UserDTO> getUserList() throws Exception;

    void userDelete(String selUserId) throws Exception;

    List<ReservationDto> userReservationList() throws Exception;

    void myReservationDelete(String reservationNum) throws Exception;
}
