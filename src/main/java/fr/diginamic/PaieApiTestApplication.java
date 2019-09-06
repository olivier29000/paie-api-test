package fr.diginamic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.diginamic.paie.EntrepriseApiTest;

@SpringBootApplication
public class PaieApiTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaieApiTestApplication.class, args);
		EntrepriseApiTest.RestTemplateMethod();
	}

}
