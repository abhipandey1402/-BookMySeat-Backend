package com.example.BookMySeatBackend.Controller;

import com.example.BookMySeatBackend.Repository.UserRepository;
import com.example.BookMySeatBackend.RequestDto.UserRequestDto;
import com.example.BookMySeatBackend.ResponseDto.UserResponseDto;
import com.example.BookMySeatBackend.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/add")
    public String addUser(@RequestBody UserRequestDto userRequestDto){

        return userService.createUser(userRequestDto);

    }

    //Find Userby Name h.w
    @GetMapping("/get")
    public UserResponseDto getUserByName(@RequestParam String name){
        return userService.getUserByName(name);
    }

    //Find all Users
    @GetMapping("/getAll")
    public List<UserResponseDto> getListOfUsers(){
        return userService.getListOfUser();
    }
}
