package com.pfe.projet.service;

import com.pfe.projet.entité.DemandeSortie;

import java.util.List;

public interface DemandeSortieService {

    DemandeSortie createDemandeSortie(DemandeSortie ds);
    DemandeSortie getbyId(Integer id);
    List<DemandeSortie> getAll();
    void deleteById(Integer id);
    DemandeSortie editDemandeSortie(DemandeSortie ds);
}
