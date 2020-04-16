package ar.com.uber.app.gestion.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "chofer")
public class ChoferEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceChofer")
    @SequenceGenerator(name = "sequenceChofer",sequenceName="sequenceChofer")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "dni")
    private String dni;

    @Column(name = "patente")
    private String patente;

    @Column(name = "vehiculo")
    private String vehiculo;

    @Column(name = "barrio")
    private String barrio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    @Override
    public String toString() {
        return "ChoferEntity{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", dni=" + dni +
                ", patente='" + patente + '\'' +
                ", vehiculo='" + vehiculo + '\'' +
                ", barrio='" + barrio + '\'' +
                '}';
    }
}
