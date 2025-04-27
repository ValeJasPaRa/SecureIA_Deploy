package pe.edu.upc.secureia.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Inmueble")
public class Inmueble {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_inmueble;

    @Column(name = "nombre_inmueble",length = 100, nullable = false)
    private String nombre_inmueble;

    @Column(name = "direccion_inmueble",length = 100, nullable = false)
    private String direccion_inmueble;

    @Column(name = "tipo_inmueble",length = 100, nullable = false)
    private String tipo_inmueble;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario id_usuario;

    public Inmueble() {
    }

    public Inmueble(int id_inmueble, String nombre_inmueble, String direccion_inmueble, String tipo_inmueble, Usuario id_usuario) {
        this.id_inmueble = id_inmueble;
        this.nombre_inmueble = nombre_inmueble;
        this.direccion_inmueble = direccion_inmueble;
        this.tipo_inmueble = tipo_inmueble;
        this.id_usuario = id_usuario;
    }

    public int getId_inmueble() {
        return id_inmueble;
    }

    public void setId_inmueble(int id_inmueble) {
        this.id_inmueble = id_inmueble;
    }

    public String getNombre_inmueble() {
        return nombre_inmueble;
    }

    public void setNombre_inmueble(String nombre_inmueble) {
        this.nombre_inmueble = nombre_inmueble;
    }

    public String getDireccion_inmueble() {
        return direccion_inmueble;
    }

    public void setDireccion_inmueble(String direccion_inmueble) {
        this.direccion_inmueble = direccion_inmueble;
    }

    public String getTipo_inmueble() {
        return tipo_inmueble;
    }

    public void setTipo_inmueble(String tipo_inmueble) {
        this.tipo_inmueble = tipo_inmueble;
    }

    public Usuario getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Usuario id_usuario) {
        this.id_usuario = id_usuario;
    }
}

