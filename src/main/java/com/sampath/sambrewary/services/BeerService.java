package com.sampath.sambrewary.services;

import java.util.UUID;

import com.sampath.sambrewary.web.model.BeerDto;

public interface BeerService {
    
	BeerDto getBeerById(UUID beerId);
}
