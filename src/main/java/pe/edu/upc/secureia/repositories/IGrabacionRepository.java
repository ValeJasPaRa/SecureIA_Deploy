package pe.edu.upc.secureia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.secureia.entities.Grabacion;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IGrabacionRepository extends JpaRepository<Grabacion,Integer> {

   @Query(value = " SELECT COUNT(*) AS cantidad_grabaciones " +
           " FROM grabacion g " +
           " WHERE g.id_reconocimiento IN (" +
           "     SELECT r.id_reconocimiento " +
           "     FROM reconocimiento r " +
           "     WHERE r.fecha_hora_reconocimiento::date = :fecha" +
           ")", nativeQuery = true )
   List<String[]> contarGrabacionesPorFecha(@Param("fecha") LocalDate fecha);

   @Query(value = "SELECT g.id_reconocimiento, " +
           "ROUND(AVG(g.duracion_seg_grabacion), 3) AS duracion_promedio " +
           "FROM grabacion g " +
           "WHERE g.id_reconocimiento = :id_reco " +
           "GROUP BY g.id_reconocimiento",
           nativeQuery = true)
   List<String[]>AVGGrabacionesXId(@Param("id_reco") int id_reco);
}