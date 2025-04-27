package pe.edu.upc.secureia.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.secureia.entities.Reconocimiento;
import pe.edu.upc.secureia.repositories.IReconocimientoRepository;
import pe.edu.upc.secureia.servicesinterfaces.IReconocimientoService;

import java.util.List;

@Service
public class ReconocimientoServiceImplement implements IReconocimientoService {
    @Autowired
    private IReconocimientoRepository recoR;

    @Override
    public List<Reconocimiento> list() {
        return recoR.findAll();
    }

    @Override
    public void insert(Reconocimiento reco) {
        recoR.save(reco);
    }

    @Override
    public Reconocimiento listId(int id) {
       return recoR.findById(id).orElse(new Reconocimiento());
    }

    @Override
    public void update(Reconocimiento reco) {
        recoR.save(reco);
    }

    @Override
    public void delete(int id) {
       recoR.deleteById(id);
    }

    @Override
    public List<Reconocimiento> ListarReconocimientosxTipoEvento(String tipo) {
        return recoR.findByTipoEvento(tipo);
    }
}
