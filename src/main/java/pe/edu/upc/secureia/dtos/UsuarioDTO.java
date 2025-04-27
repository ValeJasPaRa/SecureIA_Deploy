package pe.edu.upc.secureia.dtos;
import pe.edu.upc.secureia.entities.Rol;
 import java.time.LocalDateTime;

public class UsuarioDTO {
    private int id_usuario;

    private String nombre_usuario;

    private String dni_usuario;

    private String correo_usuario;

    private String sexo_usuario;

    private String telefono_usuario;

    private String direccion_usuario;

    private LocalDateTime fechaRegistro_usuario;

    private String img_url_usuario;

    private String password_usuario;

    private Rol id_rol;

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

    public LocalDateTime getFechaRegistro_usuario() {
        return fechaRegistro_usuario;
    }

    public void setFechaRegistro_usuario(LocalDateTime fechaRegistro_usuario) {
        this.fechaRegistro_usuario = fechaRegistro_usuario;
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

    public Rol getId_rol() {
        return id_rol;
    }

    public void setId_rol(Rol id_rol) {
        this.id_rol = id_rol;
    }
}
