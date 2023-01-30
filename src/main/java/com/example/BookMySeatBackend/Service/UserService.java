package com.example.BookMySeatBackend.Service;

import com.example.BookMySeatBackend.Converter.UserConverter;
import com.example.BookMySeatBackend.Model.UserEntity;
import com.example.BookMySeatBackend.Repository.UserRepository;
import com.example.BookMySeatBackend.RequestDto.UserRequestDto;
import com.example.BookMySeatBackend.ResponseDto.UserResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public String createUser(UserRequestDto userRequestDto){

        //Converted the userRequestDto to UserEntity
        UserEntity userEntity = UserEntity.builder().name(userRequestDto.getName()).mobile(userRequestDto.getMobile()).build();

        try{
            userRepository.save(userEntity);

        }catch(Exception e){
            return "user couldn't be added";
        }
        return "User added sucessfully";
    }

    public UserResponseDto getUserByName(@RequestParam String name){
        UserEntity user = userRepository.findByName(name);

        UserResponseDto userResponseDto = UserConverter.convertEntityToDto(user);

        return userResponseDto;
    }

    public List<UserResponseDto> getListOfUser(){
        List<UserEntity> users = userRepository.findAll();

        List<UserResponseDto> userList = UserConverter.convertEntityToDto(users);

        return userList;
    }
}
