package com.barclaycard.hackathon.befuturemindservice.contoller;

import com.barclaycard.hackathon.befuturemindservice.entities.Account;
import com.barclaycard.hackathon.befuturemindservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * Created by vbhatia on 11/22/2017.
 */
@RestController
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping(value = "/account/{socialId}", headers = {"apiKey=ssdWEWdWDw3434FDFe5FefEefef"})
    public ResponseEntity getAccounts(@PathVariable String socialId) {
        List<Account> accounts = accountService.getAccounts(socialId);
        return ResponseEntity.ok(accounts);
    }
}
