package pe.edu.upc.secureia.dtos;
import pe.edu.upc.secureia.entities.Usuario;

public class InmuebleDTO {

    private int id_inmueble;

    private String nombre_inmueble;

    private String direccion_inmueble;

    private String tipo_inmueble;

    private Usuario id_usuario;

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
