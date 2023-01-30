package com.example.BookMySeatBackend.Repository;

import com.example.BookMySeatBackend.Model.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<MovieEntity, Integer> {
    MovieEntity findByMovieName(String movieName);
}
