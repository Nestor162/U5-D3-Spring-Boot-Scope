package nestorcicardini.D3test.entities;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Order {
	private int orderNumber;
	private List<Product> menuItems;
	private OrderStatus orderStatus;
	private int occupancy;
	private String orderTime;
	private double totalAmount;
	private double occupancyPrice;
	private Table table;
	private String notes;

	public enum OrderStatus {
		READY, IN_PROGRESS, SERVED
	}

	public Order(List<Product> orederedItems, int orderNumber,
			OrderStatus orderStatus, int occupancy, String orderTime,
			double occupancyPrice, Table table, String notes) {
		super();
		this.orderNumber = orderNumber;
		this.orderStatus = orderStatus;
		this.occupancy = occupancy;
		this.orderTime = orderTime;
		this.occupancyPrice = occupancyPrice;
		this.table = table;
		this.menuItems = orederedItems;
		this.notes = notes;
	}

	@Override
	public String toString() {
		return "Order [orderNumber=" + orderNumber + ", menuItems=" + menuItems
				+ ", orderStatus=" + orderStatus + ", occupancy=" + occupancy
				+ ", orderTime=" + orderTime + ", totalAmount=" + totalAmount
				+ ", occupancyPrice=" + occupancyPrice + ", table=" + table
				+ ", notes=" + notes + "]";
	}

}
