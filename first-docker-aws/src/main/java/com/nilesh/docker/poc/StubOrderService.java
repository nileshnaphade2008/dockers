package com.nilesh.docker.poc;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;


@Component("orderService")
public class StubOrderService implements OrderService {

	private Map<Integer, Order> orders = new HashMap<>();

	private final AtomicInteger idGen = new AtomicInteger();

	@Override
	public Order getOrder(int orderId) {
		return orders.get(orderId);
	}

	@Override
	public void updateOrder(Order order) {
		int id = order.getId();
		orders.remove(id);
		orders.put(id, order);
	}

	@Override
	public String createOrder(Order order) {
		int id = idGen.incrementAndGet();
		order.setId(id);
		orders.put(id, order);
		return "" + id;
	}

	@Override
	public void cancelOrder(int orderId) {
		orders.remove(orderId);
	}

	@PostConstruct
	public void setupStubOrders() {
		Order order = new Order();
		order.setAmount(100);
		order.setPartName("Laptop Screen");
		order.setCustomerName("HP");
		createOrder(order);

		order = new Order();
		order.setAmount(1233);
		order.setPartName("Laptop Case");
		order.setCustomerName("Dell");
		createOrder(order);
	}
}