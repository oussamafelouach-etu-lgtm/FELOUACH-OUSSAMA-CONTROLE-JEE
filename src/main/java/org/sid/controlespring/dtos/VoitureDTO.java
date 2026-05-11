package org.sid.controlespring.dtos;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.controlespring.entities.Vehicule;
import org.sid.controlespring.enums.BoiteVitesse;
import org.sid.controlespring.enums.TypeCarburant;



@Data
public class VoitureDTO  extends VehiculeDTO{
    private int nombrePortes;
    private TypeCarburant typeCarburant;
    private BoiteVitesse boiteVitesse;

}
