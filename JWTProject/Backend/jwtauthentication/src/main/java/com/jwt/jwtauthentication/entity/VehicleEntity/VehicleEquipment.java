package com.jwt.jwtauthentication.entity.VehicleEntity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "vehicleEquipment")
@Data
public class VehicleEquipment
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "equipmentId",nullable = false)
    private Long equipmentID;

    @Column(name = "equipmentName",nullable = false)
    private String equipmentName;

    @Column(name = "modelId",nullable = false)
    private Long modelId;

    @Column(name = "engineId",nullable = false)
    private Long engineId;

    @Column(name = "price",nullable = false)
    private int price;

    @Column(name = "lastUpdatedby")
    private String lastUpdatedby;

    @Column(name = "lastUpdatedtime")
    private Timestamp lastUpdatedtime;

    @OneToOne
    private VehicleModel vehicleModel;

    @OneToOne
    private VehicleEngine vehicleEngine;

    @OneToOne(mappedBy = "vehicleEquipment")
    private VehicleTransaction vehicleTransaction;
}
