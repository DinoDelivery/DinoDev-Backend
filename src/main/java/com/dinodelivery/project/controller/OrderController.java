package com.dinodelivery.project.controller;

import com.dinodelivery.project.object.Order;
import com.dinodelivery.project.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.LinkedList;
import java.util.List;

@RestController
public class OrderController {
    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/order")
    public List<Object> getOrder(@Valid @RequestBody Integer id) {
        Order order = orderService.getOrderByUserId(id);
        return getOrd(order);
    }

    private List<Object> getOrd(Order order) {
        List<Object> toUpload = new LinkedList<>();
        try {
            toUpload.add(order.getId());
            toUpload.add(order.getUserId());
            toUpload.add(order.getPrice());
            toUpload.add(order.isCardPayment());
            toUpload.add(order.getDeliveryDate());
            toUpload.add(order.getAddress());
            toUpload.add(order.getClientPhoneNumber());
            return toUpload;
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace() + ": getting Restaurant exception!");
        }

        return toUpload;
    }
}
