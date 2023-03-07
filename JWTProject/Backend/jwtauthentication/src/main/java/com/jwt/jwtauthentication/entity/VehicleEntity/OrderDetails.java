package com.jwt.jwtauthentication.entity.VehicleEntity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "orderDetails")
@Data
public class OrderDetails
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderId",nullable = false)
    private Long orderId;

    @Column(name = "transactionId",nullable = false)
    private Long TransactionId;

    @Column(name = "orderDate",nullable = false)
    private Date orderDate;

    @Column(name = "estDeliveryDate",nullable = false)
    private Date estDeliveryDate;

    @Column(name = "acutalDeliveryDate",nullable = false)
    private Date actualDeliveryDate;

    @Column(name = "orderstatus",nullable = false)
    private String orderStatus;

    @Column(name = "transportCost",nullable = false)
    private int transportCost;

    @Column(name = "totalPrice",nullable = false)
    private int totalPrice;

    @Column(name = "lastUpdatedBy")
    private String lastUpdatedBy;

    @Column(name = "lastUpdatedtime")
    private Timestamp lastUpdatedtime;

    @OneToOne
    private VehicleTransaction vehicleTransaction;


}
