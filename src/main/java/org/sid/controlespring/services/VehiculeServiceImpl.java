package org.sid.controlespring.services;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.sid.controlespring.dtos.*;
import org.sid.controlespring.entities.*;
import org.sid.controlespring.exceptions.AgenceNotFoundException;
import org.sid.controlespring.exceptions.LocationNotFoundException;
import org.sid.controlespring.exceptions.VehiculeNotFoundException;
import org.sid.controlespring.mappers.VehiculeMapper;
import org.sid.controlespring.repositories.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class VehiculeServiceImpl implements VehiculeService {

    private AgenceRepository agenceRepository;
    private VehiculeRepository vehiculeRepository;
    private VoitureRepository voitureRepository;
    private MotoRepository motoRepository;
    private LocationRepository locationRepository;

    private VehiculeMapper mapper;

    @Override
    public AgenceDTO saveAgence(AgenceDTO agenceDTO) throws AgenceNotFoundException {

        Agence agence = mapper.fromAgenceDTO(agenceDTO);

        Agence savedAgence = agenceRepository.save(agence);

        return mapper.fromAgence(savedAgence);
    }

    @Override
    public VehiculeDTO saveVehicule(VehiculeDTO vehiculeDTO) throws VehiculeNotFoundException, AgenceNotFoundException {

        Vehicule vehicule = mapper.fromVehiculeDTO(vehiculeDTO);

        Agence agence = agenceRepository.findById(vehiculeDTO.getAgenceId())
                .orElseThrow(() ->
                        new AgenceNotFoundException("Agence introuvable"));

        vehicule.setAgence(agence);

        Vehicule savedVehicule = vehiculeRepository.save(vehicule);

        return mapper.fromVehicule(savedVehicule);
    }

    @Override
    public VoitureDTO saveVoiture(VoitureDTO voitureDTO) throws VehiculeNotFoundException, AgenceNotFoundException {

        Voiture voiture = mapper.fromVoitureDTO(voitureDTO);

        Agence agence = agenceRepository.findById(voitureDTO.getAgenceId())
                .orElseThrow(() ->
                        new AgenceNotFoundException("Agence introuvable"));

        voiture.setAgence(agence);

        Voiture savedVoiture = voitureRepository.save(voiture);

        return mapper.fromVoiture(savedVoiture);
    }

    @Override
    public MotoDTO saveMoto(MotoDTO motoDTO) throws VehiculeNotFoundException, AgenceNotFoundException {

        Moto moto = mapper.fromMotoDTO(motoDTO);

        Agence agence = agenceRepository.findById(motoDTO.getAgenceId())
                .orElseThrow(() ->
                        new AgenceNotFoundException("Agence introuvable"));

        moto.setAgence(agence);

        Moto savedMoto = motoRepository.save(moto);

        return mapper.fromMoto(savedMoto);
    }

    @Override
    public LocationDTO saveLocation(LocationDTO locationDTO) throws LocationNotFoundException, VehiculeNotFoundException {

        Location location = mapper.fromLocationDTO(locationDTO);

        Vehicule vehicule = vehiculeRepository.findById(locationDTO.getVehiculeId())
                .orElseThrow(() ->
                        new VehiculeNotFoundException("Vehicule introuvable"));

        location.setVehicule(vehicule);

        Location savedLocation = locationRepository.save(location);

        return mapper.fromLocation(savedLocation);
    }

    @SneakyThrows
    @Override
    public List<AgenceDTO> getAllAgences() {

        return agenceRepository.findAll()
                .stream()
                .map(mapper::fromAgence)
                .collect(Collectors.toList());
    }

    @SneakyThrows
    @Override
    public List<VehiculeDTO> getAllVehicules() {

        return vehiculeRepository.findAll()
                .stream()
                .map(mapper::fromVehicule)
                .collect(Collectors.toList());
    }

    @SneakyThrows
    @Override
    public List<LocationDTO> getAllLocations() {

        return locationRepository.findAll()
                .stream()
                .map(mapper::fromLocation)
                .collect(Collectors.toList());
    }

    @Override
    public VehiculeDTO getVehiculeById(Long id) throws VehiculeNotFoundException {

        Vehicule vehicule = vehiculeRepository.findById(id)
                .orElseThrow(() ->
                        new VehiculeNotFoundException("Vehicule introuvable"));

        return mapper.fromVehicule(vehicule);
    }

    @Override
    public void deleteVehicule(Long id) throws VehiculeNotFoundException {

        Vehicule vehicule = vehiculeRepository.findById(id)
                .orElseThrow(() ->
                        new VehiculeNotFoundException("Vehicule introuvable"));

        vehiculeRepository.delete(vehicule);
    }
}