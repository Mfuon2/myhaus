package com.estate.repository;

import com.estate.entity.Property;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;
import jakarta.inject.Singleton;

@Repository
@Singleton
public interface PropertyRepository extends JpaRepository<Property, Long> {
}
