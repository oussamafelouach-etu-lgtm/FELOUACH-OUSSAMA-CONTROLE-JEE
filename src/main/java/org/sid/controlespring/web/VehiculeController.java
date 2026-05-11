package org.sid.controlespring.web;

import lombok.AllArgsConstructor;
import org.sid.controlespring.dtos.VehiculeDTO;
import org.sid.controlespring.exceptions.AgenceNotFoundException;
import org.sid.controlespring.exceptions.VehiculeNotFoundException;
import org.sid.controlespring.services.VehiculeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicules")
@AllArgsConstructor
public class VehiculeController {

    private VehiculeService service;

    @PostMapping
    public VehiculeDTO save(@RequestBody VehiculeDTO dto) throws VehiculeNotFoundException, AgenceNotFoundException {
        return service.saveVehicule(dto);
    }

    @GetMapping
    public List<VehiculeDTO> getAll() {
        return service.getAllVehicules();
    }

    @GetMapping("/{id}")
    public VehiculeDTO getById(@PathVariable Long id) throws VehiculeNotFoundException {
        return service.getVehiculeById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) throws VehiculeNotFoundException {
        service.deleteVehicule(id);
    }
}