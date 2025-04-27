package pe.edu.upc.secureia.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.secureia.entities.Actividad;
import pe.edu.upc.secureia.repositories.IActividadRepository;
import pe.edu.upc.secureia.servicesinterfaces.IActividadService;

import java.util.List;

@Service
public class ActividadServiceImplement implements IActividadService {

    @Autowired
    private IActividadRepository actR;

    @Override
    public List<Actividad> list() {
        return actR.findAll();
    }

    @Override
    public void insert(Actividad actividad) {
        actR.save(actividad);

    }

    @Override
    public Actividad listId(int id) {
        return actR.findById(id).orElse(new Actividad());
    }

    @Override
    public void update(Actividad actividad) {
        actR.save(actividad);
    }

    @Override
    public void delete(int id) {
        actR.deleteById(id);

    }
}
