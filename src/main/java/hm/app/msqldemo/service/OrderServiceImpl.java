package hm.app.msqldemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import hm.app.msqldemo.domain.Order;
import hm.app.msqldemo.repository.OrderRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class OrderServiceImpl implements OrderService {

    private OrderRepository repository;

    @Override
    public List<Order> findAll() {
        return repository.findAll();
    }
    
}
