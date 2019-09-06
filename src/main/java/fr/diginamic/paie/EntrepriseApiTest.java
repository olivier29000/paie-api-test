package fr.diginamic.paie;

import org.springframework.web.client.RestTemplate;

import fr.diginamic.paie.entites.Entreprise;

public abstract class EntrepriseApiTest {

	public static Entreprise[] RestTemplateMethod() {

		RestTemplate rt = new RestTemplate();
		Entreprise[] result = rt.getForObject("https://paie-api-cecile.herokuapp.com/entreprises", Entreprise[].class);

		for (Entreprise entreprise : result) {
			System.out.println(entreprise.toString());
		}
		return result;
	}

}
