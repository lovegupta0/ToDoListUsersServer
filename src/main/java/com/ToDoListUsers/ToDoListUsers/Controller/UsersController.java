package com.ToDoListUsers.ToDoListUsers.Controller;


import com.ToDoListUsers.ToDoListUsers.Model.Users;
import com.ToDoListUsers.ToDoListUsers.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class UsersController {
    @Autowired
    UserRepo userRepo;

    @GetMapping("/")
    public String started(){
        return "Server is Ok";
    }

    @GetMapping("/api/user")
    public List<Users> getUsers(){
        return userRepo.findAll();
    }

    @PostMapping("/api/add")
    public String addUser(@RequestBody Users user){

        try {
            userRepo.save(user);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return "failed";
        }
        return "sucess";
    }
    @PostMapping("/api/verify")
    public String verify(@RequestParam("email") String email,@RequestParam("password") String password){
        Users newUser=userRepo.findByEmail(email);
         if(newUser.getPassword().equals(password)){
             HashMap<String,String> map=new HashMap<>();
             Users user=userRepo.findByEmail(email);
             map.put("fname",user.getFname());
             map.put("lname",user.getLname());
             map.put("email",user.getEmail());
             return String.valueOf(map);
         }
         return null;
    }
}
