package pe.edu.upc.secureia.servicesinterfaces;
import pe.edu.upc.secureia.entities.Geolocalizacion;

import java.util.List;

public interface IGeolocalizacionService {
    public List<Geolocalizacion> list();
    public void insert(Geolocalizacion geo);
    public Geolocalizacion listId(int id);
    public void update(Geolocalizacion geo);
    public void delete(int id);

    List<Geolocalizacion> findByInmuebleId(int idInmueble);
    List<Geolocalizacion> findGeolocalizacionesByZona(int idZona);
}
