package pe.edu.upc.secureia.dtos;
import pe.edu.upc.secureia.entities.Evento_Dispositivo;

import java.time.LocalDateTime;

public class ReconocimientoDTO {

    private int id_reconocimiento;

    private String img_url_reconocimiento;

    private boolean identificado_reconocimiento;

    private LocalDateTime fechaHora_reconocimiento;

    private Evento_Dispositivo id_evento_dispositivo;

    public int getId_reconocimiento() {
        return id_reconocimiento;
    }

    public void setId_reconocimiento(int id_reconocimiento) {
        this.id_reconocimiento = id_reconocimiento;
    }

    public String getImg_url_reconocimiento() {
        return img_url_reconocimiento;
    }

    public void setImg_url_reconocimiento(String img_url_reconocimiento) {
        this.img_url_reconocimiento = img_url_reconocimiento;
    }

    public boolean isIdentificado_reconocimiento() {
        return identificado_reconocimiento;
    }

    public void setIdentificado_reconocimiento(boolean identificado_reconocimiento) {
        this.identificado_reconocimiento = identificado_reconocimiento;
    }

    public LocalDateTime getFechaHora_reconocimiento() {
        return fechaHora_reconocimiento;
    }

    public void setFechaHora_reconocimiento(LocalDateTime fechaHora_reconocimiento) {
        this.fechaHora_reconocimiento = fechaHora_reconocimiento;
    }

    public Evento_Dispositivo getId_evento_dispositivo() {
        return id_evento_dispositivo;
    }

    public void setId_evento_dispositivo(Evento_Dispositivo id_evento_dispositivo) {
        this.id_evento_dispositivo = id_evento_dispositivo;
    }
}
