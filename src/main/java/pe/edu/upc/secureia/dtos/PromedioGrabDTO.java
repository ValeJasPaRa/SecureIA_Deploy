package pe.edu.upc.secureia.dtos;

public class PromedioGrabDTO {

    private int id_reco;
    private double duracion_promedio;

    public int getId_reco() {
        return id_reco;
    }

    public void setId_reco(int id_reco) {
        this.id_reco = id_reco;
    }

    public double getDuracion_promedio() {
        return duracion_promedio;
    }

    public void setDuracion_promedio(double duracion_promedio) {
        this.duracion_promedio = duracion_promedio;
    }
}
