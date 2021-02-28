package fr.formation;

import java.util.List;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RestaurantSteps {

	Commande commande;

	@Given("le menu contient les plats suivants$")
	public void le_menu_contient_les_plats_suivants(final List<Plat> plats) {
		commande = new Commande(plats);
	}

	@When("le client commande (\\d+) (.+)$")
	public void le_client_commande(final Integer qte, final String nomPlat) {
		commande.commandePlat(nomPlat, qte);
	}

	@And("le client a une reduction de (\\d+\\.\\d+) euros$")
	public void le_client_a_une_reduction_de(final double red) {
		commande.reduction(red);
	}

	@Then("le montant total devrait être (\\d+\\.\\d+)$")
	public void le_montant_total_devrait_etre(final double montant) {
		Assert.assertEquals(montant, commande.getPrix(), 0.01);
	}

}
