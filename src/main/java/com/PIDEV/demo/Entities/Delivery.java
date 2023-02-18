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
public class Delivery implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idD;
    private String reference;
    @Temporal(TemporalType.DATE)
    private Date  date;

    @ManyToOne
    private Deliverer deliverer;

    @ManyToOne
    private RelyPoint relyPoint;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="delivery")
    private Set<Order> Orders;



}
