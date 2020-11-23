package hm.app.msqldemo.service;

import java.util.List;

import hm.app.msqldemo.domain.OrderDetail;

public interface OrderDetailService {
    List<OrderDetail> findAll();
}
