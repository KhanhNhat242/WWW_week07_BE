package com.example.WWW_week09.services;

import com.example.WWW_week09.models.Customer;
import com.example.WWW_week09.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public void createOrUpdate(Customer c){
        customerRepository.save(c);
    }
}
