package com.example.WWW_week09.services;

import com.example.WWW_week09.models.Product;
import com.example.WWW_week09.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public void createOrUpdate(Product p){
        productRepository.save(p);
    }

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public void delete(long id){
        productRepository.deleteById(id);
    }

    public Product findOne(long id){
        return productRepository.findById(id).get();
    }
}
