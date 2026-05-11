package org.sid.controlespring.web;

import lombok.AllArgsConstructor;
import org.sid.controlespring.dtos.VoitureDTO;
import org.sid.controlespring.exceptions.AgenceNotFoundException;
import org.sid.controlespring.exceptions.VehiculeNotFoundException;
import org.sid.controlespring.services.VehiculeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/voitures")
@AllArgsConstructor
public class VoitureController {

    private VehiculeService service;

    @PostMapping
    public VoitureDTO save(@RequestBody VoitureDTO dto) throws VehiculeNotFoundException, AgenceNotFoundException {
        return service.saveVoiture(dto);
    }
}