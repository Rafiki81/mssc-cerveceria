package com.rafiki.mssccerveceria.web.model;

import lombok.*;

import java.util.UUID;

//Lombok annotations
//Getters,Setters,hashcodes...
//Creates a No args Constructor
//Implement the builder Pattern
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto{

    private UUID beerId;
    private String beerName;
    private String beerStyle;
    private Long upc;


}
