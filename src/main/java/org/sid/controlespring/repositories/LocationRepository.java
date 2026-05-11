package org.sid.controlespring.repositories;

import org.sid.controlespring.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
