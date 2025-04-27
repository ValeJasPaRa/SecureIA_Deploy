package pe.edu.upc.secureia.dtos;
import pe.edu.upc.secureia.entities.Inmueble;

public class Zona_DeteccionDTO {

    private int id_zona;

    private String nombre_zona;

    private String coordenada_zona;

    private boolean monitoreoActivo_zona;

    private Inmueble id_inmueble;

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
