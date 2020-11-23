package hm.app.msqldemo.service;

import org.springframework.stereotype.Service;

import hm.app.msqldemo.domain.Order;
import hm.app.msqldemo.repository.OrderRepository;
import hm.app.msqldemo.service.common.CrudService;

@Service
public class OrderService extends CrudService<Order, Long> {

    public OrderService(OrderRepository repository) {
        super(repository);
    }

}
