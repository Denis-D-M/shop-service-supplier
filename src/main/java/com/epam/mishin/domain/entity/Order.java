package com.epam.mishin.domain.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class Order {

    @Id
    @GeneratedValue
    private String id;

    private String desc;
    @OneToOne(targetEntity = Product.class)
    private List<Product> products;
    private String status;
    private String cost;

}
