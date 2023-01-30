package com.example.BookMySeatBackend.Repository;

import com.example.BookMySeatBackend.Model.TheaterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterRepository extends JpaRepository<TheaterEntity, Integer> {
    TheaterEntity finfByNameAndCity(String name, String city);
}
