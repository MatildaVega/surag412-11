package com.example.APPY_REST_G4.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "pacientes")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;//no debe tener mas de 40 caracteres //solo admito letras
    private LocalDate anioNacimiento;//este año no puede ser mayor a 2024 //no puede menor a 1920
    private String ciudad;// no debe tener mas de 50 caracteres // solo letras
    private String correo;// debe tener formato @sura.com.co
    private String telefono;//debe tener 10 digitos
    private String ips;
    private Boolean tienePoliza;
    private String grupoIngresos;//A,B,C
    private LocalDate fechaAfilicaion;// SOLO SALIDAS ENTRE 1995-2024

    public Paciente() {
    }

    public Paciente(Long id, String nombre, LocalDate anioNacimiento, String ciudad, String correo, String telefono, String ips, Boolean tienePoliza, String grupoIngresos, LocalDate fechaAfilicaion) {
        this.id = id;
        this.nombre = nombre;
        this.anioNacimiento = anioNacimiento;
        this.ciudad = ciudad;
        this.correo = correo;
        this.telefono = telefono;
        this.ips = ips;
        this.tienePoliza = tienePoliza;
        this.grupoIngresos = grupoIngresos;
        this.fechaAfilicaion = fechaAfilicaion;
    }

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

    public LocalDate getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(LocalDate anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips;
    }

    public Boolean getTienePoliza() {
        return tienePoliza;
    }

    public void setTienePoliza(Boolean tienePoliza) {
        this.tienePoliza = tienePoliza;
    }

    public String getGrupoIngresos() {
        return grupoIngresos;
    }

    public void setGrupoIngresos(String grupoIngresos) {
        this.grupoIngresos = grupoIngresos;
    }

    public LocalDate getFechaAfilicaion() {
        return fechaAfilicaion;
    }

    public void setFechaAfilicaion(LocalDate fechaAfilicaion) {
        this.fechaAfilicaion = fechaAfilicaion;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", anioNacimiento=" + anioNacimiento +
                ", ciudad='" + ciudad + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", ips='" + ips + '\'' +
                ", tienePoliza=" + tienePoliza +
                ", grupoIngresos='" + grupoIngresos + '\'' +
                ", fechaAfilicaion=" + fechaAfilicaion +
                '}';
    }
}
