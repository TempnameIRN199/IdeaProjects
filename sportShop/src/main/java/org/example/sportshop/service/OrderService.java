package org.example.sportshop.service;

import org.example.sportshop.entity.*;
import org.example.sportshop.entity.enums.OrderStatus;
import org.example.sportshop.repository.OrderItemRepository;
import org.example.sportshop.repository.OrderRepository;
import org.example.sportshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {

    @Autowired
    private UserService userService;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Autowired
    private ProductRepository productRepository;

    public Order createOrder(ShoppingCart cart, Integer userId) {
        Order order = new Order();
        userService.findUserById(userId).ifPresent(order::setUser);
        order.setOrderDate(new java.sql.Timestamp(new Date().getTime()));
        order.setTotal(BigDecimal.valueOf(cart.getTotal()));
        order.setStatus(OrderStatus.CART);

        Order savedOrder = orderRepository.save(order);

        List<OrderItem> orderItems = cart.getItems().stream().map(item -> {
            OrderItem orderItem = new OrderItem();
            orderItem.setOrder(savedOrder);
            orderItem.setProduct(item.getProduct());
            orderItem.setQuantity(item.getQuantity());
            orderItem.setPrice(item.getProduct().getPrice());

            Product product = item.getProduct();
            int updatedQuantity = product.getQuantity() - item.getQuantity();
            product.setQuantity(updatedQuantity);
            productRepository.save(product);

            return orderItem;
        }).collect(Collectors.toList());

        orderItemRepository.saveAll(orderItems);
        savedOrder.setOrderItems(orderItems);

        return savedOrder;
    }

    public List<Order> findOrdersByUser(User user) {
        return orderRepository.findAllByUser(user);
    }
}
