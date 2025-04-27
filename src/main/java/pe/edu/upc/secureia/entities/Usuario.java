package pe.edu.upc.secureia.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "Usuario", uniqueConstraints = {@UniqueConstraint(columnNames = {"id_usuario", "id_rol"})})
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_usuario;

    @Column(name = "nombre_usuario", length = 30, nullable = false)
    private String nombre_usuario;

    @Column(name = "dni_usuario", length = 8, nullable = false)
    private String dni_usuario;

    @Column(name = "correo_usuario", length = 60, nullable = false)
    private String correo_usuario;

    @Column(name = "sexo_usuario", length = 15, nullable = false)
    private String sexo_usuario;

    @Column(name = "telefono_usuario", length = 15, nullable = false)
    private String telefono_usuario;

    @Column(name = "direccion_usuario", length = 50, nullable = false)
    private String direccion_usuario;

    @Column(name = "img_url_usuario", length = 200, nullable = false)
    private String img_url_usuario;

    @Column(name = "password_usuario", length = 100, nullable = false)
    private String password_usuario;

    @Column(name = "fechaRegistro_usuario", nullable = false)
    private LocalDateTime fechaRegistro_usuario;

    @ManyToOne
    @JoinColumn(name = "id_rol",nullable = false)
    private Rol id_rol;

    public Usuario() {
    }

    public Usuario(int id_usuario, String nombre_usuario, String dni_usuario, String correo_usuario, String sexo_usuario, String telefono_usuario, String direccion_usuario, String img_url_usuario, String password_usuario, LocalDateTime fechaRegistro_usuario, Rol id_rol) {
        this.id_usuario = id_usuario;
        this.nombre_usuario = nombre_usuario;
        this.dni_usuario = dni_usuario;
        this.correo_usuario = correo_usuario;
        this.sexo_usuario = sexo_usuario;
        this.telefono_usuario = telefono_usuario;
        this.direccion_usuario = direccion_usuario;
        this.img_url_usuario = img_url_usuario;
        this.password_usuario = password_usuario;
        this.fechaRegistro_usuario = fechaRegistro_usuario;
        this.id_rol = id_rol;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getDni_usuario() {
        return dni_usuario;
    }

    public void setDni_usuario(String dni_usuario) {
        this.dni_usuario = dni_usuario;
    }

    public String getCorreo_usuario() {
        return correo_usuario;
    }

    public void setCorreo_usuario(String correo_usuario) {
        this.correo_usuario = correo_usuario;
    }

    public String getSexo_usuario() {
        return sexo_usuario;
    }

    public void setSexo_usuario(String sexo_usuario) {
        this.sexo_usuario = sexo_usuario;
    }

    public String getTelefono_usuario() {
        return telefono_usuario;
    }

    public void setTelefono_usuario(String telefono_usuario) {
        this.telefono_usuario = telefono_usuario;
    }

    public String getDireccion_usuario() {
        return direccion_usuario;
    }

    public void setDireccion_usuario(String direccion_usuario) {
        this.direccion_usuario = direccion_usuario;
    }

    public String getImg_url_usuario() {
        return img_url_usuario;
    }

    public void setImg_url_usuario(String img_url_usuario) {
        this.img_url_usuario = img_url_usuario;
    }

    public String getPassword_usuario() {
        return password_usuario;
    }

    public void setPassword_usuario(String password_usuario) {
        this.password_usuario = password_usuario;
    }

    public LocalDateTime getFechaRegistro_usuario() {
        return fechaRegistro_usuario;
    }

    public void setFechaRegistro_usuario(LocalDateTime fechaRegistro_usuario) {
        this.fechaRegistro_usuario = fechaRegistro_usuario;
    }

    public Rol getId_rol() {
        return id_rol;
    }

    public void setId_rol(Rol id_rol) {
        this.id_rol = id_rol;
    }
}
