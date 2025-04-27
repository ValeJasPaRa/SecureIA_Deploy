package pe.edu.upc.secureia.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.secureia.entities.Evento_Dispositivo;
import pe.edu.upc.secureia.repositories.IEvento_DispositivoRepository;
import pe.edu.upc.secureia.servicesinterfaces.IEvento_DispositivoService;

import java.util.List;

@Service
public class Evento_DispositivoServiceImplement implements IEvento_DispositivoService {

    @Autowired
    private IEvento_DispositivoRepository eventR;

    @Override
    public List<Evento_Dispositivo> list() {
        return eventR.findAll();
    }

    @Override
    public void insert(Evento_Dispositivo event) {
        eventR.save(event);
    }

    @Override
    public Evento_Dispositivo listId(int id) {
        return eventR.findById(id).orElse(new Evento_Dispositivo());
    }

    @Override
    public void update(Evento_Dispositivo event) {
        eventR.save(event);
    }

    @Override
    public void delete(int id) {
        eventR.deleteById(id);
    }

    @Override
    public List<String[]> CantidadEventosAltaxTipoDispositivo() {
        return eventR.CantidadEventosAltaxTDispo();
    }
}
