package org.sid.controlespring.services;

import org.sid.controlespring.dtos.*;
import org.sid.controlespring.exceptions.AgenceNotFoundException;
import org.sid.controlespring.exceptions.LocationNotFoundException;
import org.sid.controlespring.exceptions.VehiculeNotFoundException;

import java.util.List;

public interface VehiculeService {

    AgenceDTO saveAgence(AgenceDTO agenceDTO) throws AgenceNotFoundException;

    VehiculeDTO saveVehicule(VehiculeDTO vehiculeDTO) throws VehiculeNotFoundException, AgenceNotFoundException;

    VoitureDTO saveVoiture(VoitureDTO voitureDTO) throws VehiculeNotFoundException, AgenceNotFoundException;

    MotoDTO saveMoto(MotoDTO motoDTO) throws VehiculeNotFoundException, AgenceNotFoundException;

    LocationDTO saveLocation(LocationDTO locationDTO) throws LocationNotFoundException, VehiculeNotFoundException;

    List<AgenceDTO> getAllAgences();

    List<VehiculeDTO> getAllVehicules();

    List<LocationDTO> getAllLocations();

    VehiculeDTO getVehiculeById(Long id) throws VehiculeNotFoundException;

    void deleteVehicule(Long id) throws VehiculeNotFoundException;
}