/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ESTUDIANTES
 */


import java.util.ArrayList;

public class Pila<T> {
    private ArrayList<T> items;
    
    public Pila() {
        items = new ArrayList<>();
    }
    
    public void push(T item) {
        items.add(item);
        System.out.println("-> Apilado: " + item);
    }
    
    public T pop() {
        if (estaVacia()) {
            System.out.println("La pila está vacía");
            return null;
        }
        T item = items.remove(items.size() - 1);
        System.out.println("-> Desapilado: " + item);
        return item;
    }
    
    public T peek() {
        if (estaVacia()) return null;
        return items.get(items.size() - 1);
    }
    
    public boolean estaVacia() {
        return items.isEmpty();
    }
    
    public void mostrar() {
        System.out.println("PILA [Tope -> Base]: " + items);
    }
}