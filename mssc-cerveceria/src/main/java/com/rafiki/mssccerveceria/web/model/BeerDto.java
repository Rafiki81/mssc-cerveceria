package com.rafiki.mssccerveceria.web.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
//Lombok annotations
@Data //Getters,Setters,hashcodes...
@NoArgsConstructor //Creates a No args Constructor
@Builder //Implement the builder Pattern
public class BeerDto {

    private UUID id;
    private String name;
    private String beerStyle;
    private long upc;

}
