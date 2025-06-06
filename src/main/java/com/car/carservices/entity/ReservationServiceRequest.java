package com.car.carservices.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
public class ReservationServiceRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservationId;

    private Long userId;
    private Long carId;
    private Long serviceId;
    private LocalDate reservationDate;
    private LocalTime reservationTime;
    private String reservationStatus;
}