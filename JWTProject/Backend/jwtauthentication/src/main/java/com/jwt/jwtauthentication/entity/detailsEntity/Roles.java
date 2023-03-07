package com.jwt.jwtauthentication.entity.detailsEntity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "roles")
@Data
public class Roles
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "roleId",nullable = false)
    private Long roleId;

    @Column(name = "roleName",nullable = false)
    private String roleName;

}
