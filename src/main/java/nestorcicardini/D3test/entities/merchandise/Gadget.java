package nestorcicardini.D3test.entities.merchandise;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import nestorcicardini.D3test.entities.Product;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class Gadget extends Product {
	private String type;
}
