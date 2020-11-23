package hm.app.msqldemo.service;

import java.util.List;

import hm.app.msqldemo.domain.Customer;

public interface CustomerService {
    List<Customer> findAll();
}
