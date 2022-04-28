package com.example.Firstproject.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Table1")
public class Product {
    @Id
    @GeneratedValue
    private  int id;
    private  String name;
    private  int quantity;
    private  double price;

}
