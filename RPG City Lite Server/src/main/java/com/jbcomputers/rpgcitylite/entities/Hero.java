package com.jbcomputers.rpgcitylite.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name="hero")
public class Hero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long heroId;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="gb_id", nullable = false)
    GameBuilding gameBuilding;

    @Column(name="hero_name")
    String heroName;
}
