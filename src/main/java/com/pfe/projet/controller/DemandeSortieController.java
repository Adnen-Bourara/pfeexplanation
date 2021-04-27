package com.pfe.projet.controller;


import com.pfe.projet.entité.DemandeSortie;
import com.pfe.projet.service.DemandeSortieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DemandeSortieController {

    @Autowired
    private DemandeSortieService demandeSortieService;


    @GetMapping("helloWorld")
    public Object helloWorld()
    {
        return  ResponseEntity.status(HttpStatus.FOUND).body("hello World c'est siwar");
    }

    @PostMapping("DemandeSortie")
    public Object createDemandeSortie(@RequestBody DemandeSortie ds)
    {
        ds = demandeSortieService.createDemandeSortie(ds);
        return  ResponseEntity.status(HttpStatus.FOUND).body(ds);
    }

    @GetMapping("DemandeSortie/{id}")
    public Object getbYId(@PathVariable("id") Integer idds)
    {
        DemandeSortie ds = demandeSortieService.getbyId(idds);
        return  ResponseEntity.status(HttpStatus.FOUND).body(ds);
    }

    @GetMapping("DemandeSortie")
    public Object getAll()
    {
        List<DemandeSortie> listds = demandeSortieService.getAll();
        return  ResponseEntity.status(HttpStatus.FOUND).body(listds);
    }

}
