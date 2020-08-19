package com.sreedhar.msscbrewery.mappers;

import com.sreedhar.msscbrewery.domain.Beer;
import com.sreedhar.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto beerDto);
}
