package com.delazeri.music.users.controllers;

import com.delazeri.music.users.dtos.UserDTO;
import com.delazeri.music.users.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    UserService service;

    @GetMapping("/data")
    public ResponseEntity<UserDTO> getAuthenticatedUserData(@RequestHeader("Authorization") String token) {
        return ResponseEntity.ok().body(service.getAuthenticatedUserData(token));
    }
}
