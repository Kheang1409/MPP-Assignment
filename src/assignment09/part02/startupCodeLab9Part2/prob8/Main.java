package assignment09.part02.startupCodeLab9Part2.prob8;

import assignment02.Prob2B.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
	List<OrderItem> orderItems = new ArrayList<>();
	public static void main(String[] args) {
		Main m = new Main();
		m.loadOrderItemData();
		System.out.println("Do any of these Order Items have an order of flowers? " + 
		   m.findProduct("Flowers"));
	}
	
	private boolean findProduct(String prodName) {

//		boolean result = orderItems.stream()
//							.map(OrderItem -> Optional.ofNullable(OrderItem))
//							.map(optionalOrderItem -> optionalOrderItem.map(OrderItem::getProduct))
//							.map(optionalProduct -> optionalProduct.map(Product::getProductName))
//							.filter(optionalProName -> optionalProName.orElse("").equals(prodName))
//							.findFirst()
//							.isPresent();
//
//		return result;

		return orderItems.stream()
				.map(Optional::ofNullable)
				.filter(optionOrderItem -> optionOrderItem
						.map(OrderItem::getProduct)
						.map(Product::getProductName)
						.orElse("")
						.equals(prodName))
				.findAny()
				.isPresent();

//		return orderItems.stream()
//				.map(Optional::ofNullable)
//				.anyMatch(optionOrderItem -> optionOrderItem
//						.map(OrderItem::getProduct)				//map
//						.map(Product::getProductName)			//map
//						.orElse("")								//map
//						.equals(prodName));						//condition
	}

	private void loadOrderItemData() {
		orderItems.add(new OrderItem(new Product(null, null, 0.0), 0));
		orderItems.add(new OrderItem(new Product("1016", "Tools", 131.00), 3));
		orderItems.add(new OrderItem(new Product("1017", "Fishing Rod", 111.00), 1));
		orderItems.add(new OrderItem(new Product("1018", "Game of Go",66.00), 2));
		orderItems.add(new OrderItem(new Product("1019", "Flowers", 221.00), 5));
	}
}
