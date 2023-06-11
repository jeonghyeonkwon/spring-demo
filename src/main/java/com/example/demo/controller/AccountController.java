package com.example.demo.controller;

import com.example.demo.dto.AccountDto;
import com.example.demo.home.dto.AccountDto2;
import com.example.demo.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/account")
@RestController
@RequiredArgsConstructor
public class AccountController {
    private final AccountService accountService;


    @GetMapping({"","/"})
    public ResponseEntity accountList(){
        List<AccountDto> accountList = accountService.accountList();
        return new ResponseEntity(accountList,HttpStatus.OK);
    }


    @GetMapping("/init")
    public ResponseEntity init(){

        List<Long> uidList = accountService.createInit();
        return new ResponseEntity(uidList, HttpStatus.CREATED);
    }





}
