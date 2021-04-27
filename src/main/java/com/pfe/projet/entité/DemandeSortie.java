package com.pfe.projet.entité;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class DemandeSortie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date datePrevue;

    private Date dateEffctive;

    private String heureSortie;

    private Date dateActuel;

    private String motif;

}
