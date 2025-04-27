package pe.edu.upc.secureia.dtos;
import pe.edu.upc.secureia.entities.Reconocimiento;
import pe.edu.upc.secureia.entities.Usuario;

public class NotificacionDTO {

    private int id_notificacion;

    private String categoria_notificacion;

    private String detalle_notificacion;

    private boolean alarmaActivada_notificacion;

    private Reconocimiento id_reconocimiento;

    private Usuario id_usuario;

    public int getId_notificacion() {
        return id_notificacion;
    }

    public void setId_notificacion(int id_notificacion) {
        this.id_notificacion = id_notificacion;
    }

    public String getCategoria_notificacion() {
        return categoria_notificacion;
    }

    public void setCategoria_notificacion(String categoria_notificacion) {
        this.categoria_notificacion = categoria_notificacion;
    }

    public String getDetalle_notificacion() {
        return detalle_notificacion;
    }

    public void setDetalle_notificacion(String detalle_notificacion) {
        this.detalle_notificacion = detalle_notificacion;
    }

    public boolean isAlarmaActivada_notificacion() {
        return alarmaActivada_notificacion;
    }

    public void setAlarmaActivada_notificacion(boolean alarmaActivada_notificacion) {
        this.alarmaActivada_notificacion = alarmaActivada_notificacion;
    }

    public Reconocimiento getId_reconocimiento() {
        return id_reconocimiento;
    }

    public void setId_reconocimiento(Reconocimiento id_reconocimiento) {
        this.id_reconocimiento = id_reconocimiento;
    }

    public Usuario getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Usuario id_usuario) {
        this.id_usuario = id_usuario;
    }
}
