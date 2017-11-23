package com.barclaycard.hackathon.befuturemindservice.contoller;

import com.barclaycard.hackathon.befuturemindservice.entities.User;
import com.barclaycard.hackathon.befuturemindservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/user/{userId}")
    public ResponseEntity getUser(@PathVariable String userId) {
        User user = userService.getUser(userId);
        return ResponseEntity.ok(user);
    }
}
