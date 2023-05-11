/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.saquicelaj_villae;

/**
 *
 * @author Kristina
 */
public class ObservadorBateria extends Observador {
     private Bateria sujeto;
    private int porcentajeCarga;
    
    public ObservadorBateria(Bateria sujeto) {
        this.sujeto = sujeto;
    }
    
    public void actualizar() {
        porcentajeCarga = sujeto.getBateria();
        System.out.println("Porcentaje de carga: " + porcentajeCarga + "%");
    }
    @Override
    public void actualizar(){
    
    }

    @Override
    public void agregar(Bateria sujeto) {
    
    }
    
}
