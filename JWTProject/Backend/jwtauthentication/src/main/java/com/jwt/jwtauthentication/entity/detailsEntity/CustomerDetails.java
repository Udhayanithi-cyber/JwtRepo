package com.jwt.jwtauthentication.entity.detailsEntity;


import com.jwt.jwtauthentication.entity.VehicleEntity.VehicleTransaction;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "customerDetails")
@Data
public class CustomerDetails
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "custid",nullable = false)
    private Long custId;

    @Column(name = "custname",nullable = false)
    private String custName;

    @Column(name = "mobile",nullable = false)
    private String mobileNo;

    @Column(name = "email")
    private String email;

    @Column(name = "address")
    private String address;

    @Column(name = "lastUpdatedby")
    private String lastUpdatedby;

    @Column(name = "lastUpdatedtime")
    private Timestamp lastUpdatetime;

    @OneToOne(mappedBy = "customerDetails")
    private VehicleTransaction vehicleTransaction;
}
