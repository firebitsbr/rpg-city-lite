package com.jbcomputers.rpgcitylite;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class RpgCityLiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(RpgCityLiteApplication.class, args);
		log.info("Welcome to RPG City Lite Server");
	}

}
