package com.example.examkkalid.repositories;

import com.example.examkkalid.entities.Assurance;
import com.example.examkkalid.entities.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AssuranceRepos extends JpaRepository<Assurance,Integer> {
    //Assurance findByContrat(Assurance a);
    @Query(value = "select c from Assurance.contrat c join Assurance .beneficaire b where b.idB=?1 and c.dateEffect = (select min(cc.dateEffect) from Contrat cc)")
    Contrat getContratByB(int idB);
}
