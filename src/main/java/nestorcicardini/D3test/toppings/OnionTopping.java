package nestorcicardini.D3test.toppings;

import nestorcicardini.D3test.entities.Consummation;

public class OnionTopping extends ToppingsDecorator {
	public OnionTopping(Consummation c) {
		super(c);
		this.name = "Onion";
		this.price = 0.69;
		this.calories = 22;

	}
}
