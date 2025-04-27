package pe.edu.upc.secureia.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.secureia.dtos.GeolocalizacionDTO;
import pe.edu.upc.secureia.entities.Geolocalizacion;
import pe.edu.upc.secureia.servicesinterfaces.IGeolocalizacionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/geolocalizacion")
public class GeolocalizacionController {

    @Autowired
    private IGeolocalizacionService geoS;

    @GetMapping("/listar")
    @PreAuthorize("hasAnyAuthority('ROLE_USER','ROLE_ADMIN','ROLE_SUPPORT')")
    public List<GeolocalizacionDTO> listar() {
        return geoS.list().stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y, GeolocalizacionDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/insertar")
    @PreAuthorize("hasAnyAuthority('ROLE_USER','ROLE_ADMIN')")
    public void insertar(@RequestBody GeolocalizacionDTO dto) {
        ModelMapper m = new ModelMapper();
        Geolocalizacion geol = m.map(dto, Geolocalizacion.class);
        geoS.insert(geol);
    }

    @GetMapping("/listarid/{id}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public GeolocalizacionDTO buscarId(@PathVariable("id") int id) {
        ModelMapper m=new ModelMapper();
        GeolocalizacionDTO dto=m.map(geoS.listId(id),GeolocalizacionDTO.class);
        return dto;
    }

    @PutMapping("/modificar")
    @PreAuthorize("hasAnyAuthority('ROLE_USER','ROLE_ADMIN')")
    public void modificar(@RequestBody GeolocalizacionDTO dto) {
        ModelMapper m=new ModelMapper();
        Geolocalizacion u=m.map(dto,Geolocalizacion.class);
        geoS.update(u);
    }

    @DeleteMapping("/eliminar/{id}")
    @PreAuthorize("hasAnyAuthority('ROLE_USER','ROLE_ADMIN')")
    public void eliminar(@PathVariable("id") int id) {geoS.delete(id);}

    @GetMapping("/findByInmuebleId")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public List<GeolocalizacionDTO> getGeolocalizacionesByInmuebleId(@RequestParam int idInmueble) {
        return geoS.findByInmuebleId(idInmueble).stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y, GeolocalizacionDTO.class);
        }).collect(Collectors.toList());
    }

    // Obtener todas las geolocalizaciones por ID de zona
    @GetMapping("/findGeolocalizacionesByZona")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public List<GeolocalizacionDTO> getGeolocalizacionesByZona(@RequestParam int idZona) {
        return geoS.findGeolocalizacionesByZona(idZona).stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y, GeolocalizacionDTO.class);
        }).collect(Collectors.toList());
    }

}
