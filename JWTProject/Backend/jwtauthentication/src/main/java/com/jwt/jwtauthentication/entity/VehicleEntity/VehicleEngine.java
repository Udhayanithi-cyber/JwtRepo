package com.jwt.jwtauthentication.entity.VehicleEntity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "vehicleEngine")
@Data
public class VehicleEngine
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "engineId",nullable = false)
    private Long engineId;

    @Column(name = "engineName",nullable = false)
    private String engineName;

    @Column(name = "modelId",nullable = false)
    private Long modelId;

    @Column(name = "price",nullable = false)
    private int price;

    @Column(name = "lastUpdatedby")
    private String lastUpdatedby;

    @Column(name = "lastUpdatedtime")
    private Timestamp lastUpdatedtime;

    @OneToOne
    private VehicleModel vehicleModel;

    @OneToOne(mappedBy = "vehicleEngine")
    private VehicleLine vehicleLine;

    @OneToOne(mappedBy = "vehicleEngine")
    private VehicleEquipment vehicleEquipment;

    @OneToOne(mappedBy = "vehicleEngine")
    private VehicleTransaction vehicleTransaction;
}
