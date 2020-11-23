package hm.app.msqldemo.service;

import java.util.List;

import hm.app.msqldemo.domain.Office;

public interface OfficeService {
    List<Office> findAll();
}
