package com.example.APPY_REST_G4.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "enfermedad")
public class Enfermedad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String sintomas;
    private String clasificacion;
    private String grado;
    private Double probabilidadVivir;

    public Enfermedad() {
    }

    public Enfermedad(long id, String nombre, String sintomas, String clasificacion, String grado, Double probabilidadVivir) {
        this.id = id;
        this.nombre = nombre;
        this.sintomas = sintomas;
        this.clasificacion = clasificacion;
        this.grado = grado;
        this.probabilidadVivir = probabilidadVivir;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public Double getProbabilidadVivir() {
        return probabilidadVivir;
    }

    public void setProbabilidadVivir(Double probabilidadVivir) {
        this.probabilidadVivir = probabilidadVivir;
    }

    @Override
    public String toString() {
        return "Enfermedad{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", sintomas='" + sintomas + '\'' +
                ", clasificacion='" + clasificacion + '\'' +
                ", grado='" + grado + '\'' +
                ", probabilidadVivir=" + probabilidadVivir +
                '}';
    }
}
