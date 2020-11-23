package hm.app.msqldemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hm.app.msqldemo.controller.common.CrudController;
import hm.app.msqldemo.domain.Customer;
import hm.app.msqldemo.service.common.CrudService;

@RestController
@RequestMapping("/customer")
public class CustomerController extends CrudController<Customer, Long> {

    public CustomerController(CrudService<Customer, Long> service) {
        super(service);
    }

}
