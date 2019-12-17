package com.dinodelivery.project.service;

import com.dinodelivery.project.object.Order;
import com.dinodelivery.project.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order getOrderByUserId(Integer id) {
        return orderRepository.getOrderById(id);
    }
}
