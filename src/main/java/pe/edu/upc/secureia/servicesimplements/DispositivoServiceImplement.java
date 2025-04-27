package pe.edu.upc.secureia.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.secureia.entities.Dispositivo;
import pe.edu.upc.secureia.repositories.IDispositivoRepository;
import pe.edu.upc.secureia.servicesinterfaces.IDispositivoService;

import java.util.List;

@Service
public class DispositivoServiceImplement implements IDispositivoService {

    @Autowired
    private IDispositivoRepository dispoR;


    @Override
    public List<Dispositivo> list() {
        return dispoR.findAll();
    }

    @Override
    public void insert(Dispositivo dispo) {
       dispoR.save(dispo);
    }

    @Override
    public Dispositivo listId(int id) {
        return dispoR.findById(id).orElse(new Dispositivo());
    }

    @Override
    public void update(Dispositivo dispo) {
        dispoR.save(dispo);
    }

    @Override
    public void delete(int id) {
       dispoR.deleteById(id);
    }
}
