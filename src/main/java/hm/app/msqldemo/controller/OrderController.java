package hm.app.msqldemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hm.app.msqldemo.controller.common.CrudController;
import hm.app.msqldemo.domain.Order;
import hm.app.msqldemo.service.common.CrudService;

@RestController
@RequestMapping("/order")
public class OrderController extends CrudController<Order, Long> {

    public OrderController(CrudService<Order, Long> service) {
        super(service);
    }

}
