package com.toystore.repository;

import org.springframework.data.repository.CrudRepository;
import com.toystore.entity.*;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}