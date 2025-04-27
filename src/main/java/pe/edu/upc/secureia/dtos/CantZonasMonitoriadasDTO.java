package pe.edu.upc.secureia.dtos;

public class CantZonasMonitoriadasDTO {
    private int Identificador_inmueble;
    private String Nombre_inmueble;
    private double Cantidad_Zonas_Monitoriadas;

    public int getIdentificar_Inmueble() {
        return Identificador_inmueble;
    }

    public void setIdentificar_Inmueble(int identificar_Inmueble) {
        Identificador_inmueble = identificar_Inmueble;
    }

    public String getNombre_inmueble() {
        return Nombre_inmueble;
    }

    public void setNombre_inmueble(String nombre_inmueble) {
        Nombre_inmueble = nombre_inmueble;
    }

    public double getCantidad_Zonas_Monitoriadas() {
        return Cantidad_Zonas_Monitoriadas;
    }

    public void setCantidad_Zonas_Monitoriadas(double cantidad_Zonas_Monitoriadas) {
        Cantidad_Zonas_Monitoriadas = cantidad_Zonas_Monitoriadas;
    }
}
