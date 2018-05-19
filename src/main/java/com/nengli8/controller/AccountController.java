package com.nengli8.controller;

import com.nengli8.domain.Account;
import com.nengli8.request.AccountRequest;
import com.nengli8.response.BaseResponse;
import com.nengli8.response.SuccessResponse;
import com.nengli8.service.AccountService;
import org.assertj.core.util.Preconditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by 11369 on 2018/5/19.
 */
@RestController
@RequestMapping("/api/account")
public class AccountController extends BaseController {
    @Autowired
    public AccountService accountService;

    @PostMapping
    public BaseResponse create(@RequestBody AccountRequest request) {
        Preconditions.checkNotNull(request.getName());
        Preconditions.checkNotNull(request.getPassword());
        Account account = new Account();
        account.setName(request.getName());
        account.setPassword(request.getPassword());
        return new SuccessResponse("Success", accountService.create(account));
    }

    @GetMapping
    public BaseResponse list() {
        return new SuccessResponse("Success",  accountService.listAccount());
    }
}
