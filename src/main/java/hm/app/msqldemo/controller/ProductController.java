package hm.app.msqldemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hm.app.msqldemo.controller.common.CrudController;
import hm.app.msqldemo.domain.Product;
import hm.app.msqldemo.service.common.CrudService;

@RestController
@RequestMapping("/product")
public class ProductController extends CrudController<Product, String> {

    public ProductController(CrudService<Product, String> service) {
        super(service);
    }

}
