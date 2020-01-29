package com.jbcomputers.rpgcitylite.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="building_actions")
public class BuildingAction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="actions_id")
    Long actionsId;

    @ManyToOne(fetch = FetchType.LAZY, optional=false)
    @JoinColumn(name="buildingid", nullable=false)
    @JsonBackReference
    Building building;

    @Column(name="category")
    String category;

    @Column(name="level")
    int level;

    @Column(name="type")
    String type;

    @Column(name="value")
    int value;
}
