package pe.edu.upc.secureia.servicesinterfaces;

import pe.edu.upc.secureia.entities.Zona_Deteccion;

import java.util.List;

public interface IZona_DeteccionService {
    public List<Zona_Deteccion> list();

    public void insert(Zona_Deteccion zona);

    public Zona_Deteccion listId(int id);

    public void update(Zona_Deteccion zona);

    public void delete(int id);

    public List<String[]>ZonasconAlertaActiva();

}
