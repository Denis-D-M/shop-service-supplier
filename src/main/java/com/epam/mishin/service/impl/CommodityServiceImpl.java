package com.epam.mishin.service.impl;

import com.epam.mishin.domain.dto.CommodityDTO;
import com.epam.mishin.domain.entity.Commodity;
import com.epam.mishin.repository.CommodityRepository;
import com.epam.mishin.service.CommodityService;
import lombok.RequiredArgsConstructor;
import ma.glasnost.orika.BoundMapperFacade;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommodityServiceImpl implements CommodityService {

    private final CommodityRepository repository;
    private final BoundMapperFacade<Commodity, CommodityDTO> facade = new ;
    OrikaMapp

    @Override
    public List<CommodityDTO> getAllCommodities() {
        return facade.mapAsList(repository.findAll(), CommodityDTO.class);
    }

    @Override
    public CommodityDTO getCommodityById(String id) {
        return facade.map(repository.findById(id).orElse(null), CommodityDTO.class);
    }

    @Override
    public void createCommodity(CommodityDTO commodityDTO) {
        repository.save(facade.map(commodityDTO, Commodity.class));
    }
}
