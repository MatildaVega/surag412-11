package com.example.APPY_REST_G4.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;
 @Entity
 @Table(name = "medicamento")
public class Medicamento {
     @Id
     @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String presentacion;
    private Double dosis;
    private String laboratorio;
    private LocalDate fechaCaducidad;
    private String contraindicaciones;
    private String registroINVIMA;
    private Boolean tieneCopago;

     public Medicamento() {
     }

     public Medicamento(long id, String nombre, String presentacion, Double dosis, String laboratorio, LocalDate fechaCaducidad, String contraindicaciones, String registroINVIMA, Boolean tieneCopago) {
         this.id = id;
         this.nombre = nombre;
         this.presentacion = presentacion;
         this.dosis = dosis;
         this.laboratorio = laboratorio;
         this.fechaCaducidad = fechaCaducidad;
         this.contraindicaciones = contraindicaciones;
         this.registroINVIMA = registroINVIMA;
         this.tieneCopago = tieneCopago;
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

     public String getPresentacion() {
         return presentacion;
     }

     public void setPresentacion(String presentacion) {
         this.presentacion = presentacion;
     }

     public Double getDosis() {
         return dosis;
     }

     public void setDosis(Double dosis) {
         this.dosis = dosis;
     }

     public String getLaboratorio() {
         return laboratorio;
     }

     public void setLaboratorio(String laboratorio) {
         this.laboratorio = laboratorio;
     }

     public LocalDate getFechaCaducidad() {
         return fechaCaducidad;
     }

     public void setFechaCaducidad(LocalDate fechaCaducidad) {
         this.fechaCaducidad = fechaCaducidad;
     }

     public String getContraindicaciones() {
         return contraindicaciones;
     }

     public void setContraindicaciones(String contraindicaciones) {
         this.contraindicaciones = contraindicaciones;
     }

     public String getRegistroINVIMA() {
         return registroINVIMA;
     }

     public void setRegistroINVIMA(String registroINVIMA) {
         this.registroINVIMA = registroINVIMA;
     }

     public Boolean getTieneCopago() {
         return tieneCopago;
     }

     public void setTieneCopago(Boolean tieneCopago) {
         this.tieneCopago = tieneCopago;
     }

     @Override
     public String toString() {
         return "Medicamento{" +
                 "id=" + id +
                 ", nombre='" + nombre + '\'' +
                 ", presentacion='" + presentacion + '\'' +
                 ", dosis=" + dosis +
                 ", laboratorio='" + laboratorio + '\'' +
                 ", fechaCaducidad=" + fechaCaducidad +
                 ", contraindicaciones='" + contraindicaciones + '\'' +
                 ", registroINVIMA='" + registroINVIMA + '\'' +
                 ", tieneCopago=" + tieneCopago +
                 '}';
     }
 }
