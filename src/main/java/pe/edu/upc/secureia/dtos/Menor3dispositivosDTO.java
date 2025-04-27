package pe.edu.upc.secureia.dtos;

public class Menor3dispositivosDTO {
    private int id_inmueble;
    private String nombre_inmueble;
    private Double cantidad_dispositivos;

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

    public Double getCantidad_dispositivos() {
        return cantidad_dispositivos;
    }

    public void setCantidad_dispositivos(Double cantidad_dispositivos) {
        this.cantidad_dispositivos = cantidad_dispositivos;
    }
}
