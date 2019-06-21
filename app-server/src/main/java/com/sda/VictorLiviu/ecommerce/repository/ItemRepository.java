package com.sda.VictorLiviu.ecommerce.repository;

import com.sda.VictorLiviu.ecommerce.model.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<Item, Integer> {
}
