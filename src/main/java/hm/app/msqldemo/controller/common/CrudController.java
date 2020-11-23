package hm.app.msqldemo.controller.common;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import hm.app.msqldemo.service.common.CrudService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class CrudController<T, ID> {

    private CrudService<T, ID> service;

    @GetMapping
    public List<T> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public List<T> get(@PathVariable ID id) {
        return service.findAllById(id);
    }

}
