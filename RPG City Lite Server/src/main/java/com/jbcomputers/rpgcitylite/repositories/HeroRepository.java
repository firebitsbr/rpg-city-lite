package com.jbcomputers.rpgcitylite.repositories;

import com.jbcomputers.rpgcitylite.entities.Hero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroRepository extends JpaRepository<Hero, Long> {
}
