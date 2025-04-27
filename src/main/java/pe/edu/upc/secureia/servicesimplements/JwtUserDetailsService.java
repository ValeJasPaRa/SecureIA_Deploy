package pe.edu.upc.secureia.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pe.edu.upc.secureia.entities.Usuario;
import pe.edu.upc.secureia.repositories.IUsuarioRepository;


import java.util.ArrayList;
import java.util.List;


//Clase 2
@Service
public class JwtUserDetailsService implements UserDetailsService {
    @Autowired
    private IUsuarioRepository repo;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario user = repo.findByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException(String.format("User not exists", username));
        }

        List<GrantedAuthority> roles = new ArrayList<>();
        roles.add(new SimpleGrantedAuthority(user.getId_rol().getTipo_rol())); // Aquí corregido

        UserDetails ud = new org.springframework.security.core.userdetails.User(
                user.getNombre_usuario(),
                user.getPassword_usuario(),
                //user.getEnabled(),//por ahora hasta agregar una nuevo atributo en la tabla de usuarios
                true, //se le agrego para que por defecto acepte un bool true del habilitado
                true, true, true,
                roles
        );

        return ud;
    }

}