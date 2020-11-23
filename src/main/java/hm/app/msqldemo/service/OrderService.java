package hm.app.msqldemo.service;

import java.util.List;

import hm.app.msqldemo.domain.Order;

public interface OrderService {
    List<Order> findAll();
}
