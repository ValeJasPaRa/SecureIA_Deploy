package pe.edu.upc.secureia.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.secureia.dtos.CantidadUsuariosxMesyAnioDTO;
import pe.edu.upc.secureia.dtos.CantidadUsuariosxTipoRolDTO;
import pe.edu.upc.secureia.dtos.UsuarioDTO;
import pe.edu.upc.secureia.entities.Usuario;
import pe.edu.upc.secureia.servicesinterfaces.IUsuarioService;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioS;

    @GetMapping("/listar")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public List<UsuarioDTO> listar() {
        return usuarioS.list().stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y, UsuarioDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping("/insertar")
    @PreAuthorize("hasAnyAuthority('ROLE_SUPPORT', 'ROLE_ADMIN')")
    public void insertar(@RequestBody UsuarioDTO u_dto) {
        ModelMapper m = new ModelMapper();
        Usuario usuario = m.map(u_dto, Usuario.class);
        usuarioS.insert(usuario);
    }

    @GetMapping("/listarid/{id}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public UsuarioDTO buscarId(@PathVariable("id") int id) {
        ModelMapper m=new ModelMapper();
        UsuarioDTO dto=m.map(usuarioS.listId(id),UsuarioDTO.class);
        return dto;
    }

    @PutMapping("/modificar")
    @PreAuthorize("hasAnyAuthority('ROLE_USER','ROLE_ADMIN')")
    public void modificar(@RequestBody UsuarioDTO dto) {
        ModelMapper m=new ModelMapper();
        Usuario u=m.map(dto,Usuario.class);
        usuarioS.update(u);
    }

    @DeleteMapping("/eliminar/{id}")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public void eliminar(@PathVariable("id") int id) {usuarioS.delete(id);}

    //Buscar usuarioxnombre
    @GetMapping("/buscaruserxname")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public List<UsuarioDTO> BuscarUsuarioporNombre(@RequestParam String nombre) {
        return usuarioS.BuscarUsuarioxNombre(nombre).stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y, UsuarioDTO.class);
        }).collect(Collectors.toList());
    }

    //Obtener cantidad de usuarios xmes y añio ingresado
    @GetMapping("/cantidadUsersxMonthxYear")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public List<CantidadUsuariosxMesyAnioDTO> CantUsuariosxMESyANIO(@RequestParam int year,int month) {
        List<CantidadUsuariosxMesyAnioDTO> CantidadUsuariosxMesyAnioDTO=new ArrayList<>();
        List<String[]> fila=usuarioS.ObtenerCantidadUsuariosxmesyanio(year,month);
        for(String[]columna:fila){
            CantidadUsuariosxMesyAnioDTO dto=new CantidadUsuariosxMesyAnioDTO();
            dto.setAño(Integer.parseInt(columna[0]));
            dto.setMes(Integer.parseInt(columna[1]));
            dto.setCantidad_de_usuarios(Double.parseDouble(columna[2]));
            CantidadUsuariosxMesyAnioDTO.add(dto);
        }
        return CantidadUsuariosxMesyAnioDTO;
    }


}
