package pe.edu.upc.secureia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.secureia.entities.Inmueble;

import java.util.List;

@Repository
public interface IInmuebleRepository extends JpaRepository<Inmueble, Integer> {

    @Query(value = " Select i.id_inmueble, i.nombre_inmueble, count(d.id_dispositivo) AS cantidad_dispositivos\n" +
            " from inmueble i\n" +
            " join dispositivo d ON i.id_inmueble = d.id_inmueble\n" +
            " where d.estado_dispositivo = 'Activo'\n" +
            " group by i.id_inmueble, i.nombre_inmueble\n" +
            " having count(d.id_dispositivo) <= 3;\n", nativeQuery = true)
    List<String[]> Menosde3DispoxInmueble();

}
