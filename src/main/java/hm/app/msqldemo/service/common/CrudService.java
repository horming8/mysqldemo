package hm.app.msqldemo.service.common;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class CrudService<T, ID> {

    protected JpaRepository<T, ID> repository;

    public List<T> findAll() {
        return repository.findAll();
    }

    public T findById(ID id) {
        return repository.findById(id).get();
    }

    public List<T> findAllById(List<ID> ids) {
        return repository.findAllById(ids);
    }

    public List<T> saveAll(List<T> entities) {
        return repository.saveAll(entities);
    }

    public T save(T entity) {
        return repository.save(entity);
    }

    public T saveAndFlush(T entity) {
        return repository.saveAndFlush(entity);
    }

    public void deleteById(ID id) {
        repository.deleteById(id);
    }

    public void flush() {
        repository.flush();
    }

}
