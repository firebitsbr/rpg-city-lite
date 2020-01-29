package com.jbcomputers.rpgcitylite.repositories;

import com.jbcomputers.rpgcitylite.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {

    @Query("SELECT player FROM Player player WHERE player.username = ?1 and player.password = ?2")
    Player findPlayerByUsernameAndPassword(String username, String password);
}
