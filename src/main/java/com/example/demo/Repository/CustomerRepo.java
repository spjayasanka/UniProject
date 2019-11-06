package com.example.demo.Repository;

import com.example.demo.Entity.Customer;
import com.example.demo.Entity.Designer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepo extends CrudRepository<Customer, Integer> {
    List<Customer> findById(int id);
}
