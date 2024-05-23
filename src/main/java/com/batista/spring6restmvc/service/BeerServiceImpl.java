package com.batista.spring6restmvc.service;

import com.batista.spring6restmvc.model.Beer;
import com.batista.spring6restmvc.model.BeerStyle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public Beer getById(UUID id) {
        log.debug("IN Service");
        return Beer.builder().
                id(id).
                version(123).
                beerName("Sagres").
                bearStyle(BeerStyle.ALE).
                upc("bla bla").
                quantityOnHand(5).
                price(new BigDecimal("12.99")).
                createdDate(LocalDateTime.now()).
                updatedDate(LocalDateTime.now()).
                build();
    }
}
