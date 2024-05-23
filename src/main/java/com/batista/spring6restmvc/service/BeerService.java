package com.batista.spring6restmvc.service;

import com.batista.spring6restmvc.model.Beer;

import java.util.UUID;

public interface BeerService {
    Beer getById(UUID id);
}
