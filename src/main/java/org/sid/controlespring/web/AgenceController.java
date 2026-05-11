package org.sid.controlespring.web;

import lombok.AllArgsConstructor;
import org.sid.controlespring.dtos.AgenceDTO;
import org.sid.controlespring.exceptions.AgenceNotFoundException;
import org.sid.controlespring.services.VehiculeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/agences")
@AllArgsConstructor
public class AgenceController {

    private VehiculeService service;

    @PostMapping
    public AgenceDTO save(@RequestBody AgenceDTO dto) throws AgenceNotFoundException {
        return service.saveAgence(dto);
    }

    @GetMapping
    public List<AgenceDTO> getAll() {
        return service.getAllAgences();
    }
}