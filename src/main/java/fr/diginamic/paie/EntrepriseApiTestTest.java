package fr.diginamic.paie;

import org.junit.Assert;
import org.junit.Test;

import fr.diginamic.paie.entites.Entreprise;

public class EntrepriseApiTestTest {

	@Test
	public void testNEstPasNul() {
		for (Entreprise entreprise : EntrepriseApiTest.RestTemplateMethod()) {
			Assert.assertNotNull(EntrepriseApiTest.RestTemplateMethod()[0].getCode());
			System.out.println(entreprise.getCode());
		}

	}

	@Test
	public void testObjetEstUneEntreprise() {
		for (Entreprise entreprise : EntrepriseApiTest.RestTemplateMethod()) {
			Assert.assertEquals(Entreprise.class, entreprise.getClass());

		}

	}

	@Test
	public void testCodeEstUnString() {
		for (Entreprise entreprise : EntrepriseApiTest.RestTemplateMethod()) {
			Assert.assertEquals(String.class, entreprise.getCode().getClass());

		}

	}

	@Test
	public void testDenominationEstUnString() {
		for (Entreprise entreprise : EntrepriseApiTest.RestTemplateMethod()) {
			Assert.assertEquals(String.class, entreprise.getDenomination().getClass());

		}

	}

}
