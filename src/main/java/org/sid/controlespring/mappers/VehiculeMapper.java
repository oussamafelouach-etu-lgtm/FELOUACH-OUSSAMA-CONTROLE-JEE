package org.sid.controlespring.mappers;

import org.sid.controlespring.dtos.*;
import org.sid.controlespring.entities.*;
import org.sid.controlespring.exceptions.AgenceNotFoundException;
import org.sid.controlespring.exceptions.LocationNotFoundException;
import org.sid.controlespring.exceptions.VehiculeNotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class VehiculeMapper {

    public AgenceDTO fromAgence(Agence agence) throws AgenceNotFoundException {

        if (agence == null) {
            throw new AgenceNotFoundException("Agence introuvable");
        }
        AgenceDTO agenceDTO = new AgenceDTO();
        BeanUtils.copyProperties(agence, agenceDTO);
        return agenceDTO;
    }
    public Agence fromAgenceDTO(AgenceDTO agenceDTO) throws AgenceNotFoundException {

        if (agenceDTO == null) {
            throw new AgenceNotFoundException("AgenceDTO introuvable");
        }

        Agence agence = new Agence();
        BeanUtils.copyProperties(agenceDTO, agence);

        return agence;
    }
    public VehiculeDTO fromVehicule(Vehicule vehicule) throws VehiculeNotFoundException {

        if (vehicule == null) {
            throw new VehiculeNotFoundException("Vehicule introuvable");
        }

        VehiculeDTO vehiculeDTO = new VehiculeDTO();
        BeanUtils.copyProperties(vehicule, vehiculeDTO);

        if (vehicule.getAgence() != null) {
            vehiculeDTO.setAgenceId(vehicule.getAgence().getId());
        }

        return vehiculeDTO;
    }
    public Vehicule fromVehiculeDTO(VehiculeDTO vehiculeDTO) throws VehiculeNotFoundException {

        if (vehiculeDTO == null) {
            throw new VehiculeNotFoundException("VehiculeDTO introuvable");
        }

        Vehicule vehicule = new Vehicule();
        BeanUtils.copyProperties(vehiculeDTO, vehicule);

        return vehicule;
    }
    public VoitureDTO fromVoiture(Voiture voiture) throws VehiculeNotFoundException {

        if (voiture == null) {
            throw new VehiculeNotFoundException("Voiture introuvable");
        }

        VoitureDTO voitureDTO = new VoitureDTO();
        BeanUtils.copyProperties(voiture, voitureDTO);

        if (voiture.getAgence() != null) {
            voitureDTO.setAgenceId(voiture.getAgence().getId());
        }

        return voitureDTO;
    }

    public Voiture fromVoitureDTO(VoitureDTO voitureDTO) throws VehiculeNotFoundException {

        if (voitureDTO == null) {
            throw new VehiculeNotFoundException("VoitureDTO introuvable");
        }

        Voiture voiture = new Voiture();
        BeanUtils.copyProperties(voitureDTO, voiture);

        return voiture;
    }

    public MotoDTO fromMoto(Moto moto) throws VehiculeNotFoundException {

        if (moto == null) {
            throw new VehiculeNotFoundException("Moto introuvable");
        }

        MotoDTO motoDTO = new MotoDTO();
        BeanUtils.copyProperties(moto, motoDTO);

        if (moto.getAgence() != null) {
            motoDTO.setAgenceId(moto.getAgence().getId());
        }

        return motoDTO;
    }

    public Moto fromMotoDTO(MotoDTO motoDTO) throws VehiculeNotFoundException {

        if (motoDTO == null) {
            throw new VehiculeNotFoundException("MotoDTO introuvable");
        }

        Moto moto = new Moto();
        BeanUtils.copyProperties(motoDTO, moto);

        return moto;
    }

    public LocationDTO fromLocation(Location location) throws LocationNotFoundException {

        if (location == null) {
            throw new LocationNotFoundException("Location introuvable");
        }

        LocationDTO locationDTO = new LocationDTO();
        BeanUtils.copyProperties(location, locationDTO);

        if (location.getVehicule() != null) {
            locationDTO.setVehiculeId(location.getVehicule().getId());
        }

        return locationDTO;
    }

    public Location fromLocationDTO(LocationDTO locationDTO) throws LocationNotFoundException {

        if (locationDTO == null) {
            throw new LocationNotFoundException("LocationDTO introuvable");
        }

        Location location = new Location();
        BeanUtils.copyProperties(locationDTO, location);

        return location;
    }


}
