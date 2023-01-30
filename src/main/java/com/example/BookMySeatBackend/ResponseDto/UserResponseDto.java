package com.example.BookMySeatBackend.ResponseDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDto {
    private int id;

    private String name;

    private String mobile;

    private Date createdOn;

    private Date updatedOn;
}
