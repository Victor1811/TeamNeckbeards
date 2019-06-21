package com.sda.VictorLiviu.ecommerce.repository;

import com.sda.VictorLiviu.ecommerce.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
