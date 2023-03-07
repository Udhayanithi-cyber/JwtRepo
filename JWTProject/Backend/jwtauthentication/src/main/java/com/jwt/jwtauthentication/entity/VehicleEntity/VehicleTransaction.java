package com.jwt.jwtauthentication.entity.VehicleEntity;


import com.jwt.jwtauthentication.entity.detailsEntity.CustomerDetails;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "vehicleTransaction")
@Data
public class VehicleTransaction
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transactId",nullable = false)
    private Long transactionId;

    @Column(name = "custId",nullable = false)
    private Long custId;

    @Column(name = "modelId",nullable = false)
    private Long modelId;

    @Column(name = "lineId",nullable = false)
    private Long lineId;

    @Column(name = "bodyId",nullable = false)
    private Long bodyId;

    @Column(name = "engineId",nullable = false)
    private Long engineId;

    @Column(name = "equipmentId",nullable = false)
    private Long equipmentId;

    @Column(name = "interiorpaintId",nullable = false)
    private Long interiorPaintId;

    @Column(name = "exteriorpaintId",nullable = false)
    private Long exteriorPaintId;

    @Column(name = "discount")
    private int discount;

    @Column(name = "totalPrice")
    private int totalPrice;

    @Column(name = "lastUpdatedBy")
    private String lastUpdatedBy;

    @Column(name = "lastUpdatedtime")
    private Timestamp lastUpdatedtime;

    @OneToOne
    private CustomerDetails customerDetails;

    @OneToOne
    private VehicleLine vehicleLine;

    @OneToOne
    private VehicleModel vehicleModel;

    @OneToOne
    private VehicleBody vehicleBody;

    @OneToOne
    private VehicleEngine vehicleEngine;

    @OneToOne
    private VehicleEquipment vehicleEquipment;

    @OneToOne
    private VehiclePaint vehiclePaint;

    @OneToOne(mappedBy = "vehicleTransaction")
    private OrderDetails orderDetails;
}
