package com.example.userservice.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class RequestUser {

    @NotNull(message = "Email is not null!~")
    @Size(min = 2 , message = "more than 2 ")
    private String email;

    @NotNull(message = "pwd is not null!~")
    @Size(min = 8 , message = "more than 8")
    private String pwd;

    @NotNull(message = "name is not null!~")
    @Size(min = 2 , message = "2이상~")
    private String name;
}
