package pe.edu.upc.secureia.dtos;

public class CantidadNotiSegunCategoDTO {
    private String Nombre_Categoria;
    private double Cantidad_segunCategoría;

    public String getNombre_Categoria() {
        return Nombre_Categoria;
    }

    public void setNombre_Categoria(String nombre_Categoria) {
        Nombre_Categoria = nombre_Categoria;
    }

    public double getCantidad_segunCategoría() {
        return Cantidad_segunCategoría;
    }

    public void setCantidad_segunCategoría(double cantidad_segunCategoría) {
        Cantidad_segunCategoría = cantidad_segunCategoría;
    }
}
