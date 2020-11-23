package hm.app.msqldemo.service;

import org.springframework.stereotype.Service;

import hm.app.msqldemo.domain.OrderDetail;
import hm.app.msqldemo.repository.OrderDetailRepository;
import hm.app.msqldemo.service.common.CrudService;

@Service
public class OrderDetailService extends CrudService<OrderDetail, Long> {

    public OrderDetailService(OrderDetailRepository repository) {
        super(repository);
    }

}
