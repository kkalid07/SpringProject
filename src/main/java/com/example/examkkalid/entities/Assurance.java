package com.example.examkkalid.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Assurance implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idA;
    String designation;
    float amount;
    @ManyToOne(cascade = CascadeType.ALL)
    Beneficaire beneficaire;
    @ManyToOne(cascade = CascadeType.ALL)
    Contrat contrat;
}
