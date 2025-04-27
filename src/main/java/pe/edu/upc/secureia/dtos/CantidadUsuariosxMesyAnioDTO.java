package pe.edu.upc.secureia.dtos;

public class CantidadUsuariosxMesyAnioDTO{
    private int año;
    private int mes;
    private double cantidad_de_usuarios;

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public double getCantidad_de_usuarios() {
        return cantidad_de_usuarios;
    }

    public void setCantidad_de_usuarios(double cantidad_de_usuarios) {
        this.cantidad_de_usuarios = cantidad_de_usuarios;
    }
}
