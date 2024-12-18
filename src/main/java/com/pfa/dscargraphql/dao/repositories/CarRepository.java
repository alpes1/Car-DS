package com.pfa.dscargraphql.dao.repositories;

import com.pfa.dscargraphql.dao.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car,Long> {
    @Override
    List<Car> findAll();

    List<Car> findCarByModel(String model);
}
