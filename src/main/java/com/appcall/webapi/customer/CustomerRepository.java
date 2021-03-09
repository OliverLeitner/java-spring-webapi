package com.appcall.webapi.customer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
interface CustomerRepository extends JpaRepository<Customer, Long> {
    @Override
    @Query(value="select * from customers", nativeQuery = true)
    public List<Customer> findAll();
}