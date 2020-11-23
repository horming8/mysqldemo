package hm.app.msqldemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import hm.app.msqldemo.domain.OrderDetail;
import hm.app.msqldemo.repository.OrderDetailRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class OrderDetailServiceImpl implements OrderDetailService {

    private OrderDetailRepository repository;

    @Override
    public List<OrderDetail> findAll() {
        return repository.findAll();
    }

}
