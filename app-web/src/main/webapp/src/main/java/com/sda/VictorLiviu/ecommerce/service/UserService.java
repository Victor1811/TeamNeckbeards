package com.sda.VictorLiviu.ecommerce.service;

import com.sda.VictorLiviu.ecommerce.exceptions.UserNotFoundException;
import com.sda.VictorLiviu.ecommerce.model.User;
import com.sda.VictorLiviu.ecommerce.dto.UserDto;
import com.sda.VictorLiviu.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserService {
    @Autowired UserRepository repository;

    private User toEntity(UserDto dto) {
        User entity = new User();
        entity.setEmail(dto.getEmail());
        entity.setFirstName(dto.getFirstName());
        entity.setLastName(dto.getLastName());
        entity.setPassword(dto.getPassword());
        return entity;
    }

    public List<User> getUsers() {
        return (List<User>) repository.findAll();
    }

    public User getUserById(int id) {
        Optional<User> optionalUser = repository.findById(id);
        return optionalUser.orElseThrow( () -> new UserNotFoundException("Couldn't find user!"));
    }

    public void delete(int id) {
        repository.deleteById(id);
    }

    public void add(UserDto dto) {
        repository.save(toEntity(dto));
    }
}
