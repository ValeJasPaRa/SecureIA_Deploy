package pe.edu.upc.secureia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.secureia.entities.Perfil_Usuario;

@Repository
public interface IPerfil_UsuarioRepository extends JpaRepository<Perfil_Usuario, Integer> {
}
