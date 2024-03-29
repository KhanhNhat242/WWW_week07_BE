package com.example.WWW_week09.pks;

import com.example.WWW_week09.models.Order;
import com.example.WWW_week09.models.Product;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter @Getter
public class OrderDetailPK implements Serializable {
    private Order order;
    private Product product;
}
