package com.car.carservices.dto;

import lombok.Data;

@Data
public class CarDetailsDTO {
    private Long carId;
    private Long userId;
    private String carBrand;
    private String carModel;
    private String vinNumber;
    private String plateNumber;
}