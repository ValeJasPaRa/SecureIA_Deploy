package pe.edu.upc.secureia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.secureia.entities.Rol;

import java.util.List;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer> {

    @Query(value = "Select r.tipo_rol, count(u.id_usuario) from usuario u " +
            " join rol r on u.id_rol = r.id_rol " +
            " group by r.tipo_rol",
            nativeQuery = true)
    List<String[]> contarUsuariosPorTipoRol();

}
