package hm.app.msqldemo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import hm.app.msqldemo.domain.Customer;
import hm.app.msqldemo.service.CustomerService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/customer")
public class CustomerController {
    
    private CustomerService service;

    @GetMapping
    public @ResponseBody List<Customer> getAll() {
        return service.findAll();
    }
}
