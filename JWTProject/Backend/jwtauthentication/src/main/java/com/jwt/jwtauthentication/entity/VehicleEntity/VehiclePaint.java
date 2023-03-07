package com.jwt.jwtauthentication.entity.VehicleEntity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "vehiclePaint")
@Data
public class VehiclePaint
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "paintID",nullable = false)
    private Long paintId;

    @Column(name = "paintName",nullable = false)
    private String paintName;

    @Column(name = "paintType",nullable = false)
    private String paintType;

    @Column(name = "modelId",nullable = false)
    private Long modelId;

    @Column(name = "price",nullable = false)
    private int price;

    @Column(name = "lastupdatedby")
    private String lastUpdatedBy;

    @Column(name = "lastUpdatedtime")
    private Timestamp lastUpdatedtime;

    @OneToOne(mappedBy = "vehiclePaint")
    private VehicleTransaction vehicleTransaction;


    @OneToOne
    private VehicleModel vehicleModel;

}
