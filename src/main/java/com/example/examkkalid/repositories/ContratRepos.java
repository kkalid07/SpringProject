package com.example.examkkalid.repositories;

import com.example.examkkalid.entities.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ContratRepos extends JpaRepository<Contrat,Integer> {
    Contrat findByIdC(int id);

    //@Query(value = "select c from Contrat c where c.dateEffect =(select min(cc.dateEffect) from Contrat cc)")
    //Contrat getContratAncien();

}
