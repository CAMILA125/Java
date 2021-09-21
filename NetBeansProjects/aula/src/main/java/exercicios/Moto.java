package model.bean;

public class Moto {
    private String modelo_mot;
    private String bau_mot;
    private int aro_mot;

    public String getBau_mot() {
        return bau_mot;
    }

    public void setBau_mot(String bau_mot) {
        this.bau_mot = bau_mot;
    }

    public int getAro_mot() {
        return aro_mot;
    }

    public void setAro_mot(int aro_mot) {
        this.aro_mot = aro_mot;
    }


    public String getModelo_mot() {
        return modelo_mot;
    }

    public void setModelo_mot(String modelo_mot) {
        this.modelo_mot = modelo_mot;
    }
}
