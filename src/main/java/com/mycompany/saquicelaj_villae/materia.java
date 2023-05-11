///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.mycompany.saquicelaj_villae;
//
///**
// *
// * @author Kristina
// */
public class materia {
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

interface Observador {
    void actualizar();
}
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

interface Observador {
    void actualizar();
}

class ObservadorPorcentajeCarga implements Observador {
    private SujetoObservadoConcreto sujetoObservado;
    private int porcentajeCarga;
    
    public ObservadorPorcentajeCarga(SujetoObservadoConcreto sujetoObservado) {
        this.sujetoObservado = sujetoObservado;
    }
    
    public void actualizar() {
        porcentajeCarga = sujetoObservado.getPorcentajeCarga();
        System.out.println("Porcentaje de carga: " + porcentajeCarga + "%");
    }
}

class ObservadorTiempoRestante implements Observador {
    private SujetoObservadoConcreto sujetoObservado;
    private int tiempoRestante;
    
    public ObservadorTiempoRestante(SujetoObservadoConcreto sujetoObservado) {
        this.sujetoObservado = sujetoObservado;
    }
    
    public void actualizar() {
        tiempoRestante = sujetoObservado.getTiempoRestante();
        System.out.println("Tiempo restante: " + tiempoRestante + " minutos");
    }
}

interface SujetoObservado {
    void agregarObservador(Observador observador);
    void eliminarObservador(Observador observador);
    void notificarObservadores();
}

class SujetoObservadoConcreto implements SujetoObservado {
    private List<Observador> observadores;
    private int porcentajeCarga;
    private int tiempoRestante;
    private Timer timer;
    private boolean cargando;
    
    public SujetoObservadoConcreto(int porcentajeCarga) {
        observadores = new ArrayList<>();
        this.porcentajeCarga = porcentajeCarga;
        tiempoRestante = calcularTiempoRestante(porcentajeCarga);
        cargando = false;
    }
    
    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }
    
    public void eliminarObservador(Observador observador) {
        observadores.remove(observador);
    }
    
    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.actualizar();
        }
    }
    
    public int getPorcentajeCarga() {
        return porcentajeCarga;
    }
    
    public int getTiempoRestante() {
        return tiempoRestante;
    }
    
    public void cargar() {
        if (!c
---------------------------------------------------------------------------------
                
                
                import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

interface Observador {
    void actualizar();
}

class ObservadorPorcentajeCarga implements Observador {
    private SujetoObservadoConcreto sujetoObservado;
    private int porcentajeCarga;
    private JLabel porcentajeCargaLabel;
    
    public ObservadorPorcentajeCarga(SujetoObservadoConcreto sujetoObservado, JLabel porcentajeCargaLabel) {
        this.sujetoObservado = sujetoObservado;
        this.porcentajeCargaLabel = porcentajeCargaLabel;
    }
    
    public void actualizar() {
        porcentajeCarga = sujetoObservado.getPorcentajeCarga();
        porcentajeCargaLabel.setText("Porcentaje de carga: " + porcentajeCarga + "%");
    }
}

class ObservadorTiempoRestante implements Observador {
    private SujetoObservadoConcreto sujetoObservado;
    private int tiempoRestante;
    private JLabel tiempoRestanteLabel;
    
    public ObservadorTiempoRestante(SujetoObservadoConcreto sujetoObservado, JLabel tiempoRestanteLabel) {
        this.sujetoObservado = sujetoObservado;
        this.tiempoRestanteLabel = tiempoRestanteLabel;
    }
    
    public void actualizar() {
        tiempoRestante = sujetoObservado.getTiempoRestante();
        tiempoRestanteLabel.setText("Tiempo restante: " + tiempoRestante + " minutos");
    }
}

interface SujetoObservado {
    void agregarObservador(Observador observador);
    void eliminarObservador(Observador observador);
    void notificarObservadores();
}

class SujetoObservadoConcreto implements SujetoObservado {
    private List<Observador> observadores;
    private int porcentajeCarga;
    private int tiempoRestante;
    private Timer timer;
    private boolean cargando;
    
    public SujetoObservadoConcreto(int porcentajeCarga) {
        observadores = new ArrayList<>();
        this.porcentajeCarga = porcentajeCarga;
        tiempoRestante = calcularTiempoRestante(porcentajeCarga);
        cargando = false;
    }
    
    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }
  -----------------------------------------------------------------------

import java.util.ArrayList;

// Clase Bateria - Sujeto Observado
class Bateria {
    private ArrayList<Observador> observadores = new ArrayList<>();
    private int porcentajeCarga = 0;
    private int tiempoRestante = 0;
    private boolean cargando = false;
    private boolean suspendida = false;
    
    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }
    
    public void eliminarObservador(Observador observador) {
        observadores.remove(observador);
    }
    
    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.actualizar(porcentajeCarga, tiempoRestante, cargando, suspendida);
        }
    }
    
    public void iniciarCarga(int porcentajeInicial) {
        porcentajeCarga = porcentajeInicial;
        tiempoRestante = (100 - porcentajeCarga) * 30;
        cargando = true;
        suspendida = false;
        notificarObservadores();
        
        // Temporizador para incrementar el porcentaje de carga cada minuto
        Thread hiloCarga = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (porcentajeCarga < 100) {
                        Thread.sleep(60000); // Esperar un minuto
                        porcentajeCarga += 2;
                        tiempoRestante = (100 - porcentajeCarga) * 30;
                        notificarObservadores();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        hiloCarga.start();
    }
    
    public void desconectar() {
        cargando = false;
        notificarObservadores();
    }
    
    public void descargar() {
        // Temporizador para disminuir el porcentaje de carga cada minuto
        Thread hilo
----------------------------------------------------------------------------------------
//   Sujeto: la clase BATERIA actúa como sujeto, ya que es el objeto que es observado y notifica a los observadores sobre sus cambios de estado.
//Observador: se pueden implementar observadores para cada una de las dos métricas solicitadas: porcentaje de carga y tiempo restante de carga. Estos observadores recibirán notificaciones del sujeto y actualizarán sus valores correspondientes.
//Observadores concretos: cada observador concreto implementará la lógica necesaria para actualizar sus valores cuando el sujeto le notifique un cambio de estado.
//Cliente: en este caso, el cliente sería la aplicación que se encargará de crear los objetos BATERIA, Observador y ObservadorConcreto, y de coordinar sus interacciones.     
//        
        import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

interface Sujeto {
    void registrarObservador(Observador o);
    void eliminarObservador(Observador o);
    void notificarObservadores();
}

interface Observador {
    void actualizar();
}

class BATERIA implements Sujeto {
    private int porcentajeCarga;
    private int tiempoRestante;
    private boolean cargando;
    private List<Observador> observadores = new ArrayList<>();

    public void setPorcentajeCarga(int porcentajeCarga) {
        this.porcentajeCarga = porcentajeCarga;
    }

    public void setTiempoRestante(int tiempoRestante) {
        this.tiempoRestante = tiempoRestante;
    }

    public void setCargando(boolean cargando) {
        this.cargando = cargando;
    }

    public int getPorcentajeCarga() {
        return porcentajeCarga;
    }

    public int getTiempoRestante() {
        return tiempoRestante;
    }

    public boolean isCargando() {
        return cargando;
    }

    @Override
    public void registrarObservador(Observador o) {
        observadores.add(o);
    }

    @Override
    public void eliminarObservador(Observador o) {
        observadores.remove(o);
    }

    @Override
    public void notificarObservadores() {
        for (Observador o : observadores) {
            o.actualizar();
        }
    }

    public void iniciarCarga() {
        setCargando(true);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            int contador = 0;
            @Override
            public void run() {
                contador++;
                setPorcentajeCarga(getPorcentajeCarga() + 2);
                if (getPorcentajeCarga() == 100) {
                    timer.cancel();
                }
                setTiempoRestante((100 - getPorcentajeCarga()) * contador / 2);
                notificarObservadores();
            }
        }, 0, 1000);
    }

    public void desconectar() {
        setCargando(false);
    }

    public void descargar() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                setPorcentajeCarga(getPorcentajeCarga() - 2);
                notificarObservadores();
            }
        }, 0, 1000);
    }
}

