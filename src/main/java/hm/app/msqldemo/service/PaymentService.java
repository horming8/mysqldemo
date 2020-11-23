package hm.app.msqldemo.service;

import org.springframework.stereotype.Service;

import hm.app.msqldemo.domain.Payment;
import hm.app.msqldemo.repository.PaymentRepository;
import hm.app.msqldemo.service.common.CrudServiceImpl;

@Service
public class PaymentService extends CrudServiceImpl<Payment, Long> {

    public PaymentService(PaymentRepository repository) {
        super(repository);
    }

}
