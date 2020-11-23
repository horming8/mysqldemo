package hm.app.msqldemo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import hm.app.msqldemo.domain.Employee;
import hm.app.msqldemo.service.EmployeeService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private EmployeeService service;

    @GetMapping
    public @ResponseBody List<Employee> getAll() {
        return service.findAll();
    }
}
