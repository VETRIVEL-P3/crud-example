package com.example.crudexample.repository;

import com.example.crudexample.entity.user_data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface user_data_repository extends JpaRepository<user_data,Integer> {
    user_data findByName(String name);
}
