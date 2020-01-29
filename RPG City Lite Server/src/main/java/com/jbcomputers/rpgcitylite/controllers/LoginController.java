package com.jbcomputers.rpgcitylite.controllers;

import com.jbcomputers.rpgcitylite.entities.Player;
import com.jbcomputers.rpgcitylite.exceptions.InvalidLoginException;
import com.jbcomputers.rpgcitylite.services.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    @PostMapping(value = "/login")
    public ResponseEntity<Player> loginUser(@RequestBody Player player) {
        log.info("Login endpoint reached.");
        Player authenticatedPlayer;

        try {
            authenticatedPlayer = loginService.loginPlayer(player.getUsername(), player.getPassword());
            return new ResponseEntity<>(authenticatedPlayer, HttpStatus.OK);
        } catch(InvalidLoginException e) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

}
