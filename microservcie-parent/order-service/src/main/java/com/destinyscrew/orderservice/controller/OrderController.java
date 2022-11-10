package com.destinyscrew.orderservice.controller;

import com.destinyscrew.orderservice.dto.OrderRequest;
import com.destinyscrew.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String orderCreate(@RequestBody OrderRequest orderRequest){
        orderService.placeOrder(orderRequest);
        return "Order create successfully!";
    }
}
