 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;

public abstract class Inventario {
    private int capacidad;
    private ArrayList<Interactuable> listaObjeto;

    public Inventario(int capacidad) {
        this.capacidad = capacidad;
        listaObjeto = new ArrayList<>();
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public ArrayList<Interactuable> getListaObjeto() {
        return listaObjeto;
    }

    public void setListaObjeto(ArrayList<Interactuable> listaObjeto) {
        this.listaObjeto = listaObjeto;
    }
    public void create(Interactuable objeto) {
        if (listaObjeto.size() < capacidad) {
            listaObjeto.add(objeto);
            System.out.println("Objeto agregado con éxito.");
        } else {
            System.out.println("No se puede agregar el objeto. La lista está llena.");
        }
    }

    public void read() {
        if (listaObjeto.isEmpty()) {
            System.out.println("La lista está vacía.");
        } else {
            System.out.println("Lista de objetos:");
            for (Interactuable objeto : listaObjeto) {
                System.out.println(objeto.toString());
            }
        }
    }

    public void update(int indice, Interactuable objeto) {
        if (indice >= 0 && indice < listaObjeto.size()) {
            listaObjeto.set(indice, objeto);
            System.out.println("Objeto actualizado con éxito.");
        } else {
            System.out.println("Índice inválido. No se pudo actualizar el objeto.");
        }
    }

    public void delete(int indice) {
        if (indice >= 0 && indice < listaObjeto.size()) {
            listaObjeto.remove(indice);
            System.out.println("Objeto eliminado con éxito.");
        } else {
            System.out.println("Índice inválido. No se pudo eliminar el objeto.");
        }
    }
}
 