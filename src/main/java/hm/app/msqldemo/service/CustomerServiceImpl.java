package hm.app.msqldemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import hm.app.msqldemo.domain.Customer;
import hm.app.msqldemo.repository.CustomerRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository repository;

    @Override
    public List<Customer> findAll() {
        return repository.findAll();
    }
    
}
