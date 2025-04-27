package pe.edu.upc.secureia.servicesinterfaces;
import pe.edu.upc.secureia.entities.Perfil_Usuario;

import java.util.List;

public interface IPerfil_UsuarioService {
    public List<Perfil_Usuario> list();
    public void insert(Perfil_Usuario perfil);
    public Perfil_Usuario listId(int id);
    public void update(Perfil_Usuario perfil);
    public void delete(int id);
}
