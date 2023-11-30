package com.example.WWW_week09.services;

import com.example.WWW_week09.models.OrderDetail;
import com.example.WWW_week09.repositories.OrderDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailService {
    @Autowired
    private OrderDetailRepository orderDetailRepository;

    public void createOrUpdate(OrderDetail orderDetail){
        orderDetailRepository.save(orderDetail);
    }
}
