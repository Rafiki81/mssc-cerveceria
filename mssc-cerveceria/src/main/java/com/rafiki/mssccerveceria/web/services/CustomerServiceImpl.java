package com.rafiki.mssccerveceria.web.services;

import com.rafiki.mssccerveceria.web.model.BeerDto;
import com.rafiki.mssccerveceria.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(UUID beerId) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .customerName("Rafiki")
                .build();
    }
}
