package com.jbcomputers.rpgcitylite.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "building_reqs")
public class BuildingRequirement {

    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    @Column(name="reqs_id")
    Long reqsId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="buildingid", nullable = false)
    @JsonBackReference
    Building building;

    @Column(name="category")
    String category;

    @Column(name="type")
    String type;

    @Column(name="value")
    int value;

    @Column(name="level")
    int level;

    @Column(name="image")
    String image;
}
