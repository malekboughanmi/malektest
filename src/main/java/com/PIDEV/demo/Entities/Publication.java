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
public class Publication implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idPub;
    @Temporal(TemporalType.DATE)
    private Date datePub;
    private String imagePub;
    private String pub;


    @OneToMany(cascade = CascadeType.ALL, mappedBy="publication")
    private Set<Claim> claims;

    @ManyToOne(cascade = CascadeType.ALL)
    private Customer customer;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="publication")
    private Set<Comment> comments;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Reaction> reactions;

}
