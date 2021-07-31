package com.epam.mishin.resource;

import com.epam.mishin.domain.dto.OrderDTO;
import com.epam.mishin.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/storage")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService service;

    @PostMapping("/order")
    public void createOrder(@RequestBody OrderDTO orderDTO){
        service.saveOrder(orderDTO);
    }
}
