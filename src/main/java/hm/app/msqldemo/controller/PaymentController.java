package hm.app.msqldemo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hm.app.msqldemo.domain.Payment;
import hm.app.msqldemo.service.PaymentService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/payment")
public class PaymentController {
    
    private PaymentService service;

    @GetMapping
    public List<Payment> getAll() {
        return service.findAll();
    }
}
