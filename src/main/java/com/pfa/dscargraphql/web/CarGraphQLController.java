package com.pfa.dscargraphql.web;

import com.pfa.dscargraphql.dto.CarDTO;
import com.pfa.dscargraphql.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class CarGraphQLController {

    private CarService carService ;

    @MutationMapping
    public CarDTO saveCar(@Argument CarDTO carDTO) {return carService.save(carDTO);}

    @QueryMapping
    public List<CarDTO> getCarByModel(@Argument String model)
    {
        return carService.getCarByModel(model);
    }

}
