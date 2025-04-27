package pe.edu.upc.secureia.dtos;

import pe.edu.upc.secureia.entities.Usuario;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ActividadDTO {

    private int id_actividad;

    private String tipo_actividad;

    private String descripcion_actividad;

    private LocalDateTime fechaHora_actividad;

    private Usuario id_usuario;

    public int getId_actividad() {
        return id_actividad;
    }

    public void setId_actividad(int id_actividad) {
        this.id_actividad = id_actividad;
    }

    public String getTipo_actividad() {
        return tipo_actividad;
    }

    public void setTipo_actividad(String tipo_actividad) {
        this.tipo_actividad = tipo_actividad;
    }

    public String getDescripcion_actividad() {
        return descripcion_actividad;
    }

    public void setDescripcion_actividad(String descripcion_actividad) {
        this.descripcion_actividad = descripcion_actividad;
    }

    public LocalDateTime getFechaHora_actividad() {
        return fechaHora_actividad;
    }

    public void setFechaHora_actividad(LocalDateTime fechaHora_actividad) {
        this.fechaHora_actividad = fechaHora_actividad;
    }

    public Usuario getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Usuario id_usuario) {
        this.id_usuario = id_usuario;
    }
}
