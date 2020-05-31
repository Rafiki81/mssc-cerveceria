package com.rafiki.mssccerveceria.web.services;

import com.rafiki.mssccerveceria.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
