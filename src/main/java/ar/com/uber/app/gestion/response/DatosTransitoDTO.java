package ar.com.uber.app.gestion.response;

import java.io.Serializable;

public class DatosTransitoDTO implements Serializable {

    private String patente;

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    @Override
    public String toString() {
        return "DatosTransitoDTO{" +
                "patente='" + patente + '\'' +
                '}';
    }
}
