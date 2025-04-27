package pe.edu.upc.secureia.entities;

import jakarta.persistence.*;

@Entity
@Table(name ="Dispositivo" )
public class Dispositivo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_dispositivo;

    @Column(name = "tipo_dispositivo", length = 50, nullable = false)
    private String tipo_dispositivo;

    @Column(name = "ubicacion_dispositivo",length = 50,nullable = false)
    private String ubicacion_dispositivo;

    @Column(name = "estado_dispositivo",length = 30,nullable = false)
    private String estado_dispositivo;

    @ManyToOne
    @JoinColumn(name = "id_inmueble")
    private Inmueble id_inmueble;

    public Dispositivo() {
    }

    public Dispositivo(int id_dispositivo, String tipo_dispositivo, String ubicacion_dispositivo, String estado_dispositivo, Inmueble id_inmueble) {
        this.id_dispositivo = id_dispositivo;
        this.tipo_dispositivo = tipo_dispositivo;
        this.ubicacion_dispositivo = ubicacion_dispositivo;
        this.estado_dispositivo = estado_dispositivo;
        this.id_inmueble = id_inmueble;
    }

    public int getId_dispositivo() {
        return id_dispositivo;
    }

    public void setId_dispositivo(int id_dispositivo) {
        this.id_dispositivo = id_dispositivo;
    }

    public String getTipo_dispositivo() {
        return tipo_dispositivo;
    }

    public void setTipo_dispositivo(String tipo_dispositivo) {
        this.tipo_dispositivo = tipo_dispositivo;
    }

    public String getUbicacion_dispositivo() {
        return ubicacion_dispositivo;
    }

    public void setUbicacion_dispositivo(String ubicacion_dispositivo) {
        this.ubicacion_dispositivo = ubicacion_dispositivo;
    }

    public String getEstado_dispositivo() {
        return estado_dispositivo;
    }

    public void setEstado_dispositivo(String estado_dispositivo) {
        this.estado_dispositivo = estado_dispositivo;
    }

    public Inmueble getId_inmueble() {
        return id_inmueble;
    }

    public void setId_inmueble(Inmueble id_inmueble) {
        this.id_inmueble = id_inmueble;
    }
}
