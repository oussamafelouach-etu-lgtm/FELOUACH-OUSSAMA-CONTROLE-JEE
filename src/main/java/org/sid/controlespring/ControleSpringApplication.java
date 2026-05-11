package org.sid.controlespring;

import org.sid.controlespring.entities.*;
import org.sid.controlespring.enums.BoiteVitesse;
import org.sid.controlespring.enums.StatutVehicule;
import org.sid.controlespring.enums.TypeCarburant;
import org.sid.controlespring.enums.TypeMoto;
import org.sid.controlespring.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class ControleSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControleSpringApplication.class, args);
    }

    @Bean
    CommandLineRunner start(
            AgenceRepository agenceRepository,
            VoitureRepository voitureRepository,
            MotoRepository motoRepository,
            LocationRepository locationRepository
    ) {
        return args -> {

            Agence a1 = new Agence();
            a1.setNom("Agence Casa Rent");
            a1.setAdresse("Maarif");
            a1.setVille("Casablanca");
            a1.setTelephone("0600000001");
            agenceRepository.save(a1);

            Agence a2 = new Agence();
            a2.setNom("Agence Rabat Moto");
            a2.setAdresse("Agdal");
            a2.setVille("Rabat");
            a2.setTelephone("0600000002");
            agenceRepository.save(a2);

            Voiture v1 = new Voiture();
            v1.setMarque("Hyundai");
            v1.setModele("i20");
            v1.setMatricule("CASA-1111");
            v1.setPrixParJour(250);
            v1.setDateMiseEnService(LocalDate.of(2023, 1, 10));
            v1.setStatut(StatutVehicule.DISPONIBLE);
            v1.setAgence(a1);
            v1.setNombrePortes(5);
            v1.setTypeCarburant(TypeCarburant.DIESEL);
            v1.setBoiteVitesse(BoiteVitesse.MANUELLE);
            voitureRepository.save(v1);

            Moto m1 = new Moto();
            m1.setMarque("Honda");
            m1.setModele("CBR");
            m1.setMatricule("RABAT-2222");
            m1.setPrixParJour(200);
            m1.setDateMiseEnService(LocalDate.of(2022, 6, 15));
            m1.setStatut(StatutVehicule.DISPONIBLE);
            m1.setAgence(a2);
            m1.setCylindree(600);
            m1.setTypeMoto(TypeMoto.SPORTIVE);
            m1.setCasqueInclus(true);
            motoRepository.save(m1);

            Location l1 = new Location();
            l1.setDateDebut(LocalDate.now());
            l1.setDateFin(LocalDate.now().plusDays(5));
            l1.setMontantTotal(1250);
            l1.setVehicule(v1);
            locationRepository.save(l1);

            System.out.println("===== DONNEES DE TEST INSEREES AVEC SUCCES =====");
        };
    }
}