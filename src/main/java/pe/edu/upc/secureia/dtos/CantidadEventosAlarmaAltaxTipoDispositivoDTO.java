package pe.edu.upc.secureia.dtos;

public class CantidadEventosAlarmaAltaxTipoDispositivoDTO {
    private String TipoDispositivo;
    private double CantidadEventosAlertaAlta;

    public String getTipoDispositivo() {
        return TipoDispositivo;
    }

    public void setTipoDispositivo(String tipoDispositivo) {
        TipoDispositivo = tipoDispositivo;
    }

    public double getCantidadEventosAlertaAlta() {
        return CantidadEventosAlertaAlta;
    }

    public void setCantidadEventosAlertaAlta(double cantidadEventosAlertaAlta) {
        CantidadEventosAlertaAlta = cantidadEventosAlertaAlta;
    }
}
