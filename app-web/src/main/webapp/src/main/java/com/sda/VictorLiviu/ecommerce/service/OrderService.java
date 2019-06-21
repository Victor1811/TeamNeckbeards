package com.sda.VictorLiviu.ecommerce.service;

import com.sda.VictorLiviu.ecommerce.exceptions.OrderNotFoundException;
import com.sda.VictorLiviu.ecommerce.model.Orders;
import com.sda.VictorLiviu.ecommerce.dto.OrderDto;
import com.sda.VictorLiviu.ecommerce.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class OrderService {
    @Autowired OrderRepository repository;

    private Orders toEntity(OrderDto dto) {
        Orders entity = new Orders();
        entity.setCreatedDate(dto.getCreatedDate());
        entity.setUser(dto.getUser());
        entity.setTotalCost(dto.getTotalCost());
        return entity;
    }

    public List<Orders> getOrders(){
        return (List<Orders>) repository.findAll();
    }

    public Orders getOrderById(int id) {
        Optional<Orders> optionalOrder = repository.findById(id);
        return optionalOrder.orElseThrow( () -> new OrderNotFoundException("Orders Not Found!"));
    }

    public void add(OrderDto dto) {
        repository.save(toEntity(dto));
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}
