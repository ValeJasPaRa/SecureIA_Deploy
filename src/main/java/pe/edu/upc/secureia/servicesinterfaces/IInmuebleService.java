package pe.edu.upc.secureia.servicesinterfaces;
import pe.edu.upc.secureia.entities.Inmueble;

import java.util.List;

public interface IInmuebleService {
    public List<Inmueble> list();
    public void insert(Inmueble inmueble);
    public Inmueble listId(int id);
    public void update(Inmueble inmueble);
    public void delete(int id);
    public List<String[]>DispoxInmuebleMenor3();
}
