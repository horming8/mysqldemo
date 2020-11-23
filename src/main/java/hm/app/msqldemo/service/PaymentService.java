package hm.app.msqldemo.service;

import java.util.List;

import hm.app.msqldemo.domain.Payment;

public interface PaymentService {
    List<Payment> findAll();
}
