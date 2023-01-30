package com.example.BookMySeatBackend.Repository;

import com.example.BookMySeatBackend.Model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    UserEntity findByName(String name);
}
