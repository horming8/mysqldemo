package hm.app.msqldemo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hm.app.msqldemo.domain.Product;
import hm.app.msqldemo.service.ProductService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/product")
public class ProductController {
    
    private ProductService service;

    @GetMapping
    public List<Product> getAll() {
        return service.findAll();
    }

}
