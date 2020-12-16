package hm.app.msqldemo.controller.common;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import hm.app.msqldemo.service.common.CrudService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class CrudController<T, ID> {

    protected CrudService<T, ID> service;

    @PostMapping
    public T create(@RequestBody T body) {
        return service.save(body);
    }

    @PutMapping("/{id}")
    public T update(@PathVariable ID id, @RequestBody T body) {
        T entity = service.findById(id);
        if (entity != null) {
            entity = service.save(body);
        }
        return entity;
    }

    @GetMapping
    public List<T> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public T get(@PathVariable ID id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable ID id) {
        service.deleteById(id);
    }

}
