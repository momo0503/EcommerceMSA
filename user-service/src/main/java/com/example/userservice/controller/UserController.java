package com.example.userservice.controller;


import com.example.userservice.vo.RequestUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class UserController {
    Environment env;

    @Autowired
    public UserController(Environment env){
        this.env = env;
    }

    @GetMapping("/health_check")
    public String status(){
        return "It's Working on user-service";
    }

    @GetMapping("/welcome")
    public String welcome(){
        return env.getProperty("greeting.message");
    }


    @PostMapping("/users")
    public String createUser(@RequestBody RequestUser user){

        return "createUser Method is called";
    }

}
