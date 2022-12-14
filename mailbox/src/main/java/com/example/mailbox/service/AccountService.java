package com.example.mailbox.service;

import com.example.mailbox.dto.UserDto;
import com.example.mailbox.entity.Account;
import com.example.mailbox.response.CreateAccountResponse;

public interface AccountService  {

    public CreateAccountResponse createMailBox(UserDto userDto);

    public Account findAccount(int userId);



}
