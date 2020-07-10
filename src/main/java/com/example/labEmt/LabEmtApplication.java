package com.example.labEmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class LabEmtApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabEmtApplication.class, args);
		Map<Class<?>, Object> container = createContainer();
		OrderService orderService = (OrderService) container.get(OrderService.class);

		CustomerOrder customerOrder = new CustomerOrder();
		int orderId = 1;
		customerOrder.setOrderId(orderId);
		List<OrderItem> orderItems = new ArrayList<OrderItem>();
		orderItems.add(new OrderItem(1, 2, 3, 1));
		orderItems.add(new OrderItem(2, 1, 1, 1));
		orderItems.add(new OrderItem(3, 4, 11, 21));
		customerOrder.setOrderItems(orderItems);
		customerOrder.setPaymentMethod("PayPal");
		customerOrder.setAddress("Full address here");
		orderService.placeOrder(customerOrder);


	}
	public static Map<Class<?>, Object> createContainer() {
		EventBus eventBus = ServiceLoader.load(EventBus.class).findFirst().get();
		CustomerOrderRepository customerOrderRepository = ServiceLoader.load(CustomerOrderRepository.class).findFirst().get();
		OrderService orderService = ServiceLoader.load(OrderService.class).findFirst().get();
		orderService.setEventBus(eventBus);
		orderService.setOrderRepository(customerOrderRepository);
		HashMap<Class<?>, Object> container = new HashMap<>();
		container.put(OrderService.class, orderService);
		return container;
	}

}
