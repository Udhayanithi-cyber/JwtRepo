package com.jwt.jwtauthentication.entity.VehicleEntity;

import lombok.Data;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "vehicleLine")
@Data
public class VehicleLine
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lineID",nullable = false)
    private Long lineId;

    @Column(name = "lineName",nullable = false)
    private String lineName;

    @Column(name = "modelId",nullable = false)
    private Long modelId;

    @Column(name = "engineId",nullable = false)
    private Long engineId;

    @Column(name = "price",nullable = false)
    private int price;

    @Column(name = "lastUpdatedby")
    private String lastUpdatedby;

    @Column(name = "lastUdpatedtime")
    private Timestamp lastUpdatedtime;

    @OneToOne(mappedBy = "vehicleLine")
    private VehicleTransaction vehicleTransaction;


    @OneToOne
    private VehicleModel vehicleModel;

    @OneToOne
    private VehicleEngine vehicleEngine;
}
