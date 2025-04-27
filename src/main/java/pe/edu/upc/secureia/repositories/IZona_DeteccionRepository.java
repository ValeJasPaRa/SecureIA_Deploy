package pe.edu.upc.secureia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.secureia.entities.Zona_Deteccion;

import java.util.List;

@Repository
public interface IZona_DeteccionRepository extends JpaRepository<Zona_Deteccion, Integer> {

    @Query(value = " Select i.id_inmueble, i.nombre_inmueble, COUNT(zd.id_zona) as cantidad_zonas_monitoriadas\n" +
            " from inmueble i\n" +
            " join zona_deteccion zd ON i.id_inmueble = zd.id_inmueble\n" +
            " where zd.monitoreo_activo_zona = true\n" +
            " group by  i.id_inmueble, i.nombre_inmueble;",nativeQuery = true)
    List<String[]> cantZonasMonitoriadas();
}
