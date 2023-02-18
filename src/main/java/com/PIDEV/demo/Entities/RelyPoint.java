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
public class RelyPoint implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idRp;
    private String name;
    private String description;
    private String address;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="relyPoint")
    private Set<Delivery> deliveries;

}
