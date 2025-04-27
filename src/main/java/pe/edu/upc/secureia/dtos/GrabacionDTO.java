package pe.edu.upc.secureia.dtos;
import pe.edu.upc.secureia.entities.Reconocimiento;

import java.time.LocalTime;

public class GrabacionDTO {

    private int id_grabacion;

    private String url_grabacion;

    private LocalTime horainicio_grabacion;

    private int duracionSeg_grabacion;

    private Reconocimiento id_reconocimiento;

    public int getId_grabacion() {
        return id_grabacion;
    }

    public void setId_grabacion(int id_grabacion) {
        this.id_grabacion = id_grabacion;
    }

    public String getUrl_grabacion() {
        return url_grabacion;
    }

    public void setUrl_grabacion(String url_grabacion) {
        this.url_grabacion = url_grabacion;
    }

    public LocalTime getHorainicio_grabacion() {
        return horainicio_grabacion;
    }

    public void setHorainicio_grabacion(LocalTime horainicio_grabacion) {
        this.horainicio_grabacion = horainicio_grabacion;
    }

    public int getDuracionSeg_grabacion() {
        return duracionSeg_grabacion;
    }

    public void setDuracionSeg_grabacion(int duracionSeg_grabacion) {
        this.duracionSeg_grabacion = duracionSeg_grabacion;
    }

    public Reconocimiento getId_reconocimiento() {
        return id_reconocimiento;
    }

    public void setId_reconocimiento(Reconocimiento id_reconocimiento) {
        this.id_reconocimiento = id_reconocimiento;
    }
}
