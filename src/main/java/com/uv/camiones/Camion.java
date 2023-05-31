package com.uv.camiones;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Clase Camion que sirve de apoyo para guardar los datos de las entidades que se registrarán.

@Entity
public class Camion{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String chofer;
    private ArrayList<Double> temperatura;
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

    public ArrayList<Double> getTemperatura(){
        return temperatura;
    }

    public void setTemperatura(ArrayList<Double> temperatura){
        this.temperatura = temperatura;
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