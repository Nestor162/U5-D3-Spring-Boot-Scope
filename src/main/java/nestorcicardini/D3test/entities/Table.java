package nestorcicardini.D3test.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Table {
	private int tableNumber;
	private int maxCapacity;
	private boolean occupied;

	enum TableStatus {
		OCCUPIED, AVAILABLE
	}

	public Table(int tableNumber, int maxOccupancy, boolean status) {
		super();
		this.tableNumber = tableNumber;
		this.maxCapacity = maxOccupancy;
		this.occupied = status;
	}

}
