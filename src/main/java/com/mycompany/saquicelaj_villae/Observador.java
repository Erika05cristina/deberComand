/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.saquicelaj_villae;

/**
 *
 * @author Kristina
 */
public abstract class Observador {

    protected Bateria sujeto;

    public abstract void actualizar();

    public abstract void agregar(Bateria sujeto);

}
