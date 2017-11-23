package com.barclaycard.hackathon.befuturemindservice.service;

import com.barclaycard.hackathon.befuturemindservice.entities.Account;
import com.barclaycard.hackathon.befuturemindservice.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by vbhatia on 11/23/2017.
 */
@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    public List<Account> getAccounts(String fbId) {
       return accountRepository.findBySocialId(fbId);

    }
}
