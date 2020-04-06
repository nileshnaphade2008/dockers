package com.nilesh.docker.poc;

public interface OrderService {

	Order getOrder(int orderId);

	void updateOrder(Order order);

	String createOrder(Order order);

	void cancelOrder(int orderId);

}