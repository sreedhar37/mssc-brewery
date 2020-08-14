package com.sreedhar.msscbrewery.services;

import com.sreedhar.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder().customerId(customerId)
                .name("Sreedhar Sudha").build();
    }
}
