package com.bitc.java501_team2.service;

import com.bitc.java501_team2.dto.AccountDto;

public interface AccountService {
    public void insertAccount(AccountDto user) throws Exception;

    int isIdCheck(String userId) throws Exception;
}
