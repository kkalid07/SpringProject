package com.example.examkkalid.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Beneficaire implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idB;
    int cin;
    String nom;
    String prenom;
    String profession;
    float salaire;
    @JsonIgnore
    @OneToMany(mappedBy = "beneficaire")
    private Set<Assurance> assurances;
}
