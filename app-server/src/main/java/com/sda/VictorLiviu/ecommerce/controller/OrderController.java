package com.sda.VictorLiviu.ecommerce.controller;

import com.sda.VictorLiviu.ecommerce.model.Orders;
import com.sda.VictorLiviu.ecommerce.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrderController {

    private static final Logger log = LoggerFactory.getLogger(OrderController.class);

    @Autowired OrderService service;

    @GetMapping("/all")
    public ResponseEntity<List<Orders>> getAll() {
        List<Orders> orders = service.getOrders();

        if (orders.isEmpty()) {
            return new ResponseEntity<List<Orders>>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<List<Orders>>(orders, HttpStatus.OK);
    }
}
