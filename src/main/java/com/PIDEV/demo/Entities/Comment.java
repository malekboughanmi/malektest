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
public class Comment  implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idCom;
    @Temporal(TemporalType.DATE)
    private Date dateCom;
    private String imageCom;
    private String com;

    @ManyToOne
    private Publication publication;


    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Reaction> reactions;

    @ManyToOne(cascade = CascadeType.ALL)
    private Customer customer;

}