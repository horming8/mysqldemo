package hm.app.msqldemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import hm.app.msqldemo.domain.Office;

public interface OfficeRepository extends JpaRepository<Office, String> {
    
}
