package nestorcicardini.D3test.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import nestorcicardini.D3test.configs.MenuConfig;
import nestorcicardini.D3test.entities.Menu;

@Component
@Slf4j
public class MenuRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				MenuConfig.class);
		System.out.println();
		log.info("Benvenuti su Godfather's Pizza!");
		log.info("::::::::::::::::::::::: Menu ::::::::::::::::::::::::::");
		System.out.println();
		log.info("--- Pizzas ---");
		Menu menuPizza = (Menu) ctx.getBean("getPizzaMenu");
		menuPizza.printMenu();

		System.out.println();
		log.info("--- Drinks ---");
		Menu menuDrink = (Menu) ctx.getBean("getDrinkMenu");
		menuDrink.printMenu();

		System.out.println();
		log.info("--- Franchise ---");
		Menu franchisePizza = (Menu) ctx.getBean("getFranchiseMenu");
		franchisePizza.printMenu();

		ctx.close();

	}

}
