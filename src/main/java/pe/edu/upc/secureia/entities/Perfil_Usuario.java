package pe.edu.upc.secureia.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Perfil_Usuario")
public class Perfil_Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_perfil;

    @Column(name = "username_perfil", length = 50, nullable = false)
    private String username_perfil;

    @Column(name = "preferencias_privacidad_perfil",length = 30, nullable = false)
    private String preferencias_privacidad_perfil;

    @Column(name = "preferencias_notificacion_perfil", length = 30, nullable = false)
    private String preferencias_notificacion_perfil;

    @Column(name = "zonahoraria_perfil",length = 50, nullable = false)
    private String zonahoraria_perfil;

    @Column(name = "lenguaje_perfil",length = 20, nullable = false)
    private String lenguaje_perfil;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario id_usuario;

    public Perfil_Usuario() {
    }

    public Perfil_Usuario(int id_perfil, String username_perfil, String preferencias_privacidad_perfil, String preferencias_notificacion_perfil, String zonahoraria_perfil, String lenguaje_perfil, Usuario id_usuario) {
        this.id_perfil = id_perfil;
        this.username_perfil = username_perfil;
        this.preferencias_privacidad_perfil = preferencias_privacidad_perfil;
        this.preferencias_notificacion_perfil = preferencias_notificacion_perfil;
        this.zonahoraria_perfil = zonahoraria_perfil;
        this.lenguaje_perfil = lenguaje_perfil;
        this.id_usuario = id_usuario;
    }

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
