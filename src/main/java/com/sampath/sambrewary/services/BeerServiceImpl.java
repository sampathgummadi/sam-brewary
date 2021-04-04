package com.sampath.sambrewary.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.sampath.sambrewary.web.model.BeerDto;

@Service
public class BeerServiceImpl implements BeerService{

	@Override
	public BeerDto getBeerById(UUID beerId) {
		
		return BeerDto.builder().uid(UUID.randomUUID())
				.beerName("KingFisher")
				.beerStyle("Strong")
				.build();
	}

	
}
