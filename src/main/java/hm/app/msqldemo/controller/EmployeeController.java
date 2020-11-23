package hm.app.msqldemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hm.app.msqldemo.controller.common.CrudController;
import hm.app.msqldemo.domain.Employee;
import hm.app.msqldemo.service.common.CrudService;

@RestController
@RequestMapping("/employee")
public class EmployeeController extends CrudController<Employee, Long> {

    public EmployeeController(CrudService<Employee, Long> service) {
        super(service);
    }

}
