package pe.edu.upc.secureia.entities;


import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
@Table(name = "Grabacion")
public class Grabacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_grabacion;

    @Column(name = "url_grabacion",length = 100,nullable = false)
    private String url_grabacion;

    @Column(name = "horainicio_grabacion",nullable = false)
    private LocalTime horainicio_grabacion;

    @Column(name = "duracionSeg_grabacion",nullable = false )
    private int duracionSeg_grabacion;

    @ManyToOne
    @JoinColumn(name = "id_reconocimiento")
    private Reconocimiento id_reconocimiento;

    public Grabacion() {
    }

    public Grabacion(int id_grabacion, String url_grabacion, LocalTime horainicio_grabacion, int duracionSeg_grabacion, Reconocimiento id_reconocimiento) {
        this.id_grabacion = id_grabacion;
        this.url_grabacion = url_grabacion;
        this.horainicio_grabacion = horainicio_grabacion;
        this.duracionSeg_grabacion = duracionSeg_grabacion;
        this.id_reconocimiento = id_reconocimiento;
    }

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
