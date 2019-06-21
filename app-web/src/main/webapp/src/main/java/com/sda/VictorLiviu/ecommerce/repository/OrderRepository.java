package com.sda.VictorLiviu.ecommerce.repository;

import com.sda.VictorLiviu.ecommerce.model.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Orders, Integer> {
}
