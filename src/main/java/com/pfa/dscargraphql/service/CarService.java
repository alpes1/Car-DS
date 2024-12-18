package com.pfa.dscargraphql.service;

import com.pfa.dscargraphql.dto.CarDTO;

import java.util.List;

public interface CarService {

    public CarDTO save(CarDTO carDTO) ;

    public List<CarDTO> getCarByModel(String model) ;
}
