package com.estate.repository;

import com.estate.entity.PropertyImage;
import io.micronaut.data.jpa.repository.JpaRepository;

public interface PropertyFeatureRepository extends JpaRepository<PropertyImage, Long> {}
