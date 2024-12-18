package com.pfa.dscargraphql.dto;

import lombok.*;

@Getter
@Setter

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CarDTO {

    private String model ;
    private String color;
    private String matricul;
    private double price;

}
