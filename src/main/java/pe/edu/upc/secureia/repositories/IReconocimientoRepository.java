package pe.edu.upc.secureia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.secureia.entities.Reconocimiento;

import java.util.List;

@Repository
public interface IReconocimientoRepository extends JpaRepository <Reconocimiento, Integer>{

    @Query("SELECT r FROM Reconocimiento r WHERE r.id_evento_dispositivo.tipo_evento = :tipoEvento")
    List<Reconocimiento> findByTipoEvento(@Param("tipoEvento") String tipoEvento);//usando JPQL

}
