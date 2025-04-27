package pe.edu.upc.secureia.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Zona_Deteccion")
public class Zona_Deteccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_zona;

    @Column(name = "nombre_zona",length = 50,nullable = false)
    private String nombre_zona;

    @Column(name = "coordenada_zona",length = 200,nullable = false)
    private String coordenada_zona;

    @Column(name = "monitoreoActivo_zona",nullable = false)
    private boolean monitoreoActivo_zona;

    @ManyToOne
    @JoinColumn(name = "id_inmueble")
    private Inmueble id_inmueble;

    public Zona_Deteccion() {
    }

    public Zona_Deteccion(int id_zona, String nombre_zona, String coordenada_zona, boolean monitoreoActivo_zona, Inmueble id_inmueble) {
        this.id_zona = id_zona;
        this.nombre_zona = nombre_zona;
        this.coordenada_zona = coordenada_zona;
        this.monitoreoActivo_zona = monitoreoActivo_zona;
        this.id_inmueble = id_inmueble;
    }

    public int getId_zona() {
        return id_zona;
    }

    public void setId_zona(int id_zona) {
        this.id_zona = id_zona;
    }

    public String getNombre_zona() {
        return nombre_zona;
    }

    public void setNombre_zona(String nombre_zona) {
        this.nombre_zona = nombre_zona;
    }

    public String getCoordenada_zona() {
        return coordenada_zona;
    }

    public void setCoordenada_zona(String coordenada_zona) {
        this.coordenada_zona = coordenada_zona;
    }

    public boolean isMonitoreoActivo_zona() {
        return monitoreoActivo_zona;
    }

    public void setMonitoreoActivo_zona(boolean monitoreoActivo_zona) {
        this.monitoreoActivo_zona = monitoreoActivo_zona;
    }

    public Inmueble getId_inmueble() {
        return id_inmueble;
    }

    public void setId_inmueble(Inmueble id_inmueble) {
        this.id_inmueble = id_inmueble;
    }
}
