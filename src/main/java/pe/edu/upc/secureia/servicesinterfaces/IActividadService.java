package pe.edu.upc.secureia.servicesinterfaces;

import pe.edu.upc.secureia.entities.Actividad;

import java.util.List;

public interface IActividadService {
    public List<Actividad> list();
    public void insert(Actividad actividad);
    public Actividad listId(int id);
    public void update(Actividad actividad);
    public void delete(int id);
}
