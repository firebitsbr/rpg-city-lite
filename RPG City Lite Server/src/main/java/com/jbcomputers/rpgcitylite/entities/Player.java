package com.jbcomputers.rpgcitylite.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name="player")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="playerid")
    Integer playerId;

    @Column(name="username")
    String username;

    @Column(name="password")
    String password;

    @Column(name="level")
    int level;

    @Column(name="experience")
    int xp;

    @Column(name="gems")
    int gems;

    @OneToMany(mappedBy = "player", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    Set<GameBuilding> gameBuildings;
}
