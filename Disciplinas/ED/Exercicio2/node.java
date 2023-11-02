/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testeed;

/**
 *
 * @author filip
 * @param <T>
 */

public class node<T>  {
    
    private T element;
    node<T> next;
     
     public node(T element){
         this.element = element;
         this.next = null;
     }

    public T getElement() {
        return element;
    }

    public node<T> getNext() {
        return next;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public void setNext(node<T> next) {
        this.next = next;
    }
     


        
        
     
}
