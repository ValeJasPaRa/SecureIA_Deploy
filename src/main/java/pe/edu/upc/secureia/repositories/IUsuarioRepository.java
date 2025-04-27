package pe.edu.upc.secureia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.secureia.entities.Usuario;

import java.util.List;

@Repository
public interface IUsuarioRepository  extends JpaRepository<Usuario,Integer> {

    @Query("SELECT u FROM Usuario u WHERE u.nombre_usuario = :username")
    public Usuario findByUsername(@Param("username") String username); //requerido para UserDetails

    @Query("Select u from Usuario u where upper(u.nombre_usuario) like upper(concat('%', :n, '%'))") //lenguaje JPA
    List<Usuario> Buscaruserxname(@Param("n") String n); //soporta mayusculas y busca parcialmente

    //leguaje JPA Y 2Param
    @Query(value = "Select extract(year from u.fechaRegistro_usuario) , " +
            "extract(month from u.fechaRegistro_usuario) , " +
            "count (u) " +
            "from Usuario u " +
            "where extract(year from u.fechaRegistro_usuario) = :anio " +
            "and extract(month from u.fechaRegistro_usuario) = :mes " +
            "group by extract(year from u.fechaRegistro_usuario) , " +
            "extract(month from u.fechaRegistro_usuario)")
    List<String[]> obtenerCantidadUsuariosPorMesYAnio(@Param("anio") int anio, @Param("mes") int mes);



}
