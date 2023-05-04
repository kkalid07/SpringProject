package com.example.examkkalid.controllers;

import com.example.examkkalid.entities.Assurance;
import com.example.examkkalid.entities.Beneficaire;
import com.example.examkkalid.services.IService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class Controller {
    IService iService;
    @PostMapping("/ajoutBeneficiaire")
    public int ajouterBeneficaire(@RequestBody Beneficaire b){
        return iService.ajouterBeneficaire(b);
    }
    @PostMapping("/ajouterAssurance/{cinB}")
    public int ajouterAssurance(@RequestBody Assurance a,@PathVariable int cinB){
        return iService.ajouterAssurance(a,cinB);
    }
}
