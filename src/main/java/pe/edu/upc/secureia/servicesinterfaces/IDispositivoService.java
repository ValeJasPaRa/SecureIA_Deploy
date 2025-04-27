package pe.edu.upc.secureia.servicesinterfaces;

import pe.edu.upc.secureia.entities.Dispositivo;

import java.util.List;

public interface IDispositivoService {
    public List<Dispositivo> list();

    public void insert(Dispositivo dispo);

    public Dispositivo listId(int id);

    public void update(Dispositivo dispo);

    public void delete(int id);
}
