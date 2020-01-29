package com.jbcomputers.rpgcitylite.repositories;

import com.jbcomputers.rpgcitylite.entities.GameBuilding;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameBuildingRepository extends JpaRepository<GameBuilding, Long> {
}
