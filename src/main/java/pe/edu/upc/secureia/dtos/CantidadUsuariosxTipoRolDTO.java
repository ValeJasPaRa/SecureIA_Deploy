package pe.edu.upc.secureia.dtos;

public class CantidadUsuariosxTipoRolDTO {

    private String tipoRol;
    private double cantidad_de_Usuarios;

    public String getTipoRol() {
        return tipoRol;
    }

    public void setTipoRol(String tipoRol) {
        this.tipoRol = tipoRol;
    }

    public double getCantidad_de_Usuarios() {
        return cantidad_de_Usuarios;
    }

    public void setCantidad_de_Usuarios(double cantidad_de_Usuarios) {
        this.cantidad_de_Usuarios = cantidad_de_Usuarios;
    }
}
