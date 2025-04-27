package pe.edu.upc.secureia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.secureia.entities.Actividad;

@Repository
public interface IActividadRepository extends JpaRepository<Actividad, Integer> {
}
