package com.example.recyclervuewpares;


public class Clientes {

    private String nombre;
    private String mage;

    public String getMage() {
        return this.mage;
    }

    public void setMage(String mage) {
        this.mage = mage;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Clientes() { }

    public Clientes(String nombre, String mage) {
        this.nombre = nombre;
                this.mage= mage ;
    }




}