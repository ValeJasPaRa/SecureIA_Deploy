package pe.edu.upc.secureia.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.secureia.dtos.Perfil_UsuarioDTO;
import pe.edu.upc.secureia.entities.Perfil_Usuario;
import pe.edu.upc.secureia.servicesinterfaces.IPerfil_UsuarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/perfil_usuario")
public class Perfil_UsuarioController {
    @Autowired
    private IPerfil_UsuarioService perfilS;

    @GetMapping("/listar")
    @PreAuthorize("hasAnyAuthority('ROLE_USER','ROLE_ADMIN')")
    public List<Perfil_UsuarioDTO> listar() {
        return perfilS.list().stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y, Perfil_UsuarioDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/insertar")
    @PreAuthorize("hasAnyAuthority('ROLE_USER','ROLE_ADMIN')")
    public void insertar(@RequestBody Perfil_UsuarioDTO u_dto) {
        ModelMapper m = new ModelMapper();
        Perfil_Usuario perfil = m.map(u_dto, Perfil_Usuario.class);
        perfilS.insert(perfil);
    }

    @GetMapping("/listarid/{id}")
    @PreAuthorize("hasAnyAuthority('ROLE_USER','ROLE_ADMIN','ROLE_SUPPORT')")
    public Perfil_UsuarioDTO buscarId(@PathVariable("id") int id) {
        ModelMapper m=new ModelMapper();
        Perfil_UsuarioDTO dto=m.map(perfilS.listId(id),Perfil_UsuarioDTO.class);
        return dto;
    }

    @PutMapping("/modificar")
    @PreAuthorize("hasAnyAuthority('ROLE_USER','ROLE_ADMIN','ROLE_SUPPORT')")
    public void modificar(@RequestBody Perfil_UsuarioDTO dto) {
        ModelMapper m=new ModelMapper();
        Perfil_Usuario u=m.map(dto,Perfil_Usuario.class);
        perfilS.update(u);
    }

    @DeleteMapping("/eliminar/{id}")
    @PreAuthorize("hasAnyAuthority('ROLE_USER','ROLE_ADMIN')")
    public void eliminar(@PathVariable("id") int id) {perfilS.delete(id);}

}
