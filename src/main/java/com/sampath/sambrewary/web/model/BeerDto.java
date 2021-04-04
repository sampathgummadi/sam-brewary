package com.sampath.sambrewary.web.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
	
     private UUID uid;
     private String beerName;
     private String beerStyle;
     private Long upc;
     
}
