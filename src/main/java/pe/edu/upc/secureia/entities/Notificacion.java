package pe.edu.upc.secureia.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Notificacion")
public class Notificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_notificacion;

    @Column(name = "categoria_notificacion", length = 50, nullable = false)
    private String categoria_notificacion;

    @Column(name = "detalle_notificacion", length = 200, nullable = false)
    private String detalle_notificacion;

    @Column(name = "alarmaActivada_notificacion", nullable = false)
    private boolean alarmaActivada_notificacion;

    @ManyToOne
    @JoinColumn(name = "id_reconocimiento")
    private Reconocimiento id_reconocimiento;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario id_usuario;

    public Notificacion() {
    }

    public Notificacion(int id_notificacion, String categoria_notificacion, String detalle_notificacion, boolean alarmaActivada_notificacion, Reconocimiento id_reconocimiento, Usuario id_usuario) {
        this.id_notificacion = id_notificacion;
        this.categoria_notificacion = categoria_notificacion;
        this.detalle_notificacion = detalle_notificacion;
        this.alarmaActivada_notificacion = alarmaActivada_notificacion;
        this.id_reconocimiento = id_reconocimiento;
        this.id_usuario = id_usuario;
    }

    public int getId_notificacion() {
        return id_notificacion;
    }

    public void setId_notificacion(int id_notificacion) {
        this.id_notificacion = id_notificacion;
    }

    public String getCategoria_notificacion() {
        return categoria_notificacion;
    }

    public void setCategoria_notificacion(String categoria_notificacion) {
        this.categoria_notificacion = categoria_notificacion;
    }

    public String getDetalle_notificacion() {
        return detalle_notificacion;
    }

    public void setDetalle_notificacion(String detalle_notificacion) {
        this.detalle_notificacion = detalle_notificacion;
    }

    public boolean isAlarmaActivada_notificacion() {
        return alarmaActivada_notificacion;
    }

    public void setAlarmaActivada_notificacion(boolean alarmaActivada_notificacion) {
        this.alarmaActivada_notificacion = alarmaActivada_notificacion;
    }

    public Reconocimiento getId_reconocimiento() {
        return id_reconocimiento;
    }

    public void setId_reconocimiento(Reconocimiento id_reconocimiento) {
        this.id_reconocimiento = id_reconocimiento;
    }

    public Usuario getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Usuario id_usuario) {
        this.id_usuario = id_usuario;
    }


}
