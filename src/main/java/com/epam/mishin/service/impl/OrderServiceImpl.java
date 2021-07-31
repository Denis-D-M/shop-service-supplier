package com.epam.mishin.service.impl;

import com.epam.mishin.domain.dto.OrderDTO;
import com.epam.mishin.repository.OrderRepository;
import com.epam.mishin.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository repository;

    @Override
    public void saveOrder(OrderDTO orderDTO) {

    }
}
