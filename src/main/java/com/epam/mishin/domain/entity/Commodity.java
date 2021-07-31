package com.epam.mishin.domain.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class Commodity {

    @Id
    @GeneratedValue
    private String id;

    @OneToMany(targetEntity = Product.class)
    private List<Product> products;

    private String name;

    private String desc;

    private long price;

}
