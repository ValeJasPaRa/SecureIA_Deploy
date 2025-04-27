package pe.edu.upc.secureia.dtos;
import pe.edu.upc.secureia.entities.Inmueble;

public class GeolocalizacionDTO {

    private int id_geo;

    private double latitud;

    private double longitud;

    private String direccion_geo;

    private String referencia_geo;

    private Inmueble id_inmueble;

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
