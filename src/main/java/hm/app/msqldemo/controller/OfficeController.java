package hm.app.msqldemo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hm.app.msqldemo.domain.Office;
import hm.app.msqldemo.service.OfficeService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/office")
public class OfficeController {
    
    private OfficeService service;

    @GetMapping
    public List<Office> getAll() {
        return service.findAll();
    }
}