class ObservadorPorcentaje implements Observador {
    private BATERIA bateria;
    private int porcentajeC

}

        
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

interface Sujeto {
    void registrarObservador(Observador o);
    void eliminarObservador(Observador o);
    void notificarObservadores();
}

interface Observador {
    void actualizar();
}

class BATERIA implements Sujeto {
    private int porcentajeCarga;
    private int tiempoRestante;
    private boolean cargando;
    private List<Observador> observadores = new ArrayList<>();

    public void setPorcentajeCarga(int porcentajeCarga) {
        this.porcentajeCarga = porcentajeCarga;
    }

    public void setTiempoRestante(int tiempoRestante) {
        this.tiempoRestante = tiempoRestante;
    }

    public void setCargando(boolean cargando) {
        this.cargando = cargando;
    }

    public int getPorcentajeCarga() {
        return porcentajeCarga;
    }

    public int getTiempoRestante() {
        return tiempoRestante;
    }

    public boolean isCargando() {
        return cargando;
    }

    @Override
    public void registrarObservador(Observador o) {
        observadores.add(o);
    }

    @Override
    public void eliminarObservador(Observador o) {
        observadores.remove(o);
    }

    @Override
    public void notificarObservadores() {
        for (Observador o : observadores) {
            o.actualizar();
        }
    }

    public void iniciarCarga() {
        setCargando(true);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            int contador = 0;
            @Override
            public void run() {
                contador++;
                setPorcentajeCarga(getPorcentajeCarga() + 2);
                if (getPorcentajeCarga() == 100) {
                    timer.cancel();
                }
                setTiempoRestante((100 - getPorcentajeCarga()) * contador / 2);
                notificarObservadores();
            }
        }, 0, 1000);
    }

    public void desconectar() {
        setCargando(false);
    }

    public void descargar() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                setPorcentajeCarga(getPorcentajeCarga() - 2);
                notificarObservadores();
            }
        }, 0, 1000);
    }
}

class ObservadorPorcentaje implements Observador {
    private BATERIA bateria;
    private int porcentajeCarga;
    private JLabel labelPorcentaje;

    public ObservadorPorcentaje(BATERIA bateria, JLabel labelPorcentaje) {
        this.bateria = bateria;
        this.labelPorcentaje = labelPorcentaje;
        porcentajeCarga = bateria.getPorcentajeCarga();
    }

    @Override
    public void actualizar() {
        porcentajeCarga = bateria.getPorcentajeCarga();
        labelPorcentaje.setText("Porcentaje de carga: " + porcentajeCarga + "%");
    }
}

class ObservadorTiempo implements Observador {
    private BATERIA bateria;
    private int tiempoRestante;
    private JLabel labelTiempo;

    public ObservadorTiempo(BATERIA bateria, JLabel labelTiempo) {
        this.bateria = bateria;
        this.labelTiempo

}