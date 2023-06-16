/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;

/**
 *
 * @author Sala-2-11-PC04
 */
public class Mochila extends Inventario {
    private int idMochila;

    public Mochila(int capacidad) {
        super(capacidad);
    }

    public int getIdMochila() {
        return idMochila;
    }

    public void setIdMochila(int idMochila) {
        this.idMochila = idMochila;
    }
    

    //metodo
    public void usarObjeto(ArrayList<Interactuable> listaObjetos){
        System.out.println("objeto utilizado");
    }
}
