package com.estate.repository;

import com.estate.entity.Address;
import io.micronaut.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
