package com.jbcomputers.rpgcitylite.repositories;

import com.jbcomputers.rpgcitylite.entities.BuildingRequirement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuildingRequirementRepository extends JpaRepository<BuildingRequirement, Long> {
}
