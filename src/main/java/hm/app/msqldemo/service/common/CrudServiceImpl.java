package hm.app.msqldemo.service.common;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.data.jpa.repository.JpaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class CrudServiceImpl<T, ID> implements CrudService<T, ID> {

    private JpaRepository<T, ID> repository;

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    public List<T> findAllById(ID... ids) {
        return repository.findAllById(
                StreamSupport.stream(Spliterators.spliteratorUnknownSize(Arrays.asList(ids).iterator(), 0), false)
                        .collect(Collectors.toList()));
    }

}
