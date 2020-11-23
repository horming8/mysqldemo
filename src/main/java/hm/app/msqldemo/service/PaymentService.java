package hm.app.msqldemo.service;

import org.springframework.stereotype.Service;

import hm.app.msqldemo.domain.Payment;
import hm.app.msqldemo.repository.PaymentRepository;
import hm.app.msqldemo.service.common.CrudService;

@Service
public class PaymentService extends CrudService<Payment, Long> {

    public PaymentService(PaymentRepository repository) {
        super(repository);
    }

}
