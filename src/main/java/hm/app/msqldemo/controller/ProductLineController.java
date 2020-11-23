package hm.app.msqldemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hm.app.msqldemo.controller.common.CrudController;
import hm.app.msqldemo.domain.ProductLine;
import hm.app.msqldemo.service.common.CrudService;

@RestController
@RequestMapping("/productline")
public class ProductLineController extends CrudController<ProductLine, String> {

    public ProductLineController(CrudService<ProductLine, String> service) {
        super(service);
    }

}
