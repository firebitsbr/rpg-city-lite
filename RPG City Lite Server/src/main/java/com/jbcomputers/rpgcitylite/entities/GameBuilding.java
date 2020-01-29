package com.jbcomputers.rpgcitylite.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name="game_buildings")
public class GameBuilding {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="gb_id")
    Long gbId;

//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name="buildingid", nullable=false)
//    Building building;

    @ManyToOne(fetch= FetchType.LAZY, optional=false)
    @JoinColumn(name="playerid", nullable=false)
    Player player;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "gameBuilding")
    Hero hero;

    @Column(name="level")
    int level;

    @Column(name="status")
    String status;

    @Column(name="slot")
    int slot;

    @Column(name="time")
    Timestamp time;
}
