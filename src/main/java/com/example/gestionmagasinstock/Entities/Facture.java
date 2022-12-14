package com.example.gestionmagasinstock.Entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFacture;
    private float montantRemise;
    private float montantFacture;
    private boolean active;
    @Temporal(TemporalType.DATE)
    private Date dateFacture;



    @OneToMany(mappedBy = "facture")
    private Set<DetailFacture> detailFactures;
    @ManyToOne
    private Client client;
}
