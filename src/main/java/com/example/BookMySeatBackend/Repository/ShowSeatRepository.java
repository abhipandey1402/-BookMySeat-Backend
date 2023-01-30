package com.example.BookMySeatBackend.Repository;

import com.example.BookMySeatBackend.Model.ShowSeatEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowSeatRepository extends JpaRepository<ShowSeatEntity, Integer> {
}
