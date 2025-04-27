package pe.edu.upc.secureia.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.secureia.entities.Geolocalizacion;
import pe.edu.upc.secureia.repositories.IGeolocalizacionRepository;
import pe.edu.upc.secureia.servicesinterfaces.IGeolocalizacionService;

import java.util.List;

@Service
public class IGeolocalizacionServiceImplement implements IGeolocalizacionService {

    @Autowired
    private IGeolocalizacionRepository geoR;

    @Override
    public List<Geolocalizacion> list() {
        return geoR.findAll();
    }

    @Override
    public void insert(Geolocalizacion geolocalizacion) {
       geoR.save(geolocalizacion);
    }

    @Override
    public Geolocalizacion listId(int id) {
        return geoR.findById(id).orElse(new Geolocalizacion());
    }

    @Override
    public void update(Geolocalizacion geolocalizacion) {
        geoR.save(geolocalizacion);
    }

    @Override
    public void delete(int id) {
        geoR.deleteById(id);
    }

    @Override
    public List<Geolocalizacion> findByInmuebleId(int idInmueble) {
        return geoR.findByInmuebleId(idInmueble);
    }

    @Override
    public List<Geolocalizacion> findGeolocalizacionesByZona(int idZona) {
        return geoR.findGeolocalizacionesByZona(idZona);
    }
}
