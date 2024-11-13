package com.example.APPY_REST_G4.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "medico")
public class Medico {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    private String nombre;//50 CARACTERES SOLO LETRAS
    private String matricula;//20 CARACTERES
    private String especialidad;//50 caracteres
    private Integer salario;// no pede sewr negativo// minimo 8000000 //maximo 3000000
    private String ips;//50 caracteres
    private String correo;//formato @sura.com.co
    private String telefono;//10 caracteres
    private String direccion;//100 caracteres
    private Boolean estaisponiblefindesemana;

 public Medico() {
 }

 public Medico(long id, String nombre, String matricula, String especialidad, Integer salario, String ips, String correo, String telefono, String direccion, Boolean estaisponiblefindesemana) {
  this.id = id;
  this.nombre = nombre;
  this.matricula = matricula;
  this.especialidad = especialidad;
  this.salario = salario;
  this.ips = ips;
  this.correo = correo;
  this.telefono = telefono;
  this.direccion = direccion;
  this.estaisponiblefindesemana = estaisponiblefindesemana;
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

 public String getMatricula() {
  return matricula;
 }

 public void setMatricula(String matricula) {
  this.matricula = matricula;
 }

 public String getEspecialidad() {
  return especialidad;
 }

 public void setEspecialidad(String especialidad) {
  this.especialidad = especialidad;
 }

 public Integer getSalario() {
  return salario;
 }

 public void setSalario(Integer salario) {
  this.salario = salario;
 }

 public String getIps() {
  return ips;
 }

 public void setIps(String ips) {
  this.ips = ips;
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

 public String getDireccion() {
  return direccion;
 }

 public void setDireccion(String direccion) {
  this.direccion = direccion;
 }

 public Boolean getEstaisponiblefindesemana() {
  return estaisponiblefindesemana;
 }

 public void setEstaisponiblefindesemana(Boolean estaisponiblefindesemana) {
  this.estaisponiblefindesemana = estaisponiblefindesemana;
 }

 @Override
 public String toString() {
  return "Medico{" +
          "id=" + id +
          ", nombre='" + nombre + '\'' +
          ", matricula='" + matricula + '\'' +
          ", especialidad='" + especialidad + '\'' +
          ", salario=" + salario +
          ", ips='" + ips + '\'' +
          ", correo='" + correo + '\'' +
          ", telefono='" + telefono + '\'' +
          ", direccion='" + direccion + '\'' +
          ", estaisponiblefindesemana=" + estaisponiblefindesemana +
          '}';
 }
}
