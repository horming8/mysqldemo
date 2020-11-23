package hm.app.msqldemo.service;

import org.springframework.stereotype.Service;

import hm.app.msqldemo.domain.Customer;
import hm.app.msqldemo.repository.CustomerRepository;
import hm.app.msqldemo.service.common.CrudService;

@Service
public class CustomerService extends CrudService<Customer, Long> {

    public CustomerService(CustomerRepository repository) {
        super(repository);
    }

}
