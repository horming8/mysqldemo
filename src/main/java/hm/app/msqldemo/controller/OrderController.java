package hm.app.msqldemo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hm.app.msqldemo.domain.Order;
import hm.app.msqldemo.service.OrderService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/order")
public class OrderController {
    
    private OrderService service;

    @GetMapping
    public List<Order> getAll() {
        return service.findAll();
    }
}
