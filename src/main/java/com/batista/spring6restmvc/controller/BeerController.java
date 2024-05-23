package com.batista.spring6restmvc.controller;

import com.batista.spring6restmvc.service.BeerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Slf4j
@AllArgsConstructor
@Controller
public class BeerController {
    private final BeerService beerService;

    public void getBeerByID(){
        log.debug("In controller");
        System.out.println("SOUT: " + beerService.getById(UUID.randomUUID()));
    }
}
