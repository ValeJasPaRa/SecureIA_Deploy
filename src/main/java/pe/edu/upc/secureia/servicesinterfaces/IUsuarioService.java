package pe.edu.upc.secureia.servicesinterfaces;

import pe.edu.upc.secureia.entities.Usuario;

import java.util.List;

public interface IUsuarioService {

    public List<Usuario> list();

    public void insert(Usuario usuario);

    public Usuario listId(int id);

    public void update(Usuario usuario);

    public void delete(int id);

    public List<Usuario> BuscarUsuarioxNombre(String name);

    public List<String[]> ObtenerCantidadUsuariosxmesyanio(int anio, int mes);

}
