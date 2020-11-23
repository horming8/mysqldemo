package hm.app.msqldemo.service;

import java.util.List;

import hm.app.msqldemo.domain.Product;

public interface ProductService {
    List<Product> findAll();
}
