package pe.edu.upc.secureia.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.secureia.dtos.ContarGrabacionesxFechaDTO;
import pe.edu.upc.secureia.dtos.GrabacionDTO;
import pe.edu.upc.secureia.dtos.PromedioGrabDTO;
import pe.edu.upc.secureia.entities.Grabacion;
import pe.edu.upc.secureia.servicesinterfaces.IGrabacionService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/grabacion")
public class GrabacionController {
    @Autowired
    private IGrabacionService grabS;

    @GetMapping("/listar")
    @PreAuthorize("hasAnyAuthority('ROLE_USER','ROLE_ADMIN','ROLE_SUPPORT')")
    public List<GrabacionDTO> listar() {
        return grabS.list().stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y, GrabacionDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/insertar")
    @PreAuthorize("hasAnyAuthority('ROLE_ADMIN','ROLE_SUPPORT')")
    public void insertar(@RequestBody GrabacionDTO dto) {
        ModelMapper m = new ModelMapper();
        Grabacion g = m.map(dto, Grabacion.class);
        grabS.insert(g);
    }

    @GetMapping("/listarid/{id}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public GrabacionDTO buscarId(@PathVariable("id") int id) {
        ModelMapper m=new ModelMapper();
        GrabacionDTO dto=m.map(grabS.listId(id),GrabacionDTO.class);
        return dto;
    }

    @PutMapping("/modificar")
    @PreAuthorize("hasAnyAuthority('ROLE_ADMIN','ROLE_SUPPORT')")
    public void modificar(@RequestBody GrabacionDTO dto) {
        ModelMapper m=new ModelMapper();
        Grabacion u=m.map(dto,Grabacion.class);
        grabS.update(u);
    }

    @DeleteMapping("/eliminar/{id}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public void eliminar(@PathVariable("id") int id) {grabS.delete(id);}

    @GetMapping("/ContarGrabacionesxFecha")
    @PreAuthorize("hasAnyAuthority('ROLE_USER','ROLE_SUPPORT','ROLE_ADMIN')")
    public List<ContarGrabacionesxFechaDTO> ContarGrabxFecha(@RequestParam LocalDate fecha) {
        List<ContarGrabacionesxFechaDTO> dtoLista=new ArrayList<>();
        List<String[]> fila=grabS.contarGrabacionxFecha(fecha);
        for(String[]columna:fila){
            ContarGrabacionesxFechaDTO dto=new ContarGrabacionesxFechaDTO();
            dto.setCantidad(Double.parseDouble(columna[0]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }

    @GetMapping("/PromedioTiempoGrabacionesxIdReco")
    @PreAuthorize("hasAnyAuthority('ROLE_SUPPORT','ROLE_ADMIN')")
    public List<PromedioGrabDTO> PromedioGrabxFecha(@RequestParam int ingresarId) {
        List<PromedioGrabDTO> dtoLista=new ArrayList<>();
        List<String[]> fila=grabS.PromedioGrabacionxId(ingresarId);
        for(String[]columna:fila){
            PromedioGrabDTO dto=new PromedioGrabDTO();
            dto.setId_reco(Integer.parseInt(columna[0]));
            dto.setDuracion_promedio(Double.parseDouble(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}
