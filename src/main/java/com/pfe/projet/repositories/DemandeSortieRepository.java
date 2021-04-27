package com.pfe.projet.repositories;

import com.pfe.projet.entité.DemandeSortie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemandeSortieRepository extends JpaRepository<DemandeSortie,Integer> {
}
