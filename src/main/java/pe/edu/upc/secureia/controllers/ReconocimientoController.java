package pe.edu.upc.secureia.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.secureia.dtos.ReconocimientoDTO;
import pe.edu.upc.secureia.entities.Reconocimiento;
import pe.edu.upc.secureia.servicesinterfaces.IReconocimientoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/reconocimiento")
public class ReconocimientoController {
    @Autowired
    private IReconocimientoService recoS;

    @GetMapping("/listar")
    @PreAuthorize("hasAnyAuthority('ROLE_USER','ROLE_ADMIN')")
    public List<ReconocimientoDTO> listar() {
        return recoS.list().stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y, ReconocimientoDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/insertar")
    @PreAuthorize("hasAuthority('ROLE_SUPPORT')")
    public void insertar(@RequestBody ReconocimientoDTO dto) {
        ModelMapper m = new ModelMapper();
        Reconocimiento re = m.map(dto, Reconocimiento.class);
        recoS.insert(re);
    }

    @GetMapping("/listarid/{id}")
    @PreAuthorize("hasAnyAuthority('ROLE_SUPPORT', 'ROLE_ADMIN')")
    public ReconocimientoDTO buscarId(@PathVariable("id") int id) {
        ModelMapper m=new ModelMapper();
        ReconocimientoDTO dto=m.map(recoS.listId(id),ReconocimientoDTO.class);
        return dto;
    }

    @PutMapping("/modificar")
    @PreAuthorize("hasAnyAuthority('ROLE_SUPPORT', 'ROLE_ADMIN')")
    public void modificar(@RequestBody ReconocimientoDTO dto) {
        ModelMapper m=new ModelMapper();
        Reconocimiento u=m.map(dto,Reconocimiento.class);
        recoS.update(u);
    }

    @DeleteMapping("/eliminar/{id}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public void eliminar(@PathVariable("id") int id) {recoS.delete(id);}


    @GetMapping("/ListarxTipoEvento")
    @PreAuthorize("hasAnyAuthority('ROLE_USER','ROLE_ADMIN')")
    public List<ReconocimientoDTO> ListarReconocimientoporTipoEvento(@RequestParam String tipo) {

        return recoS.ListarReconocimientosxTipoEvento(tipo).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ReconocimientoDTO.class);
        }).collect(Collectors.toList());
    }


}
