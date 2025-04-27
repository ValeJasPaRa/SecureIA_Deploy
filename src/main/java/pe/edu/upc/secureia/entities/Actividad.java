package pe.edu.upc.secureia.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "Actividad")
public class Actividad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_actividad;

    @Column(name = "tipo_actividad", length = 30, nullable = false)
    private String tipo_actividad;

    @Column(name = "descripcion_actividad", length = 50, nullable = false)
    private String descripcion_actividad;

    @Column(name = "fechaHora_actividad", nullable = false)
    private LocalDateTime fechaHora_actividad;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario id_usuario;

    public Actividad() {
    }

    public Actividad(int id_actividad, String tipo_actividad, String descripcion_actividad, LocalDateTime fechaHora_actividad, Usuario id_usuario) {
        this.id_actividad = id_actividad;
        this.tipo_actividad = tipo_actividad;
        this.descripcion_actividad = descripcion_actividad;
        this.fechaHora_actividad = fechaHora_actividad;
        this.id_usuario = id_usuario;
    }

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
