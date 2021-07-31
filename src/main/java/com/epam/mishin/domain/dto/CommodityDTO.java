package com.epam.mishin.domain.dto;

import lombok.Data;

@Data
public class CommodityDTO {

    private String id;

    private String name;

    private String desc;

    private long price;
}
