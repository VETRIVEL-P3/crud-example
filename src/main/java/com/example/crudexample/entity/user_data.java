package com.example.crudexample.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user_data_table")
public class user_data {
    @Id
    @GeneratedValue

    private int id;
    private String name;
    private String place;
    private String district;
}
