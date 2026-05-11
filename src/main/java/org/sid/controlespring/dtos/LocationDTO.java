package org.sid.controlespring.dtos;
import lombok.Data;
import java.time.LocalDate;


@Data
public class LocationDTO {
    private Long id;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private double montantTotal;
    private Long vehiculeId;
}
