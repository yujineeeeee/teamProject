package com.bitc.java501_team2.dto;

import lombok.Data;

@Data
public class UserDTO {
    public String userSeq;
    public String userId;
    public String userPass;
    public String userName;
    public String userRegidate;
    public String userUpdateDate;
    public int userCheck;
    public String userDeletedYn;
}
