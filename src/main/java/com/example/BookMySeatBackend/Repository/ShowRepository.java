package com.example.BookMySeatBackend.Repository;

import com.example.BookMySeatBackend.Model.ShowEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowRepository extends JpaRepository<ShowEntity, Integer> {
}
