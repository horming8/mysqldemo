package hm.app.msqldemo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hm.app.msqldemo.domain.OrderDetail;
import hm.app.msqldemo.service.OrderDetailService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/orderdetail")
public class OrderDetailController {
    
    private OrderDetailService service;

    @GetMapping
    public List<OrderDetail> getAll() {
        return service.findAll();
    }
    
}
