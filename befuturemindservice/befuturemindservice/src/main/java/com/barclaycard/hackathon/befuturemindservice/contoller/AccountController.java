package com.barclaycard.hackathon.befuturemindservice.contoller;

import com.barclaycard.hackathon.befuturemindservice.entities.Account;
import com.barclaycard.hackathon.befuturemindservice.entities.Bank;
import com.barclaycard.hackathon.befuturemindservice.entities.SenderSession;
import com.barclaycard.hackathon.befuturemindservice.entities.Transaction;
import com.barclaycard.hackathon.befuturemindservice.service.AccountService;
import com.barclaycard.hackathon.befuturemindservice.service.SenderSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vbhatia on 11/22/2017.
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping(value = "/details/{socialId}", headers = {"apiKey=ssdWEWdWDw3434FDFe5FefEefef"})
    public ResponseEntity getAccountDetails(@PathVariable String socialId) {
        List<Account> accounts = accountService.getAccounts(socialId);
        return ResponseEntity.ok(accounts);
    }

    @GetMapping(value = "/balance/{socialId}", headers = {"apiKey=ssdWEWdWDw3434FDFe5FefEefef"})
    public ResponseEntity getAccountBalance(@PathVariable String socialId) {
        List<Account> accounts = accountService.getAccounts(socialId);
        String balance = "null";
        if (null != accounts.get(0)) {
            balance = accounts.get(0).getAccountBalance();
        }
        return ResponseEntity.ok(balance);
    }

    @GetMapping(value = "/last5/{socialId}", headers = {"apiKey=ssdWEWdWDw3434FDFe5FefEefef"})
    public ResponseEntity getLast5Txn(@PathVariable String socialId) {
        List<Account> accounts = accountService.getAccounts(socialId);
        List<Transaction> transactionList = new ArrayList<>();
        if (null != accounts.get(0)) {
            transactionList = accounts.get(0).getTransactions();
        }
        return ResponseEntity.ok(transactionList);
    }

    @GetMapping(value = "/branchDetails/{socialId}", headers = "apiKey=ssdWEWdWDw3434FDFe5FefEefef")
    public ResponseEntity getBranchDetails(@PathVariable String socialId){
        List<Account> accounts = accountService.getAccounts(socialId);
        Bank bank = null;
        if (null != accounts.get(0)) {
            bank = accounts.get(0).getBank();
        }
        return ResponseEntity.ok(bank.getBranchDetails());
    }

    @GetMapping(value = "/ifsc/{socialId}", headers = "apiKey=ssdWEWdWDw3434FDFe5FefEefef")
    public ResponseEntity getIfsc(@PathVariable String socialId){
        List<Account> accounts = accountService.getAccounts(socialId);
        Bank bank = null;
        if (null != accounts.get(0)) {
            bank = accounts.get(0).getBank();
        }
        return ResponseEntity.ok(bank.getIfsc());
    }
}
