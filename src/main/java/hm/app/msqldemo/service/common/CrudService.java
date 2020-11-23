package hm.app.msqldemo.service.common;

import java.util.List;

public interface CrudService<T, ID> {

    List<T> findAll();

    List<T> findAllById(ID... ids);

}
