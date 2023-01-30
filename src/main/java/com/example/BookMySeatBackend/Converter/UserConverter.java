package com.example.BookMySeatBackend.Converter;

import com.example.BookMySeatBackend.Model.UserEntity;
import com.example.BookMySeatBackend.ResponseDto.UserResponseDto;

import java.util.ArrayList;
import java.util.List;

public class UserConverter {
    public static UserResponseDto convertEntityToDto(UserEntity user){

        UserResponseDto userResponseDto = UserResponseDto.builder().id(user.getId()).name(user.getName()).mobile(user.getMobile()).createdOn(user.getCreatedOn()).updatedOn(user.getUpdatedOn()).build();

        return userResponseDto;
    }

    public static List<UserResponseDto> convertEntityToDto(List<UserEntity> users){
        List<UserResponseDto> userResponseDtoList = new ArrayList<>();

        for(UserEntity user : users){
            UserResponseDto userResponseDto = UserResponseDto.builder().id(user.getId()).name(user.getName()).mobile(user.getMobile()).createdOn(user.getCreatedOn()).updatedOn(user.getUpdatedOn()).build();

            userResponseDtoList.add(userResponseDto);
        }
        return userResponseDtoList;
    }
}
