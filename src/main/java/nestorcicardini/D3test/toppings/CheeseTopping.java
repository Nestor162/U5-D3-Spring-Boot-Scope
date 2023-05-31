package nestorcicardini.D3test.toppings;

import nestorcicardini.D3test.entities.Consummation;

public class CheeseTopping extends ToppingsDecorator {
	public CheeseTopping(Consummation c) {
		super(c);
		this.name = "Cheese";
		this.price = 0.69;
		this.calories = 92;

	}
}
