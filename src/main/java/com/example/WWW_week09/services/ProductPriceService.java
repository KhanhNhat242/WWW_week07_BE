package com.example.WWW_week09.services;

import com.example.WWW_week09.models.ProductPrice;
import com.example.WWW_week09.repositories.ProductPriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductPriceService {
    @Autowired
    private ProductPriceRepository productPriceRepository;

    public void createOrUpdate(ProductPrice pr){
        productPriceRepository.save(pr);
    }
}
