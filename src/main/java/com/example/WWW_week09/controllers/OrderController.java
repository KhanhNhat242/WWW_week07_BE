package com.example.WWW_week09.controllers;

import com.example.WWW_week09.models.*;
import com.example.WWW_week09.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
@CrossOrigin("http://127.0.0.1:5173")
public class OrderController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private OrderService orderService;
    @Autowired
    private OrderDetailService orderDetailService;
    @Autowired
    private ProductService productService;
    private Employee currentEmployee;
    private Customer currentCustomer;
    private Order currentOrder;

    @PostMapping("/addCustomer")
    public void addCustomer(@RequestBody Customer customer){
        customerService.createOrUpdate(customer);
        currentCustomer = customer;
    }

    @PostMapping("/addOrder")
    public void addOrder(){
        LocalDateTime currentDate = LocalDateTime.now();

        currentEmployee = employeeService.findById(555);

        currentOrder = new Order(currentDate, currentEmployee, currentCustomer);
        orderService.createOrUpdate(currentOrder);
    }

    @PostMapping( "/addOrderDetail")
    public void addOrderDetail(@RequestParam double quantity, @RequestParam double price, @RequestParam String note, @RequestParam long id){
        System.out.println(currentOrder);

        Product currentProduct = productService.findOne(id);

        OrderDetail od = new OrderDetail(quantity, price, note, currentOrder, currentProduct);

        orderDetailService.createOrUpdate(od);
    }
}
