package nestorcicardini.D3test.toppings;

import nestorcicardini.D3test.entities.Consummation;

public class HamTopping extends ToppingsDecorator {
	public HamTopping(Consummation c) {
		super(c);
		this.name = "Ham";
		this.price = 0.99;
		this.calories = 35;

	}
}
