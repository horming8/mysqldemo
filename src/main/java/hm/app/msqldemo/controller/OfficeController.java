package hm.app.msqldemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hm.app.msqldemo.controller.common.CrudController;
import hm.app.msqldemo.domain.Office;
import hm.app.msqldemo.service.common.CrudService;

@RestController
@RequestMapping("/office")
public class OfficeController extends CrudController<Office, String> {

    public OfficeController(CrudService<Office, String> service) {
        super(service);
    }

}
