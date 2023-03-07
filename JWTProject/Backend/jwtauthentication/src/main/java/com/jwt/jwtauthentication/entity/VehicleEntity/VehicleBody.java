package com.jwt.jwtauthentication.entity.VehicleEntity;

import lombok.Data;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "vehicleBody")
@Data
public class VehicleBody
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bodyId",nullable = false)
    private Long bodyId;

    @Column(name = "bodytype",nullable = false)
    private String bodytype;

    @Column(name = "modelId")
    private Long modelId;

    @Column(name = "lastUpdatedby")
    private String lastUpdatedby;

    @Column(name = "lastUpdatedtime")
    private Timestamp lastUpdatedtime;

    @OneToOne
    private VehicleModel vehicleModel;

    @OneToOne(mappedBy = "vehicleBody")
    private VehicleTransaction vehicleTransaction;

    
}
