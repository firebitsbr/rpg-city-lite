package com.jbcomputers.rpgcitylite.services;

import com.jbcomputers.rpgcitylite.entities.Player;
import com.jbcomputers.rpgcitylite.exceptions.InvalidLoginException;
import com.jbcomputers.rpgcitylite.repositories.PlayerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class LoginService {

    @Autowired
    PlayerRepository playerRepository;

    public Player loginPlayer(String username, String password) throws InvalidLoginException {
        log.info("User trying to authenticate: " + username + " with password: " + password);
        Player player = playerRepository.findPlayerByUsernameAndPassword(username, password);
        if (player == null) {
            log.error("User " + username + " failed to authenticate!");
            throw new InvalidLoginException("Username or password not found.");
        }
        else {
            log.info("User " + username + " successfully authenticated.");
            return player;
        }
    }

}
