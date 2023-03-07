package com.jwt.jwtauthentication.entity.detailsEntity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "dealerdetails")
@Data
public class dealerdetails
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dealerId",nullable = false)
    private Long dealerId;

    @Column(name = "dealerName",nullable = false)
    private String dealerName;

    @Column(name = "address",nullable = false)
    private String address;

    @Column(name = "contact",nullable = false)
    private String contact;

    @Column(name = "email",nullable = false)
    private String email;

    @Column(name = "lastUpdatedby")
    private String lastUpdatedby;

    @Column(name = "lastUpdatedtime")
    private Timestamp lasrUpdatedtime;

    @OneToOne(mappedBy = "DealerDetails")
    private logindetails details;

}
