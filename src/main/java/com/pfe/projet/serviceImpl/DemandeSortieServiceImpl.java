package com.pfe.projet.serviceImpl;

import com.pfe.projet.entité.DemandeSortie;
import com.pfe.projet.repositories.DemandeSortieRepository;
import com.pfe.projet.service.DemandeSortieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemandeSortieServiceImpl implements DemandeSortieService {

    @Autowired
    private DemandeSortieRepository demandeSortieRepository;

    @Override
    public DemandeSortie createDemandeSortie(DemandeSortie ds) {
        return demandeSortieRepository.save(ds);
    }

    @Override
    public DemandeSortie getbyId(Integer id) {
        return demandeSortieRepository.getOne(id);
    }

    @Override
    public List<DemandeSortie> getAll() {
        return (List<DemandeSortie>) demandeSortieRepository.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        try {
            demandeSortieRepository.deleteById(id);
        }
        catch (Exception e)
        {
            System.out.println("id inexistant");
        }
        }

    @Override
    public DemandeSortie editDemandeSortie(DemandeSortie ds) {
        return demandeSortieRepository.save(ds);
    }
}
