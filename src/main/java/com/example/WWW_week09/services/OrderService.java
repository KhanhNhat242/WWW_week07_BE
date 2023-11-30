package com.example.WWW_week09.services;

import com.example.WWW_week09.models.Order;
import com.example.WWW_week09.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public void createOrUpdate(Order o){
        orderRepository.save(o);
    }
}
