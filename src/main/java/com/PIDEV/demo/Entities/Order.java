package com.PIDEV.demo.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idO;
    private  String refer;
    @Temporal(TemporalType.DATE)
    private Date dateOrder ;
    private String state;

    @ManyToOne
    private  Delivery delivery;

    @OneToOne
    private Facture facture;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="order")
    private Set<CommandLigne> CommandLignes;

}
