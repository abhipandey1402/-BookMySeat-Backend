package com.example.BookMySeatBackend.Controller;

import com.example.BookMySeatBackend.RequestDto.TheaterRequestDto;
import com.example.BookMySeatBackend.ResponseDto.TheaterResponseDto;
import com.example.BookMySeatBackend.Service.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/theater")
public class TheaterController {
    @Autowired
    TheaterService theaterService;

    @PostMapping("/add")
    public String addTheater(@RequestBody TheaterRequestDto theaterRequestDto){

        return theaterService.createTheater(theaterRequestDto);

    }

    //Get theaters by theaterId
    @GetMapping("/get")
    public TheaterResponseDto getTheater(@RequestParam int theaterId){
        return theaterService.getTheater(theaterId);
    }

    //Get all theaters
    @GetMapping("/getAll")
    public List<TheaterResponseDto> getTheaterList(){
        return theaterService.getTheaterList();
    }
}
