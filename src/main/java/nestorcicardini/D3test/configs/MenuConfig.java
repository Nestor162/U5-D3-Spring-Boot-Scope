package nestorcicardini.D3test.configs;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import nestorcicardini.D3test.entities.Consummation;
import nestorcicardini.D3test.entities.Menu;
import nestorcicardini.D3test.entities.Order;
import nestorcicardini.D3test.entities.Order.OrderStatus;
import nestorcicardini.D3test.entities.Product;
import nestorcicardini.D3test.entities.Table;
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
		menuPizza.getProductList().add(getMargherita());
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

	// PIZZE
	@Scope("singleton")
	@Bean
	Consummation getMargherita() {
		return new Pizza();
	}

	@Scope("singleton")
	@Bean
	Consummation getHawaiianPizza() {
		return new PineappleTopping(new HamTopping(new Pizza()));
	}

	@Scope("singleton")
	@Bean
	Consummation getSalamiPizza() {
		return new SalamiTopping((new Pizza()));
	}

	@Scope("singleton")
	@Bean
	Consummation getHamPizza() {
		return new HamTopping(new Pizza());
	}

	@Scope("singleton")
	@Bean
	Consummation getOnionsPizza() {
		return new OnionTopping(new Pizza());
	}

	@Scope("singleton")
	@Bean
	Consummation getOnionsHamPizza() {
		return new HamTopping(new OnionTopping(new Pizza()));
	}

	// DRINKS

	@Scope("singleton")
	@Bean
	Drink getLemonade() {
		return new Lemonade(0.33);
	}

	@Scope("singleton")
	@Bean
	Drink getWine() {
		return new Wine(0.75);
	}

	@Scope("singleton")
	@Bean
	Drink getWater() {
		return new Water(0.5);
	}

	// MERCHANDISE

	@Scope("singleton")
	@Bean
	Gadget getShirt() {
		return new Shirt(gadgetType.shirt);
	}

	@Scope("singleton")
	@Bean
	Gadget getMug() {
		return new Shirt(gadgetType.mug);
	}

	// TABLES

	@Scope("singleton")
	@Bean
	Table getTable1() {
		Table table = new Table(1, 4, false);
		return table;
	}

	@Scope("singleton")
	@Bean
	Table getTable2() {
		Table table = new Table(2, 2, true);
		return table;
	}

	@Scope("singleton")
	@Bean
	Table getTable3() {
		Table table = new Table(3, 6, false);
		return table;
	}

	// ORDERS
	@Bean
	@Scope("singleton")
	Order Order1() {
		List<Product> productsList = new ArrayList<>();
		productsList.add(getMargherita());
		productsList.add(getLemonade());
		return new Order(productsList, 1, OrderStatus.IN_PROGRESS, 4, "14:30",
				2, getTable1(), "Lemonade without sugar");
	}

	@Bean
	@Scope("singleton")
	Order Order2() {
		List<Product> productsList = new ArrayList<>();
		productsList.add(getSalamiPizza());
		productsList.add(getHawaiianPizza());
		productsList.add(getShirt());
		productsList.add(getWater());
		return new Order(productsList, 2, OrderStatus.READY, 4, "20:20", 2,
				getTable2(), "Sparkling water");

	}
}
