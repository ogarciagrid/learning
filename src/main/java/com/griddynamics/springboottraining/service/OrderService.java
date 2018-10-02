package com.griddynamics.springboottraining.service;

import com.griddynamics.springboottraining.model.Order;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Validated
public interface OrderService {

    @NotNull Iterable<Order> getAllOrders();

    Order createOrder(@NotNull(message = "Order cannot be null") @Valid Order order);

    void updateOrder(@NotNull(message = "Order cannot be null") @Valid Order order);
}
