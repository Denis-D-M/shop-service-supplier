package com.epam.mishin.service;

import com.epam.mishin.domain.dto.CommodityDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CommodityService {

    List<CommodityDTO> getAllCommodities();

    CommodityDTO getCommodityById(String id);

    void createCommodity(CommodityDTO commodityDTO);
}
