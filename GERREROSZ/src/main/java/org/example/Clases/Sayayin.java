package org.example.Clases;

public abstract class Sayayin {

    private String nombres;
    private Integer cantidadPoder;

    public Sayayin() {
    }

    public Sayayin(String nombres, Integer cantidadPoder) {
        this.nombres = nombres;
        this.cantidadPoder = cantidadPoder;
    }

    public void comer(){
        System.out.println("todo me lo como");
    }
    public abstract void pelear();
}
