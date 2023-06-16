/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Pokedex extends Inventario{

    public Pokedex(int capacidad) {
        super(capacidad);
    }

    
    //metodo
    public void elegirPokemon(ArrayList<Interactuable> listaObjetos, String nombrePokemon, int IdPokemon){
        for(int i=0;i<listaObjetos.size();i++){
            if(nombrePokemon.equals(listaObjetos.get(i).getNombreObjeto())){
               System.out.println("el pokemon esta entre los objetos");
               break;
            }    
        }
        listaObjetos.add(IdPokemon, nombrePokemon);
        System.out.println("el equipo ha sido elegido");
        
    }
    
}
