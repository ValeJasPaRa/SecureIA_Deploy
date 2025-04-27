package pe.edu.upc.secureia.dtos;
import pe.edu.upc.secureia.entities.Dispositivo;


import java.time.LocalDateTime;

public class Evento_DispositivoDTO {

    private int id_evento;

    private String tipo_evento;

    private String descripcion_evento;

    private LocalDateTime fechaHora_evento;

    private String nivelAlerta_evento;

    private Dispositivo id_dispositivo;

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
