package com.pluralsight.repository;

import com.pluralsight.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationRepository extends JpaRepository<Application, Long> {
}
