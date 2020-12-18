package hm.app.msqldemo.service;

import java.util.Collections;
import java.util.Optional;
import java.util.Set;

import org.springframework.stereotype.Service;

import hm.app.msqldemo.domain.Customer;
import hm.app.msqldemo.domain.Order;
import hm.app.msqldemo.repository.CustomerRepository;
import hm.app.msqldemo.service.common.CrudService;

@Service
public class CustomerService extends CrudService<Customer, Long> {

    public CustomerService(CustomerRepository repository) {
        super(repository);
    }

    public Set<Order> getOrdersByCustomerNumber(Long id) {
        Optional<Customer> c = repository.findById(id);
        if (c.isPresent()) {
            return c.get().getOrders();
        }
        return Collections.emptySet();
    }
}
