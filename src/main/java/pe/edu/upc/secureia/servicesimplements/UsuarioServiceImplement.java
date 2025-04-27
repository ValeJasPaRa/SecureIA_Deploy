package pe.edu.upc.secureia.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.secureia.entities.Usuario;
import pe.edu.upc.secureia.repositories.IUsuarioRepository;
import pe.edu.upc.secureia.servicesinterfaces.IUsuarioService;

import java.util.List;

@Service
public class UsuarioServiceImplement implements IUsuarioService {

    @Autowired
    private IUsuarioRepository usuarioR;

    @Override
    public List<Usuario> list() {
        return usuarioR.findAll();
    }

    @Override
    public void insert(Usuario usuario) {
        usuarioR.save(usuario);
    }

    @Override
    public Usuario listId(int id) {
        return usuarioR.findById(id).orElse(new Usuario());
    }

    @Override
    public void update(Usuario usuario) {
        usuarioR.save(usuario);
    }

    @Override
    public void delete(int id) {
        usuarioR.deleteById(id);
    }

    @Override
    public List<Usuario> BuscarUsuarioxNombre(String name) {
        return usuarioR.Buscaruserxname(name);
    }

    @Override
    public List<String[]> ObtenerCantidadUsuariosxmesyanio(int anio, int mes) {
        return usuarioR.obtenerCantidadUsuariosPorMesYAnio(anio, mes);
    }


}
