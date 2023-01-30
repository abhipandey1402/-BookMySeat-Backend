package com.example.BookMySeatBackend.Service;

import com.example.BookMySeatBackend.Converter.MovieConverter;
import com.example.BookMySeatBackend.Model.MovieEntity;
import com.example.BookMySeatBackend.Repository.MovieRepository;
import com.example.BookMySeatBackend.RequestDto.MovieRequestDto;
import com.example.BookMySeatBackend.ResponseDto.MovieResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    public String addMovie(MovieRequestDto movieRequestDto){

        //Convert Dto to Entity layer for saving it to the Database.
        MovieEntity movie = MovieEntity.builder().movieName(movieRequestDto.getName()).duration(movieRequestDto.getDuration()).releaseDate(movieRequestDto.getReleaseDate()).build();

        movieRepository.save(movie);

        return "Movie Added successfully";
    }

    public MovieResponseDto getMovie(String movieName){

        MovieEntity movies = movieRepository.findByMovieName(movieName);

        MovieResponseDto movieResponseDtos = MovieConverter.convertEntityToDto(movies);

        return movieResponseDtos;
    }
}
