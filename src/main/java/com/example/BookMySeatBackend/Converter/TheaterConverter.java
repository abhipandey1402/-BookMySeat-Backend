package com.example.BookMySeatBackend.Converter;

import com.example.BookMySeatBackend.Model.TheaterEntity;
import com.example.BookMySeatBackend.ResponseDto.TheaterResponseDto;

import java.util.ArrayList;
import java.util.List;

public class TheaterConverter {

    public static TheaterResponseDto convertEntityToDto(TheaterEntity theater){

        TheaterResponseDto theaterResponseDto = TheaterResponseDto.builder().id(theater.getId()).name(theater.getName()).city(theater.getCity()).address(theater.getAddress()).build();

        return theaterResponseDto;
    }

    public static List<TheaterResponseDto> converEntityListToDto(List<TheaterEntity> theaters){

        List<TheaterResponseDto> theaterResponseDtoList =new ArrayList<>();

        for(TheaterEntity theater : theaters){
            TheaterResponseDto theaterResponseDto = TheaterResponseDto.builder().id(theater.getId()).name(theater.getName()).city(theater.getCity()).address(theater.getAddress()).build();

            theaterResponseDtoList.add(theaterResponseDto);
        }
        return theaterResponseDtoList;
    }
}
