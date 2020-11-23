package hm.app.msqldemo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hm.app.msqldemo.domain.ProductLine;
import hm.app.msqldemo.service.ProductLineService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/productline")
public class ProductLineController {
    
    private ProductLineService service;

    @GetMapping
    public List<ProductLine> getAll() {
        return service.findAll();
    }

}
