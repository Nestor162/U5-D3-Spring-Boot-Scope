package nestorcicardini.D3test.entities.drinks;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nestorcicardini.D3test.entities.Consummation;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public abstract class Drink extends Consummation {
	private double size;

	@Override
	public String toString() {
		return name + " " + size + ", calories=" + calories + ", price=" + price
				+ "]";
	}

}
