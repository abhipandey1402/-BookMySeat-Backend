package com.example.BookMySeatBackend.Repository;

import com.example.BookMySeatBackend.Model.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<TicketEntity, Integer> {

}
