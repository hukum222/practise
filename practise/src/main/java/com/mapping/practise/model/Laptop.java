package com.mapping.practise.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "laptop")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int laptopId;
    @Column(name="laptop_name")
    private String laptopName;
    @Column(name="laptop_brand")
    private String laptopBrand;
    @Column(name="laptop_price")
    private int laptopPrice;

    @OneToOne
    private Student student;
}

