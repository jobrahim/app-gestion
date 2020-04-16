package ar.com.uber.app.gestion.response;

import java.io.Serializable;

public class BarrioDTO implements Serializable {
    private String name;
    private String dni;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "BarrioDTO{" +
                "name='" + name + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}