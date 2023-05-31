package nestorcicardini.D3test.entities;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@NoArgsConstructor
@ToString
@Slf4j
public class Menu {
	private List<Product> productList = new ArrayList<>();

	public void printMenu() {
		this.productList.forEach(p -> log.info(p.toString()));
	}

}
