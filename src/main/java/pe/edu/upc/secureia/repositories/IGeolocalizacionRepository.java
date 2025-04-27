package pe.edu.upc.secureia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.secureia.entities.Geolocalizacion;

import java.util.List;

@Repository
public interface IGeolocalizacionRepository extends JpaRepository<Geolocalizacion, Integer> {

    @Query(value = "SELECT g FROM Geolocalizacion g WHERE g.id_inmueble.id_inmueble = :idInmueble")
    List<Geolocalizacion> findByInmuebleId(@Param("idInmueble") int idInmueble);

    @Query("SELECT g FROM Geolocalizacion g JOIN g.id_inmueble i JOIN Zona_Deteccion z ON z.id_inmueble.id_inmueble = i.id_inmueble WHERE z.id_zona = :idZona")
    List<Geolocalizacion> findGeolocalizacionesByZona(@Param("idZona") int idZona);
}
