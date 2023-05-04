package com.example.examkkalid.services;

import com.example.examkkalid.entities.Assurance;
import com.example.examkkalid.entities.Beneficaire;
import com.example.examkkalid.entities.Contrat;
import com.example.examkkalid.repositories.AssuranceRepos;
import com.example.examkkalid.repositories.BeneficaireRepos;
import com.example.examkkalid.repositories.ContratRepos;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceExam implements IService{
    BeneficaireRepos beneficaireRepos;
    AssuranceRepos assuranceRepos;
    ContratRepos contratRepos;
    @Override
    public int ajouterBeneficaire(Beneficaire b) {
        if (b.getCin()==0 || b.getNom() == null || b.getPrenom() == null) {
            throw new IllegalArgumentException("Le CIN, le nom et le prénom sont obligatoires.");
        }
        try {
            beneficaireRepos.save(b);
            //return b.getCin();
            return 1;
        }catch(Exception e)
        {
            System.out.println(e);
            return 0;
        }
    }

    @Override
    public int ajouterAssurance(Assurance a, int cinB) {
        Beneficaire beneficaire=beneficaireRepos.findByCin(cinB);
        //if(beneficaire == null)
        System.out.println("ajoutAssurance1");
        a.setBeneficaire(beneficaire);
        try {
            assuranceRepos.saveAndFlush(a);
            return 1;
            //a.getContrat(
        }catch(Exception e){
            System.out.println(e);
            return 0;
        }

    }

    @Override
    public Contrat getContratBf(int idB) {
        Contrat contrat= assuranceRepos.getContratByB(idB);

        return contrat;
    }
}
