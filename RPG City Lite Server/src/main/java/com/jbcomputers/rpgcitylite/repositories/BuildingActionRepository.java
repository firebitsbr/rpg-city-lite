package com.jbcomputers.rpgcitylite.repositories;

import com.jbcomputers.rpgcitylite.entities.BuildingAction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuildingActionRepository extends JpaRepository<BuildingAction, Long> {
}
