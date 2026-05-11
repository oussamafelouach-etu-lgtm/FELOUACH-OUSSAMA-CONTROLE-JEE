package org.sid.controlespring.dtos;
import lombok.Data;
import org.sid.controlespring.enums.TypeMoto;
@Data
public class MotoDTO {
    private double cylindree;
    private String typeMoto;
    private boolean casqueInclus;
}
