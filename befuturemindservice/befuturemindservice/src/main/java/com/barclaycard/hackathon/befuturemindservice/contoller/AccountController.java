package com.barclaycard.hackathon.befuturemindservice.contoller;

import com.barclaycard.hackathon.befuturemindservice.entities.Account;
import com.barclaycard.hackathon.befuturemindservice.entities.SenderSession;
import com.barclaycard.hackathon.befuturemindservice.service.AccountService;
import com.barclaycard.hackathon.befuturemindservice.service.SenderSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * Created by vbhatia on 11/22/2017.
 */
@RestController
public class AccountController {

    @Autowired
    AccountService accountService;

    @Autowired
    SenderSessionService senderSessionService;

    @GetMapping(value = "/account/{socialId}", headers = {"apiKey=ssdWEWdWDw3434FDFe5FefEefef"})
    public ResponseEntity getAccounts(@PathVariable String socialId) {
        List<Account> accounts = accountService.getAccounts(socialId);
        return ResponseEntity.ok(accounts);
    }

    @GetMapping(value = "/sendersession/{senderID}", headers = {"apiKey=ssdWEWdWDw3434FDFe5FefEefef"})
    public ResponseEntity getSenderSession(@PathVariable String senderID) {
        SenderSession senderSession = senderSessionService.getSenderSession(senderID);
        return ResponseEntity.ok(senderSession);
    }

    @PostMapping(value = "/sendersession", headers = {"apiKey=ssdWEWdWDw3434FDFe5FefEefef"})
    public ResponseEntity saveSenderSession(@RequestBody SenderSession senderSession) {
        senderSessionService.saveSenderSession(senderSession);
        return ResponseEntity.ok(null);
    }

}
