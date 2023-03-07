package com.jwt.jwtauthentication.entity.VehicleEntity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "vehicleModel")
@Data
public class VehicleModel
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "modelId",nullable = false)
    private Long modelid;

    @Column(name = "modelName",nullable = false)
    private String modelName;

    @Column(name = "lastUpdatedby")
    private String lastUpdatedby;

    @Column(name = "lastUpdatedtime")
    private Timestamp lastUpdatedtime;

    @OneToOne(mappedBy = "vehicleModel")
    private VehicleBody vehicleBody;

    @OneToOne(mappedBy = "vehicleModel")
    private VehicleEngine vehicleEngine;

    @OneToOne(mappedBy = "vehicleModel")
    private VehicleLine vehicleLine;

    @OneToOne(mappedBy = "vehicleModel")
    private VehicleEquipment vehicleEquipment;

    @OneToOne(mappedBy = "vehicleModel")
    private VehiclePaint vehiclePaint;


    @OneToOne(mappedBy = "vehicleModel")
    private VehicleTransaction vehicleTransaction;
}
