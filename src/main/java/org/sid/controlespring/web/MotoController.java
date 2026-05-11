package org.sid.controlespring.web;

import lombok.AllArgsConstructor;
import org.sid.controlespring.dtos.MotoDTO;
import org.sid.controlespring.exceptions.AgenceNotFoundException;
import org.sid.controlespring.exceptions.VehiculeNotFoundException;
import org.sid.controlespring.services.VehiculeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/motos")
@AllArgsConstructor
public class MotoController {

    private VehiculeService service;

    @PostMapping
    public MotoDTO save(@RequestBody MotoDTO dto) throws VehiculeNotFoundException, AgenceNotFoundException {
        return service.saveMoto(dto);
    }
}