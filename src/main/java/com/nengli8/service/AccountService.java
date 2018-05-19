package com.nengli8.service;

import com.nengli8.domain.Account;
import com.nengli8.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 11369 on 2018/5/19.
 */
@Service
public class AccountService {
    @Autowired
    public AccountRepository accountRepository;

    public Account create(Account account) {
        return accountRepository.save(account);
    }

    public List<Account> listAccount() {
        return (List<Account>) accountRepository.findAll();
    }
}
