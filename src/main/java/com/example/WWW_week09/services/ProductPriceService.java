package com.example.WWW_week09.services;

import com.example.WWW_week09.models.ProductPrice;
import com.example.WWW_week09.repositories.ProductPriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductPriceService {
    @Autowired
    private ProductPriceRepository productPriceRepository;

    public void createOrUpdate(ProductPrice pr){
        productPriceRepository.save(pr);
    }
    public List<ProductPrice> findAll() {
        return productPriceRepository.findAll();
    }
    public ProductPrice findOne(long id){
        return productPriceRepository.findById(id).get();
    }
}
