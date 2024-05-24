package com.batista.spring6restmvc.controller;

import com.batista.spring6restmvc.model.Beer;
import com.batista.spring6restmvc.service.BeerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;
import java.util.UUID;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping(value = "/api/v1/beer")
public class BeerController {
    private final BeerService beerService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Beer> getBeers(){
        return beerService.getBeers();
    }

    @RequestMapping(value = "{beerId}", method = RequestMethod.GET)
    public Beer getBeerByID(@PathVariable("beerId") UUID id){
        log.debug("In controller");
        return beerService.getById(id);
    }
}
