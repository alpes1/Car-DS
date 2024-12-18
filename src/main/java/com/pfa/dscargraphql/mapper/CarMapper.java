package com.pfa.dscargraphql.mapper;

import com.pfa.dscargraphql.dao.entities.Car;
import com.pfa.dscargraphql.dto.CarDTO;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component

public class CarMapper {

    private ModelMapper mapper = new ModelMapper();



    public Car fromCarDtoToCar(CarDTO carDto)
    {
        return mapper.map(carDto,Car.class);
    }


       public CarDTO fromCarToCarDto(Car car)
    {
        return mapper.map(car,CarDTO.class);
    }


}
