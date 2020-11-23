package hm.app.msqldemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hm.app.msqldemo.controller.common.CrudController;
import hm.app.msqldemo.domain.OrderDetail;
import hm.app.msqldemo.service.common.CrudService;

@RestController
@RequestMapping("/orderdetail")
public class OrderDetailController extends CrudController<OrderDetail, Long> {

    public OrderDetailController(CrudService<OrderDetail, Long> service) {
        super(service);
    }

}
