/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ESTUDIANTES
 */
import java.util.LinkedList;
import java.util.Queue;

public class Cola<T> {
    private Queue<T> items;
    
    public Cola() {
        items = new LinkedList<>();
    }
    
    public void enqueue(T item) {
        items.add(item);
        System.out.println("-> Encolado: " + item);
    }
    
    public T dequeue() {
        if (estaVacia()) {
            System.out.println("La cola está vacía");
            return null;
        }
        T item = items.poll();
        System.out.println("-> Desencolado: " + item);
        return item;
    }
    
    public T front() {
        return items.peek();
    }
    
    public boolean estaVacia() {
        return items.isEmpty();
    }
    
    public void mostrar() {
        System.out.println("COLA [Frente -> Final]: " + items);
    }
}