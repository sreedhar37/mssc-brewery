package com.sreedhar.msscbrewery.services;

import com.sreedhar.msscbrewery.web.model.CustomerDto;
import org.springframework.http.HttpStatus;

import java.util.UUID;

public interface CustomerService {

    CustomerDto getCustomerById(UUID customerId);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void deleteCustomer(UUID customerId);
}
