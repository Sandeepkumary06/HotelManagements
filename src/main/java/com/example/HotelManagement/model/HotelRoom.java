package com.example.HotelManagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Room")
public class HotelRoom {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer roomId;
    @Column(unique = true)
    private Integer roomNum;
    @Enumerated(EnumType.STRING)
    private Type roomType;
    private Double roomPrice;
    @Column(name = "Status")
    private Boolean roomStatus;
}
