package hm.app.msqldemo.controller;

import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hm.app.msqldemo.controller.common.CrudController;
import hm.app.msqldemo.domain.Customer;
import hm.app.msqldemo.domain.Order;
import hm.app.msqldemo.service.CustomerService;
import hm.app.msqldemo.service.common.CrudService;

@RestController
@RequestMapping("/customer")
public class CustomerController extends CrudController<Customer, Long> {

    private CustomerService customerService;

    public CustomerController(CrudService<Customer, Long> service) {
        super(service);
        customerService = (CustomerService) service;
    }

    @GetMapping("/orders/{id}")
    public Set<Order> getOrdersByCustomerNumber(@PathVariable Long id) {
        return customerService.getOrdersByCustomerNumber(id);
    }

}
