	package fr.formation;
	
	import org.junit.runner.RunWith;
	
	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;
	
	@RunWith(Cucumber.class)
	@CucumberOptions(
	        features = {"classpath:plats.feature"}
	)
	public class RestaurantTest {
	
	}

	
	