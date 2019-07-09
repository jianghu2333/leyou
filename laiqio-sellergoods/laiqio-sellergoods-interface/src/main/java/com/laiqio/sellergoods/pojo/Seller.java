package com.laiqio.sellergoods.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


@Data
@Table(name = "tb_seller")
public class Seller implements Serializable {
    private static final long serialVersionUID = -5378350044051851275L;
    @Id
    @Column(name = "sellerId")
    private String sellerId;
    @Column(name = "name")
    private String name;
    @Column(name = "nickName")
    private String nickName;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;
    @Column(name = "telephone")
    private String telephone;
    @Column(name = "status")
    private String status;
    @Column(name = "addressDetail")
    private String addressDetail;
    @Column(name = "linkmanName")
    private String linkmanName;
    @Column(name = "linkmanQq")
    private String linkmanQq;
    @Column(name = "linkmanMobile")
    private String linkmanMobile;
    @Column(name = "linkmanEmail")
    private String linkmanEmail;
    @Column(name = "licenseNumber")
    private String licenseNumber;
    @Column(name = "taxNumber")
    private String taxNumber;
    @Column(name = "orgNumber")
    private String orgNumber;
    @Column(name = "address")
    private String address;
    @Column(name = "logoPic")
    private String logoPic;
    @Column(name = "brief")
    private String brief;
    @Column(name = "createTime")
    private Date createTime;
    @Column(name = "legalPerson")
    private String legalPerson;
    @Column(name = "legalPersonCardId")
    private String legalPersonCardId;
    @Column(name = "bankUser")
    private String bankUser;
    @Column(name = "bankName")
    private String bankName;


}