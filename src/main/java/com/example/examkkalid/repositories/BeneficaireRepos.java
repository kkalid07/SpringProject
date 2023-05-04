package com.example.examkkalid.repositories;

import com.example.examkkalid.entities.Assurance;
import com.example.examkkalid.entities.Beneficaire;
import com.example.examkkalid.entities.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BeneficaireRepos extends JpaRepository<Beneficaire, Integer> {
  //Beneficaire findBeneficaireByCin();
  Beneficaire findByCin(int cin);
  //Contrat findByAssurances


}
