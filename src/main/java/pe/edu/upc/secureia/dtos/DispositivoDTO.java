package pe.edu.upc.secureia.dtos;
import pe.edu.upc.secureia.entities.Inmueble;

public class DispositivoDTO {

    private int id_dispositivo;

    private String tipo_dispositivo;

    private String ubicacion_dispositivo;

    private String estado_dispositivo;

    private Inmueble id_inmueble;

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
