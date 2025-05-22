package com.car.carservices.mapper;

import com.car.carservices.dto.CarDetailsDTO;
import com.car.carservices.entity.CarDetails;
import com.car.carservices.entity.UserRegistration;
import org.springframework.stereotype.Component;

@Component
public class CarDetailsMapper {
    public CarDetailsDTO toDTO(CarDetails car) {
        CarDetailsDTO dto = new CarDetailsDTO();
        dto.setCarId(car.getCarId());
        dto.setUserId(car.getUser().getId());
        dto.setCarBrand(car.getCarBrand());
        dto.setCarModel(car.getCarModel());
        dto.setVinNumber(car.getVinNumber());
        dto.setPlateNumber(car.getPlateNumber());
        return dto;
    }

    public CarDetails toEntity(CarDetailsDTO dto, UserRegistration user) {
        CarDetails car = new CarDetails();
        car.setUser(user);
        car.setCarBrand(dto.getCarBrand());
        car.setCarModel(dto.getCarModel());
        car.setVinNumber(dto.getVinNumber());
        car.setPlateNumber(dto.getPlateNumber());
        return car;
    }
}
