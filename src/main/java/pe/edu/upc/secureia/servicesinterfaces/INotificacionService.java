package pe.edu.upc.secureia.servicesinterfaces;

import pe.edu.upc.secureia.entities.Notificacion;

import java.util.List;

public interface INotificacionService {
    public List<Notificacion> list();

    public void insert(Notificacion noti);

    public Notificacion listId(int id);

    public void update(Notificacion noti);

    public void delete(int id);

    public List<String[]>CantidadSegunCategoria(String categoria);
}
