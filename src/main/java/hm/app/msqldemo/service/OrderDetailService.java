package hm.app.msqldemo.service;

import org.springframework.stereotype.Service;

import hm.app.msqldemo.domain.OrderDetail;
import hm.app.msqldemo.repository.OrderDetailRepository;
import hm.app.msqldemo.service.common.CrudServiceImpl;

@Service
public class OrderDetailService extends CrudServiceImpl<OrderDetail, Long> {

    public OrderDetailService(OrderDetailRepository repository) {
        super(repository);
    }

}
