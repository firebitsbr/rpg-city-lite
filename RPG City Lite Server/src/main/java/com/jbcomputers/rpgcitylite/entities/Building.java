package com.jbcomputers.rpgcitylite.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "building_ref")
public class Building {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="buildingid")
    Integer id;

    @Column(name="building_name")
    String buildingName;

    @Column(name="description")
    String description;

    @OneToMany(mappedBy = "building", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    @JsonManagedReference
    Set<BuildingRequirement> buildingRequirements;

    @OneToMany(mappedBy = "building", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    @JsonManagedReference
    Set<BuildingAction> buildingActions;

//    @OneToMany(mappedBy = "building", fetch = FetchType.LAZY,
//        cascade = CascadeType.ALL)
//    Set<GameBuilding> gameBuildings;

}
