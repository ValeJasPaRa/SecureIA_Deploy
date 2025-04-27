package pe.edu.upc.secureia.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.secureia.dtos.CantZonasMonitoriadasDTO;
import pe.edu.upc.secureia.dtos.Zona_DeteccionDTO;
import pe.edu.upc.secureia.entities.Zona_Deteccion;
import pe.edu.upc.secureia.servicesinterfaces.IZona_DeteccionService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/zona_deteccion")
public class Zona_DeteccionController {

    @Autowired
    private IZona_DeteccionService zonaS;

    @GetMapping("/listar")
    @PreAuthorize("hasAnyAuthority('ROLE_USER','ROLE_ADMIN')")
    public List<Zona_DeteccionDTO> listar() {
        return zonaS.list().stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y, Zona_DeteccionDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/insertar")
    @PreAuthorize("hasAnyAuthority('ROLE_USER','ROLE_ADMIN')")
    public void insertar(@RequestBody Zona_DeteccionDTO dto) {
        ModelMapper m = new ModelMapper();
        Zona_Deteccion zon = m.map(dto, Zona_Deteccion.class);
        zonaS.insert(zon);
    }

    @GetMapping("/listarid/{id}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public Zona_DeteccionDTO buscarId(@PathVariable("id") int id) {
        ModelMapper m=new ModelMapper();
        Zona_DeteccionDTO dto=m.map(zonaS.listId(id),Zona_DeteccionDTO.class);
        return dto;
    }

    @PutMapping("/modificar")
    @PreAuthorize("hasAnyAuthority('ROLE_USER', 'ROLE_SUPPORT', 'ROLE_ADMIN')")
    public void modificar(@RequestBody Zona_DeteccionDTO dto) {
        ModelMapper m=new ModelMapper();
        Zona_Deteccion u=m.map(dto,Zona_Deteccion.class);
        zonaS.update(u);
    }

    @DeleteMapping("/eliminar/{id}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public void eliminar(@PathVariable("id") int id) {zonaS.delete(id);}

    @GetMapping("CantidadZonasMonitoriadasActivasxInmueble")
    @PreAuthorize("hasAnyAuthority( 'ROLE_SUPPORT', 'ROLE_ADMIN')")
    public List<CantZonasMonitoriadasDTO> listarCantZonas() {
        List<CantZonasMonitoriadasDTO> CantZonasMonitoriadasDTO=new ArrayList<>();
        List<String[]> fila=zonaS.ZonasconAlertaActiva();
        for(String[]columna:fila){
            CantZonasMonitoriadasDTO dto=new CantZonasMonitoriadasDTO();
            dto.setIdentificar_Inmueble(Integer.parseInt(columna[0]));
            dto.setNombre_inmueble(columna[1]);
            dto.setCantidad_Zonas_Monitoriadas(Double.parseDouble(columna[2]));
            CantZonasMonitoriadasDTO.add(dto);
        }
        return CantZonasMonitoriadasDTO;
    }
}
