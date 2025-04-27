package pe.edu.upc.secureia.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.secureia.dtos.CantidadUsuariosxTipoRolDTO;
import pe.edu.upc.secureia.dtos.DispositivoDTO;
import pe.edu.upc.secureia.dtos.Menor3dispositivosDTO;
import pe.edu.upc.secureia.dtos.Zona_DeteccionDTO;
import pe.edu.upc.secureia.entities.Dispositivo;
import pe.edu.upc.secureia.entities.Zona_Deteccion;
import pe.edu.upc.secureia.servicesinterfaces.IDispositivoService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/dispositivo")
public class DispositivoController {

    @Autowired
    private IDispositivoService dispoS;

    @GetMapping("/listar")
    @PreAuthorize("hasAnyAuthority('ROLE_USER','ROLE_ADMIN','ROLE_SUPPORT')")
    public List<DispositivoDTO> listar() {
        return dispoS.list().stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y, DispositivoDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/insertar")
    @PreAuthorize("hasAnyAuthority('ROLE_USER','ROLE_SUPPORT')")
    public void insertar(@RequestBody DispositivoDTO dto) {
        ModelMapper m = new ModelMapper();
        Dispositivo dispo = m.map(dto, Dispositivo.class);
        dispoS.insert(dispo);
    }

    @GetMapping("/listarid/{id}")
    @PreAuthorize("hasAnyAuthority('ROLE_USER','ROLE_ADMIN','ROLE_SUPPORT')")
    public DispositivoDTO buscarId(@PathVariable("id") int id) {
        ModelMapper m=new ModelMapper();
        DispositivoDTO dto=m.map(dispoS.listId(id),DispositivoDTO.class);
        return dto;
    }

    @PutMapping("/modificar")
    @PreAuthorize("hasAnyAuthority('ROLE_ADMIN','ROLE_SUPPORT')")
    public void modificar(@RequestBody DispositivoDTO dto) {
        ModelMapper m=new ModelMapper();
        Dispositivo u=m.map(dto,Dispositivo.class);
        dispoS.update(u);
    }

    @DeleteMapping("/eliminar/{id}")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public void eliminar(@PathVariable("id") int id) {dispoS.delete(id);}

}
