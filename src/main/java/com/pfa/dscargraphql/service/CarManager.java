package com.pfa.dscargraphql.service;

import com.pfa.dscargraphql.dao.entities.Car;
import com.pfa.dscargraphql.dao.repositories.CarRepository;
import com.pfa.dscargraphql.dto.CarDTO;
import com.pfa.dscargraphql.mapper.CarMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarManager implements CarService{
    public CarManager(CarRepository carRepository, CarMapper carMapper) {
        this.carRepository = carRepository;
        this.carMapper = carMapper;
    }

    private CarRepository carRepository ;
    private CarMapper carMapper ;



    public List<CarDTO> getAllCars() {
        List<Car> cars =carRepository.findAll();
        List<CarDTO> carDTOS = new ArrayList<>();
        for (Car car : cars)
        {
            carDTOS.add(carMapper.fromCarToCarDto(car));
        }
        return carDTOS;
    }

    @Override
    public CarDTO save(CarDTO carDTO) {
        Car car= carMapper.fromCarDtoToCar(carDTO);
        car = carRepository.save(car);
        carDTO = carMapper.fromCarToCarDto(car);
        return carDTO;
    }

    @Override
    public List<CarDTO> getCarByModel(String model) {

        List<Car> cars = carRepository.findCarByModel(model);
        List<CarDTO> carDTO = new ArrayList<>();

        for (Car car : cars )
        {
            carDTO.add(carMapper.fromCarToCarDto(car));
        }

        return carDTO;
    }

}
