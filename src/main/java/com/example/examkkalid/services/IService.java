package com.example.examkkalid.services;

import com.example.examkkalid.entities.Assurance;
import com.example.examkkalid.entities.Beneficaire;
import com.example.examkkalid.entities.Contrat;

public interface IService {
    public int ajouterBeneficaire(Beneficaire b);
    public int ajouterAssurance(Assurance a,int cinB);
    public Contrat getContratBf(int idB);
}
