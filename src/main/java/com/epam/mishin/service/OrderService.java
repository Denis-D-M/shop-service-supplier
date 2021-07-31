package com.epam.mishin.service;

import com.epam.mishin.domain.dto.OrderDTO;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {
    void saveOrder(OrderDTO orderDTO);
}
