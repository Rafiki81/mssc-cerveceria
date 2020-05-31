package com.rafiki.mssccerveceria.web.services;

import com.rafiki.mssccerveceria.web.model.BeerDto;
import com.rafiki.mssccerveceria.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID beerId);
}
