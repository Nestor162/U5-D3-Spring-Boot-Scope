package nestorcicardini.D3test.toppings;

import nestorcicardini.D3test.entities.Consummation;

public class SalamiTopping extends ToppingsDecorator {
	public SalamiTopping(Consummation c) {
		super(c);
		this.name = "Salami";
		this.price = 0.99;
		this.calories = 86;

	}
}
