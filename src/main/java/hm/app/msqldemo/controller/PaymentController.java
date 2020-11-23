package hm.app.msqldemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hm.app.msqldemo.controller.common.CrudController;
import hm.app.msqldemo.domain.Payment;
import hm.app.msqldemo.service.common.CrudService;

@RestController
@RequestMapping("/payment")
public class PaymentController extends CrudController<Payment, Long> {

    public PaymentController(CrudService<Payment, Long> service) {
        super(service);
    }

}
