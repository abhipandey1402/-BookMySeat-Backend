package com.example.BookMySeatBackend.Converter;

import com.example.BookMySeatBackend.Model.MovieEntity;
import com.example.BookMySeatBackend.ResponseDto.MovieResponseDto;

public class MovieConverter {
    public static MovieResponseDto convertEntityToDto(MovieEntity movie){

        MovieResponseDto movieResponseDto = MovieResponseDto.builder().id(movie.getId()).movieName(movie.getMovieName()).duration(movie.getDuration()).releaseDate(movie.getReleaseDate()).build();

        return movieResponseDto;
    }
}
