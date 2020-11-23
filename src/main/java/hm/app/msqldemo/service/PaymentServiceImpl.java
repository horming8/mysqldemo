package hm.app.msqldemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import hm.app.msqldemo.domain.Payment;
import hm.app.msqldemo.repository.PaymentRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class PaymentServiceImpl implements PaymentService {

    private PaymentRepository repository;

    @Override
    public List<Payment> findAll() {
        return repository.findAll();
    }

}
