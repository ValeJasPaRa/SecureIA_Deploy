package pe.edu.upc.secureia.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.secureia.entities.Perfil_Usuario;
import pe.edu.upc.secureia.repositories.IPerfil_UsuarioRepository;
import pe.edu.upc.secureia.servicesinterfaces.IPerfil_UsuarioService;

import java.util.List;

@Service
public class Perfil_UsuarioServiceImplement implements IPerfil_UsuarioService {
    @Autowired
    private IPerfil_UsuarioRepository perfilR;

    @Override
    public List<Perfil_Usuario> list() {
        return perfilR.findAll();
    }

    @Override
    public void insert(Perfil_Usuario perfil) {
       perfilR.save(perfil);
    }

    @Override
    public Perfil_Usuario listId(int id) {
        return perfilR.findById(id).orElse(new Perfil_Usuario());
    }

    @Override
    public void update(Perfil_Usuario perfil) {
        perfilR.save(perfil);
    }

    @Override
    public void delete(int id) {
        perfilR.deleteById(id);
    }
}
