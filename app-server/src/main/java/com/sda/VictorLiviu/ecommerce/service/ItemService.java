package com.sda.VictorLiviu.ecommerce.service;

import com.sda.VictorLiviu.ecommerce.dto.ItemDto;
import com.sda.VictorLiviu.ecommerce.exceptions.ItemNotFoundException;
import com.sda.VictorLiviu.ecommerce.model.Item;
import com.sda.VictorLiviu.ecommerce.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ItemService {

    @Autowired
    ItemRepository repository;

    private Item toEntity(ItemDto dto) {
        Item entity = new Item();
        entity.setCategory(dto.getCategory());
        entity.setName(dto.getName());
        entity.setPrice(dto.getPrice());
        entity.setQuantity(dto.getQuantity());
        return entity;
    }

    public void add(ItemDto dto) {
        repository.save(toEntity(dto));
    }

    public Item delete(int id) {
        repository.deleteById(id);
        return null;
    }

    public List<Item> getItems() {
        return (List<Item>) repository.findAll();
    }

    public Item getItemById(int id) {
        Optional<Item> optionalItem = repository.findById(id);
        return optionalItem.orElseThrow( () -> new ItemNotFoundException("Couldn't find the specific item!"));
    }
}
