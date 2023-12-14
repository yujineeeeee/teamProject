package com.bitc.java501_team2.mapper;

import com.bitc.java501_team2.dto.AccountDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountMapper {
    void insertAccount(AccountDto user) throws Exception;

    int isIdCheck(String userId) throws Exception;
}
