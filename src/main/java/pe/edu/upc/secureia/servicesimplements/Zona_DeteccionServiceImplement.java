package pe.edu.upc.secureia.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.secureia.entities.Zona_Deteccion;
import pe.edu.upc.secureia.repositories.IZona_DeteccionRepository;
import pe.edu.upc.secureia.servicesinterfaces.IZona_DeteccionService;

import java.util.List;

@Service
public class Zona_DeteccionServiceImplement implements IZona_DeteccionService {

    @Autowired
    private IZona_DeteccionRepository zonaR;


    @Override
    public List<Zona_Deteccion> list() {
        return zonaR.findAll();
    }

    @Override
    public void insert(Zona_Deteccion zona) {
        zonaR.save(zona);
    }

    @Override
    public Zona_Deteccion listId(int id) {
        return zonaR.findById(id).orElse(new Zona_Deteccion());
    }

    @Override
    public void update(Zona_Deteccion zona) {
        zonaR.save(zona);
    }

    @Override
    public void delete(int id) {
        zonaR.deleteById(id);
    }

    @Override
    public List<String[]> ZonasconAlertaActiva() {
        return zonaR.cantZonasMonitoriadas();
    }
}
