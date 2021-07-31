package com.epam.mishin.resource;

import com.epam.mishin.domain.dto.CommodityDTO;
import com.epam.mishin.service.CommodityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/storage")
@RequiredArgsConstructor
public class CommodityController {

    private final CommodityService service;

    @GetMapping("/product")
    public List<CommodityDTO> getALl(){
        return service.getAllCommodities();
    }

    @GetMapping("/product/{id}")
    public CommodityDTO getById(@PathVariable("id") String id){
        return service.getCommodityById(id);
    }

    @PostMapping("/product")
    public void createCommodity(@RequestBody CommodityDTO commodityDTO){
        service.createCommodity(commodityDTO);
    }

}

