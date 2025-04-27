package pe.edu.upc.secureia.dtos;
import pe.edu.upc.secureia.entities.Usuario;

public class Perfil_UsuarioDTO {

    private int id_perfil;

    private String username_perfil;

    private String preferencias_privacidad_perfil;

    private String preferencias_notificacion_perfil;

    private String zonahoraria_perfil;

    private String lenguaje_perfil;

    private Usuario id_usuario;

    public int getId_perfil() {
        return id_perfil;
    }

    public void setId_perfil(int id_perfil) {
        this.id_perfil = id_perfil;
    }

    public String getUsername_perfil() {
        return username_perfil;
    }

    public void setUsername_perfil(String username_perfil) {
        this.username_perfil = username_perfil;
    }

    public String getPreferencias_privacidad_perfil() {
        return preferencias_privacidad_perfil;
    }

    public void setPreferencias_privacidad_perfil(String preferencias_privacidad_perfil) {
        this.preferencias_privacidad_perfil = preferencias_privacidad_perfil;
    }

    public String getPreferencias_notificacion_perfil() {
        return preferencias_notificacion_perfil;
    }

    public void setPreferencias_notificacion_perfil(String preferencias_notificacion_perfil) {
        this.preferencias_notificacion_perfil = preferencias_notificacion_perfil;
    }

    public String getZonahoraria_perfil() {
        return zonahoraria_perfil;
    }

    public void setZonahoraria_perfil(String zonahoraria_perfil) {
        this.zonahoraria_perfil = zonahoraria_perfil;
    }

    public String getLenguaje_perfil() {
        return lenguaje_perfil;
    }

    public void setLenguaje_perfil(String lenguaje_perfil) {
        this.lenguaje_perfil = lenguaje_perfil;
    }

    public Usuario getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Usuario id_usuario) {
        this.id_usuario = id_usuario;
    }
}
