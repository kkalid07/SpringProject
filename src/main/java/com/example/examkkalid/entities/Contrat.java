package com.example.examkkalid.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Contrat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idC;
    String matricule;
    Date dateEffect;
    @Enumerated(EnumType.STRING)
    TypeContrat type;


}
