package pe.edu.upc.secureia.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.secureia.entities.Notificacion;
import pe.edu.upc.secureia.repositories.INotificacionRepository;
import pe.edu.upc.secureia.servicesinterfaces.INotificacionService;

import java.util.List;

@Service
public class NotificacionImplement implements INotificacionService {
    @Autowired
    private INotificacionRepository notiR;

    @Override
    public List<Notificacion> list() {
        return notiR.findAll();
    }

    @Override
    public void insert(Notificacion noti) {
          notiR.save(noti);
    }

    @Override
    public Notificacion listId(int id) {
        return notiR.findById(id).orElse(new Notificacion());
    }

    @Override
    public void update(Notificacion noti) {
      notiR.save(noti);
    }

    @Override
    public void delete(int id) {
      notiR.deleteById(id);
    }

    @Override
    public List<String[]> CantidadSegunCategoria(String categoria) {
        return notiR.CantidadPorCategoria(categoria);
    }


}
