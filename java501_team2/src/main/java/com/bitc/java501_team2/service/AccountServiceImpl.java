package com.bitc.java501_team2.service;

import com.bitc.java501_team2.dto.AccountDto;
import com.bitc.java501_team2.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public void insertAccount(AccountDto user) throws Exception {
        accountMapper.insertAccount(user);
    }

    @Override
    public int isIdCheck(String userId) throws Exception {
        return accountMapper.isIdCheck(userId);
    }
}
