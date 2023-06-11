package com.example.demo.service;

import com.example.demo.dto.AccountDto;
import com.example.demo.entity.Account;
import com.example.demo.home.dto.AccountDto2;
import com.example.demo.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class AccountService {

    private final AccountRepository accountRepository;


    public List<Long> createInit() {
        List<Account> accountList = new ArrayList<>();
        String userId = "user";
        String password = "pwd";
        String name = "유저";
        int age = 10;

        for(int i = 1; i<=100;i++){
            Account account = new Account(userId+" "+i,password+" "+i,name+" "+i,age+i);
            accountList.add(account);
        }
        List<Account> response = accountRepository.saveAll(accountList);

        return response.stream().map(account -> account.getUid()).collect(Collectors.toList());
    }

    public List<AccountDto> accountList() {
        List<Account> all = accountRepository.findAll();
        List<AccountDto> response = new ArrayList<>();
        for(int i = 0;i<all.size();i++){
            Account account = all.get(i);
            AccountDto dto = new AccountDto(account.getUid(),account.getAccountId(),account.getPassword(),account.getName(),account.getAge());
            response.add(dto);
        }
        return response;

    }
}
