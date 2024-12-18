package com.pfa.dscargraphql;

import com.pfa.dscargraphql.dao.entities.Car;
import com.pfa.dscargraphql.dto.CarDTO;
import com.pfa.dscargraphql.service.CarService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DsCarGraphqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(DsCarGraphqlApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CarService carService)
    {
        return args -> {
            List<CarDTO> cars = List.of(
                    CarDTO.builder().model("BMW").color("black").matricul("DDR3").price(1000000f).build(),
                    CarDTO.builder().model("BMW").color("black").matricul("DDR3").price(1000000f).build(),
                    CarDTO.builder().model("BMW").color("black").matricul("DDR3").price(1000000f).build(),
                    CarDTO.builder().model("Audi").color("green").matricul("DDR4").price(100000f).build(),
                    CarDTO.builder().model("Mercedes").color("black").matricul("DDR4").price(100000f).build(),
                    CarDTO.builder().model("Lamborghini").color("red").matricul("DDR5").price(100000f).build()
            );
            for(CarDTO carDTO : cars){
                carService.save(carDTO);
            }
        };
    }
}
