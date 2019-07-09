package com.laiqio.sellergoods.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
public class Seller implements Serializable {
    private static final long serialVersionUID = -5378350044051851275L;
    private String sellerId;

    private String name;

    private String nickName;

    private String password;

    private String email;

    private String telephone;

    private String status;

    private String addressDetail;

    private String linkmanName;

    private String linkmanQq;

    private String linkmanMobile;

    private String linkmanEmail;

    private String licenseNumber;

    private String taxNumber;

    private String orgNumber;

    private String address;

    private String logoPic;

    private String brief;

    private Date createTime;

    private String legalPerson;

    private String legalPersonCardId;

    private String bankUser;

    private String bankName;


}