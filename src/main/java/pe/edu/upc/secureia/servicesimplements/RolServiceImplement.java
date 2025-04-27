package pe.edu.upc.secureia.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.secureia.entities.Rol;
import pe.edu.upc.secureia.repositories.IRolRepository;
import pe.edu.upc.secureia.servicesinterfaces.IRolService;

import java.util.List;

@Service
public class RolServiceImplement implements IRolService {
    @Autowired
    private IRolRepository rolR;

    @Override
    public List<Rol> list() {
        return rolR.findAll();
    }

    @Override
    public void insert(Rol rol) {rolR.save(rol);

    }

    @Override
    public Rol listId(int id) {
        return rolR.findById(id).orElse(new Rol());
    }

    @Override
    public void update(Rol rol) {
        rolR.save(rol);
    }

    @Override
    public void delete(int id) {
        rolR.deleteById(id);
    }

    @Override
    public List<String[]> ContarUsuariosxTipoRol() {
        return rolR.contarUsuariosPorTipoRol();
    }
}
