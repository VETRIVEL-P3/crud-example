package com.example.crudexample.controller;

import com.example.crudexample.entity.user_data;
import com.example.crudexample.service.user_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.io.*;
@RestController
public class user_controller {
    @Autowired
    private user_service service;

    @PostMapping("/adduser")
    public user_data adduser (@RequestBody user_data User_Data)
    {
        return service.saveuser_data(User_Data);
    }
    @PostMapping("/addusers")
    public List<user_data> addusers (@RequestBody List<user_data> User_Datas)
    {
        return service.saveuser_datas(User_Datas);
    }
@GetMapping("/allusers")
    public List<user_data> findallusers(){
        return service.getuserdatas();

    }
    @GetMapping("/users/{id}")
    public user_data finduserById(@PathVariable int id){
        return service.getuserdataById(id);


    }

    @GetMapping("/usersby/{name}")

    public user_data finduserByName(@PathVariable String name){
        return service.getuserdataByName(name);


    }

    @PutMapping ("/updateuser")
    public user_data updateuser (@RequestBody user_data User_Data)
    {
        return service.updateuserdata(User_Data);
    }
    @DeleteMapping("/deleteuser/{id}")
    public String deleteuser(@PathVariable int id)
    {
        return service.deleteuserdata(id);
    }
}
