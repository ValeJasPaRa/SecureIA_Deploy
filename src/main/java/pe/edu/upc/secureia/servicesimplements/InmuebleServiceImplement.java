package pe.edu.upc.secureia.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.secureia.entities.Inmueble;
import pe.edu.upc.secureia.repositories.IInmuebleRepository;
import pe.edu.upc.secureia.servicesinterfaces.IInmuebleService;

import java.util.List;

@Service
public class InmuebleServiceImplement implements IInmuebleService {

    @Autowired
    private IInmuebleRepository inmuR;

    @Override
    public List<Inmueble> list() {
        return inmuR.findAll();
    }

    @Override
    public void insert(Inmueble inmueble) {
      inmuR.save(inmueble);
    }

    @Override
    public Inmueble listId(int id) {
        return inmuR.findById(id).orElse(new Inmueble());
    }

    @Override
    public void update(Inmueble inmueble) {
        inmuR.save(inmueble);
    }

    @Override
    public void delete(int id) {
        inmuR.deleteById(id);
    }

    @Override
    public List<String[]> DispoxInmuebleMenor3() {
        return inmuR.Menosde3DispoxInmueble();
    }
}
