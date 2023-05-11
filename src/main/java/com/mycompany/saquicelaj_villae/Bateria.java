/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.saquicelaj_villae;

import java.util.ArrayList;

/**
 *
 * @author Kristina
 */
public class Bateria {

    ArrayList<Observador> observador = new ArrayList<>();
    private int bateria=0;
    private int tiempoRestante = 0;
    private boolean cargando = false;
    private boolean suspendida = false;

    public ArrayList<Observador> getObservador() {
        return observador;
    }

    public void setObservador(ArrayList<Observador> observador) {
        this.observador = observador;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public int getTiempoRestante() {
        return tiempoRestante;
    }

    public void setTiempoRestante(int tiempoRestante) {
        this.tiempoRestante = tiempoRestante;
    }

    public boolean isCargando() {
        return cargando;
    }

    public void setCargando(boolean cargando) {
        this.cargando = cargando;
    }

    public boolean isSuspendida() {
        return suspendida;
    }

    public void setSuspendida(boolean suspendida) {
        this.suspendida = suspendida;
    }
    
    public void agregarObservador(Observador observadorAgregar){
        observador.add(observadorAgregar);
    }
    
    public void notificarObservadores(){
        for (Observador ob : observador) {
            ob.actualizar(bateria, tiempoRestante, cargando, suspendida);
            ob.actualizar();
            
        }
    }

}
