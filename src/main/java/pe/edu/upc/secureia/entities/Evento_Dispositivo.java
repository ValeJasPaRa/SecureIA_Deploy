package pe.edu.upc.secureia.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Evento_Dispositivo")
public class Evento_Dispositivo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_evento;

    @Column(name = "tipo_evento", length = 30, nullable = false)
    private String tipo_evento;

    @Column(name = "descripcion_evento", length = 200, nullable = false)
    private String descripcion_evento;

    @Column(name = "fechaHora_evento",nullable = false)
    private LocalDateTime fechaHora_evento;

    @Column(name="nivelAlerta_evento",length = 20, nullable = false)
    private String nivelAlerta_evento;

    @ManyToOne
    @JoinColumn(name = "id_dispositivo")
    private Dispositivo id_dispositivo;

    public Evento_Dispositivo() {
    }

    public Evento_Dispositivo(int id_evento, String tipo_evento, String descripcion_evento, LocalDateTime fechaHora_evento, String nivelAlerta_evento, Dispositivo id_dispositivo) {
        this.id_evento = id_evento;
        this.tipo_evento = tipo_evento;
        this.descripcion_evento = descripcion_evento;
        this.fechaHora_evento = fechaHora_evento;
        this.nivelAlerta_evento = nivelAlerta_evento;
        this.id_dispositivo = id_dispositivo;
    }

    public int getId_evento() {
        return id_evento;
    }

    public void setId_evento(int id_evento) {
        this.id_evento = id_evento;
    }

    public String getTipo_evento() {
        return tipo_evento;
    }

    public void setTipo_evento(String tipo_evento) {
        this.tipo_evento = tipo_evento;
    }

    public String getDescripcion_evento() {
        return descripcion_evento;
    }

    public void setDescripcion_evento(String descripcion_evento) {
        this.descripcion_evento = descripcion_evento;
    }

    public LocalDateTime getFechaHora_evento() {
        return fechaHora_evento;
    }

    public void setFechaHora_evento(LocalDateTime fechaHora_evento) {
        this.fechaHora_evento = fechaHora_evento;
    }

    public String getNivelAlerta_evento() {
        return nivelAlerta_evento;
    }

    public void setNivelAlerta_evento(String nivelAlerta_evento) {
        this.nivelAlerta_evento = nivelAlerta_evento;
    }

    public Dispositivo getId_dispositivo() {
        return id_dispositivo;
    }

    public void setId_dispositivo(Dispositivo id_dispositivo) {
        this.id_dispositivo = id_dispositivo;
    }
}
