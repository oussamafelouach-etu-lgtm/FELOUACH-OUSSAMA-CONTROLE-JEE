package org.sid.controlespring.entities;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import org.sid.controlespring.enums.BoiteVitesse;
import org.sid.controlespring.enums.TypeCarburant;
import org.sid.controlespring.enums.TypeMoto;



public class Voiture extends Vehicule{
    private int nombrePortes;

    @Enumerated(EnumType.STRING)
    private TypeCarburant typeCarburant;

    @Enumerated(EnumType.STRING)
    private BoiteVitesse boiteVitesse;

}
