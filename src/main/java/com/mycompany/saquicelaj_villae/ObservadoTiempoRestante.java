/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.saquicelaj_villae;

/**
 *
 * @author Kristina
 */
public class ObservadoTiempoRestante extends Observador {
 private Bateria bateria;

    public ObservadorTiempoRestante(Bateria bateria) {
        this.bateria = bateria;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o == bateria) {
            System.out.println("Tiempo restante: " + bateria.getTiempoRestante() + " minutos");
        }
    }
    @Override
    public void actualizar() {

    }

    @Override
    public void agregar(Bateria sujeto) {

    }

}
