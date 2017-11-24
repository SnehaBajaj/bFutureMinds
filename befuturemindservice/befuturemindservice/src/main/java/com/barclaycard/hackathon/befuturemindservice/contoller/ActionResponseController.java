package com.barclaycard.hackathon.befuturemindservice.contoller;

import com.barclaycard.hackathon.befuturemindservice.entities.Account;
import com.barclaycard.hackathon.befuturemindservice.service.AccountService;
import com.barclaycard.hackathon.befuturemindservice.service.ActionResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/unknown")
public class ActionResponseController {

    @Autowired
    ActionResponseService actionResponseService;

    @GetMapping(value = "/count", headers = {"apiKey=ssdWEWdWDw3434FDFe5FefEefef"})
    public ResponseEntity getUnknownInputsCount() {
        Integer count = actionResponseService.getCount();
        return ResponseEntity.ok(count);
    }

    @PostMapping(value = "/update", headers = {"apiKey=ssdWEWdWDw3434FDFe5FefEefef"})
    public int setUnknownInputsCount(int count) {
        Integer response = actionResponseService.setCount(count);
        return response;
    }
}
