package pe.edu.upc.secureia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.secureia.entities.Notificacion;

import java.util.List;

@Repository
public interface INotificacionRepository extends JpaRepository<Notificacion, Integer> {
    @Query("SELECT n.categoria_notificacion, COUNT(n) FROM Notificacion n WHERE n.categoria_notificacion = :categoria GROUP BY n.categoria_notificacion")
    List<String[]> CantidadPorCategoria(@Param("categoria") String categoria);

}
