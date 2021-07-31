package com.epam.mishin.domain.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class Payment {

    @Id
    @GeneratedValue
    private String id;
    private String ogrn;
    private String kpp;
    private String inn;
    private String account;
    private long sum;

    private String paySysId;
    private String url;
    private String status;

    private String accountId;
    private String storeUrl;


}
