package ar.com.uber.app.gestion.request;

import java.io.Serializable;

public class ClientBarrioDTO implements Serializable {

    private String barrio;

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    @Override
    public String toString() {
        return "ClientBarrioDTO{" +
                "barrio='" + barrio + '\'' +
                '}';
    }
}

