package com.example.WWW_week09.controllers;

import com.example.WWW_week09.models.Product;
import com.example.WWW_week09.models.ProductImage;
import com.example.WWW_week09.models.ProductPrice;
import com.example.WWW_week09.services.ProductImageService;
import com.example.WWW_week09.services.ProductPriceService;
import com.example.WWW_week09.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://127.0.0.1:5173")
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private ProductPriceService productPriceService;
    @Autowired
    private ProductImageService productImageService;
    private Product currentProduct;

    @GetMapping("/getAllProducts")
    public List<Product> findAll(){
        return productService.findAll();
    }

    @PostMapping("/addProduct")
    public void addProduct(@RequestBody Product p){
        productService.createOrUpdate(p);
        currentProduct = p;
    }
    @PostMapping("/deleteProduct")
    public void deleteProduct(long id){
        productService.delete(id);
    }
    @PostMapping("/addProductPrice")
    public void addProductPrice(@RequestBody ProductPrice pr){
        ProductPrice prdp = new ProductPrice(currentProduct, pr.getPrice_date_time(), pr.getPrice(), pr.getNote());
        productPriceService.createOrUpdate(prdp);
    }
    @PostMapping("/addProductImage")
    public void addProductImage(@RequestBody ProductImage productImage){
        ProductImage prdi = new ProductImage(productImage.getPath(), productImage.getAlternative(), currentProduct);
        productImageService.createOrUpdate(prdi);
    }
}
