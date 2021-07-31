package com.epam.mishin.domain.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class Product {

    @ManyToOne
    @JoinColumn(name = "commodity_id")
    private Commodity commodity;

    @Id
    @GeneratedValue
    private String id;

    private String creationDate;

}
