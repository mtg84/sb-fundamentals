package com.pluralsight.repository;

import com.pluralsight.entity.Release;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ReleaseRepository extends JpaRepository<Release, Long> {
}