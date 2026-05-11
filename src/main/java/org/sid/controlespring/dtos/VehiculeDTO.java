package org.sid.controlespring.dtos;

import lombok.Data;

import java.time.LocalDate;

@Data
public class VehiculeDTO {
    private Long id;
    private String marque;
    private String modele;
    private String matricule;
    private double prixParJour;
    private LocalDate dateMiseEnService;
    private String statut;
    private Long agenceId;

}
