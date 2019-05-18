package com.gdm.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.gdm.crud"})
@EnableJpaRepositories(basePackages="com.gdm.crud.repositories")
@EntityScan(basePackages="com.gdm.crud.entities")
@EnableTransactionManagement

public class CrudExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudExampleApplication.class, args);
	}

}


//@EntityScan(basePackages="com.gdm.crud.entities")
   
