package pe.edu.upc.secureia.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.secureia.dtos.CantidadNotiSegunCategoDTO;
import pe.edu.upc.secureia.dtos.NotificacionDTO;
import pe.edu.upc.secureia.entities.Notificacion;
import pe.edu.upc.secureia.servicesinterfaces.INotificacionService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/notificacion")
public class NotificacionController {

    @Autowired
    private INotificacionService notiS;

    @GetMapping("/listar")
    @PreAuthorize("hasAnyAuthority('ROLE_USER','ROLE_ADMIN')")
    public List<NotificacionDTO> listar() {
        return notiS.list().stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y, NotificacionDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/insertar")
    @PreAuthorize("hasAnyAuthority('ROLE_ADMIN','ROLE_SUPPORT')")
    public void insertar(@RequestBody NotificacionDTO dto) {
        ModelMapper m = new ModelMapper();
        Notificacion not = m.map(dto, Notificacion.class);
        notiS.insert(not);
    }

    @GetMapping("/listarid/{id}")
    @PreAuthorize("hasAnyAuthority('ROLE_USER','ROLE_ADMIN')")
    public NotificacionDTO buscarId(@PathVariable("id") int id) {
        ModelMapper m=new ModelMapper();
        NotificacionDTO dto=m.map(notiS.listId(id),NotificacionDTO.class);
        return dto;
    }

    @PutMapping("/modificar")
    @PreAuthorize("hasAnyAuthority('ROLE_USER','ROLE_SUPPORT')")
    public void modificar(@RequestBody NotificacionDTO dto) {
        ModelMapper m=new ModelMapper();
        Notificacion u=m.map(dto,Notificacion.class);
        notiS.update(u);
    }

    @DeleteMapping("/eliminar/{id}")
    @PreAuthorize("hasAnyAuthority('ROLE_USER','ROLE_ADMIN','ROLE_SUPPORT')")
    public void eliminar(@PathVariable("id") int id) {notiS.delete(id);}

    @GetMapping("/CantidadSegunsuCategoría")
    @PreAuthorize("hasAnyAuthority('ROLE_USER','ROLE_ADMIN')")
    public List<CantidadNotiSegunCategoDTO> CantidadxCategoría(@RequestParam String Ingresar_Categoria) {
        List<CantidadNotiSegunCategoDTO> dtoLista=new ArrayList<>();
        List<String[]> fila=notiS.CantidadSegunCategoria(Ingresar_Categoria);
        for(String[]columna:fila){
            CantidadNotiSegunCategoDTO dto=new CantidadNotiSegunCategoDTO();
            dto.setNombre_Categoria(columna[0]);
            dto.setCantidad_segunCategoría(Double.parseDouble(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }



}
