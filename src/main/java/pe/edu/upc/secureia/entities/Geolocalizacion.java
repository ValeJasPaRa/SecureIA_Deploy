package pe.edu.upc.secureia.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Geolocalizacion")
public class Geolocalizacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_geo;

    @Column(name = "latitud", nullable = false)
    private double latitud;

    @Column(name = "longitud", nullable = false)
    private double longitud;

    @Column(name = "direccion_geo", length = 50, nullable = false)
    private String direccion_geo;

    @Column(name = "referencia_geo", length = 50, nullable = false)
    private String referencia_geo;


    @ManyToOne
    @JoinColumn(name = "id_inmueble")
    private Inmueble id_inmueble;

    public Geolocalizacion() {
    }

    public Geolocalizacion(int id_geo, double latitud, double longitud, String direccion_geo, String referencia_geo, Inmueble id_inmueble) {
        this.id_geo = id_geo;
        this.latitud = latitud;
        this.longitud = longitud;
        this.direccion_geo = direccion_geo;
        this.referencia_geo = referencia_geo;
        this.id_inmueble = id_inmueble;
    }

    public int getId_geo() {
        return id_geo;
    }

    public void setId_geo(int id_geo) {
        this.id_geo = id_geo;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getDireccion_geo() {
        return direccion_geo;
    }

    public void setDireccion_geo(String direccion_geo) {
        this.direccion_geo = direccion_geo;
    }

    public String getReferencia_geo() {
        return referencia_geo;
    }

    public void setReferencia_geo(String referencia_geo) {
        this.referencia_geo = referencia_geo;
    }

    public Inmueble getId_inmueble() {
        return id_inmueble;
    }

    public void setId_inmueble(Inmueble id_inmueble) {
        this.id_inmueble = id_inmueble;
    }
}
