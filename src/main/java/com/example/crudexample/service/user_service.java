package com.example.crudexample.service;

import com.example.crudexample.entity.user_data;
import com.example.crudexample.repository.user_data_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class user_service {
    @Autowired
    private user_data_repository repository;
    public user_data saveuser_data(user_data User_data)
    {
       return repository.save(User_data);
    }

    public List<user_data> saveuser_datas(List<user_data> User_datas) {

        return repository.saveAll(User_datas);
    }
    public List<user_data> getuserdatas(){
        return repository.findAll();
    }

    public user_data getuserdataById(int id){
        return repository.findById(id).orElse(null);
    }

    public user_data getuserdataByName(String name){
        return repository.findByName(name);
    }
    public String deleteuserdata(int id)
    {
        repository.deleteById(id);
        return"User Details Removed Successfully"+id;
    }


    public user_data updateuserdata(user_data User_data){
        user_data existinguser=repository.findById(User_data.getId()).orElse(null);
        existinguser.setName(User_data.getName());
        existinguser.setPlace(User_data.getPlace());
        existinguser.setDistrict(User_data.getDistrict());
        return repository.save(existinguser);
    }
}
