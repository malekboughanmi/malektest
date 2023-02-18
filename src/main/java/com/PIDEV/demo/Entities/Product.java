package com.PIDEV.demo.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idProduct;

    private String referance;
    private String name;
    private float price;
    private  String descrp;
    private  String category;
    private  int quantite;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="product")
    private Set<CommandLigne> CommandLignes;

    @ManyToOne
    private Discount discount;

    @ManyToOne
    private Warehouse warehouse;
}
