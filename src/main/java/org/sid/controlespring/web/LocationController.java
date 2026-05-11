package org.sid.controlespring.web;

import lombok.AllArgsConstructor;
import org.sid.controlespring.dtos.LocationDTO;
import org.sid.controlespring.exceptions.LocationNotFoundException;
import org.sid.controlespring.exceptions.VehiculeNotFoundException;
import org.sid.controlespring.services.VehiculeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/locations")
@AllArgsConstructor
public class LocationController {

    private VehiculeService service;

    @PostMapping
    public LocationDTO save(@RequestBody LocationDTO dto) throws VehiculeNotFoundException, LocationNotFoundException {
        return service.saveLocation(dto);
    }

    @GetMapping
    public List<LocationDTO> getAll() {
        return service.getAllLocations();
    }
}