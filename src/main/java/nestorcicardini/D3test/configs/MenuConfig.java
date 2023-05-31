package nestorcicardini.D3test.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import nestorcicardini.D3test.entities.Consummation;
import nestorcicardini.D3test.entities.Menu;
import nestorcicardini.D3test.entities.drinks.Drink;
import nestorcicardini.D3test.entities.drinks.Lemonade;
import nestorcicardini.D3test.entities.drinks.Water;
import nestorcicardini.D3test.entities.drinks.Wine;
import nestorcicardini.D3test.entities.merchandise.Gadget;
import nestorcicardini.D3test.entities.merchandise.Gadget.gadgetType;
import nestorcicardini.D3test.entities.merchandise.Shirt;
import nestorcicardini.D3test.entities.pizzas.Pizza;
import nestorcicardini.D3test.toppings.HamTopping;
import nestorcicardini.D3test.toppings.OnionTopping;
import nestorcicardini.D3test.toppings.PineappleTopping;
import nestorcicardini.D3test.toppings.SalamiTopping;

public class MenuConfig {
	@Scope("singleton")
	@Bean
	Menu getPizzaMenu() {
		Menu menuPizza = new Menu();
		menuPizza.getProductList().add(getMargerita());
		menuPizza.getProductList().add(getHawaiianPizza());
		menuPizza.getProductList().add(getSalamiPizza());
		menuPizza.getProductList().add(getHamPizza());
		menuPizza.getProductList().add(getLemonade());
		return menuPizza;
	}

	@Scope("singleton")
	@Bean
	Menu getDrinkMenu() {
		Menu menuDrink = new Menu();
		menuDrink.getProductList().add(getLemonade());
		menuDrink.getProductList().add(getWater());
		menuDrink.getProductList().add(getWine());

		return menuDrink;
	}

	@Scope("singleton")
	@Bean
	Menu getFranchiseMenu() {
		Menu menuFranchise = new Menu();
		menuFranchise.getProductList().add(getShirt());
		menuFranchise.getProductList().add(getMug());

		return menuFranchise;
	}

	@Bean
	Consummation getMargerita() {
		return new Pizza();
	}

	@Bean
	Consummation getHawaiianPizza() {
		return new PineappleTopping(new HamTopping(new Pizza()));
	}

	@Bean
	Consummation getSalamiPizza() {
		return new SalamiTopping((new Pizza()));
	}

	@Bean
	Consummation getHamPizza() {
		return new HamTopping(new Pizza());
	}

	@Bean
	Consummation getOnionsPizza() {
		return new OnionTopping(new Pizza());
	}

	@Bean
	Consummation getOnionsHamPizza() {
		return new HamTopping(new OnionTopping(new Pizza()));
	}

	@Bean
	Drink getLemonade() {
		return new Lemonade(0.33);
	}

	@Bean
	Drink getWine() {
		return new Wine(0.75);
	}

	@Bean
	Drink getWater() {
		return new Water(0.5);
	}

	@Bean
	Gadget getShirt() {
		return new Shirt(gadgetType.shirt);
	}

	@Bean
	Gadget getMug() {
		return new Shirt(gadgetType.mug);
	}

}
