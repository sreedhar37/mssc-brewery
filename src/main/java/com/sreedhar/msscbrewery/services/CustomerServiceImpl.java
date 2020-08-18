package com.sreedhar.msscbrewery.services;

import com.sreedhar.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder().customerId(customerId)
                .name("Sreedhar Sudha").build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        log.info("Saving new customer {}", customerDto);
        return customerDto;
    }

    @Override
    public void deleteCustomer(UUID customerId) {
        log.info("Deleting customer {}", customerId);
    }
}
