package org.sid.controlespring.dtos;
import lombok.Data;
import org.sid.controlespring.enums.BoiteVitesse;
import org.sid.controlespring.enums.TypeCarburant;



@Data
public class VoitureDTO  extends VehiculeDTO{
    private int nombrePortes;
    private TypeCarburant typeCarburant;
    private BoiteVitesse boiteVitesse;

}
