package org.sid.controlespring.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.controlespring.enums.TypeMoto;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Moto extends Vehicule{
    private double cylindree;
    @Enumerated(EnumType.STRING)
    private TypeMoto typeMoto;

    private boolean casqueInclus;
}
