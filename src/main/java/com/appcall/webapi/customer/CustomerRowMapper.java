package com.appcall.webapi.customer;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class CustomerRowMapper {
    @Autowired
    CustomerRepository customerRepository;

    @RequestMapping("/customers")
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}