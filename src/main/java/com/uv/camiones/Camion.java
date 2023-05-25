package com.uv.camiones;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Camion{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String chofer;
    private Double temperaturaCelsius;
    private String objeto;
    private Integer cantidad;
    private Double latitud;
    private Double longitud;

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getChofer(){
        return chofer;
    }

    public void setChofer(String chofer){
        this.chofer = chofer;
    }

    public Double getTemperaturaCelsius(){
        return temperaturaCelsius;
    }

    public void setTemperaturaCelsius(Double temperaturaCelsius){
        this.temperaturaCelsius = temperaturaCelsius;
    }

    public String getObjeto(){
        return objeto;
    }

    public void setObjeto(String objeto){
        this.objeto = objeto;
    }

    public Integer getCantidad(){
        return cantidad;
    }

    public void setCantidad(Integer cantidad){
        this.cantidad = cantidad;
    }

    public Double getLatitud(){
        return latitud;
    }

    public void setLatitud(Double latitud){
        this.latitud = latitud;
    }

    public Double getLongitud(){
        return longitud;
    }

    public void setLongitud(Double longitud){
        this.longitud = longitud;
    }
}