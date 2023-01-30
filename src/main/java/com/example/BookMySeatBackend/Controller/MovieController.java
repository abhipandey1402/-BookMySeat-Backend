package com.example.BookMySeatBackend.Controller;

import com.example.BookMySeatBackend.RequestDto.MovieRequestDto;
import com.example.BookMySeatBackend.ResponseDto.MovieResponseDto;
import com.example.BookMySeatBackend.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movie")
public class MovieController {
    @Autowired
    MovieService movieService;

    @PostMapping("/add")
    public String addMovie(@RequestBody MovieRequestDto movieRequestDto){

        return movieService.addMovie(movieRequestDto);
    }
    //Get movie by Name
    @GetMapping("/get")
    public MovieResponseDto getMovie(@RequestParam String movieName){
        return movieService.getMovie(movieName);
    }
}
