package pe.edu.upc.secureia.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Rol")
public class Rol  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_rol;

    @Column(name = "Tipo_rol", nullable = false, length = 40)
    private String Tipo_rol;


    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)// Relación inversa
    @JoinColumn(name = "id_rol")
    private List<Usuario> usuarios;


    public Rol() {
    }

    public Rol(int id_rol, String tipo_rol) {
        this.id_rol = id_rol;
        Tipo_rol = tipo_rol;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getTipo_rol() {
        return Tipo_rol;
    }

    public void setTipo_rol(String tipo_rol) {
        Tipo_rol = tipo_rol;
    }

    /*public List<Usuario> getUsuarios() {
        return usuarios;
    }*/

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
