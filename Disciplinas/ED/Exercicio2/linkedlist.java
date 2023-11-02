/*
 
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package com.mycompany.testeed;

/**
 *
 
@author filip
@param <T>
*/
public class linkedlist<T> {
    
    private node<T> head;
    private node<T> tail;


    public node<T> getHead() {
        return head;
    }
        
    public node<T> setHead(node data) {
        this.head = data;
        return data;
    }
        
    public node<T> getTail() {
        return tail;
    }
        
    public node<T> setTail(node data) {
        this.tail = data;
        return data;
    }
        
    public void add(T data){ 
    node<T> newNode = new node<>(data);
    newNode.setNext((head == null) ? tail : head);
    head = newNode ;
    } 
    
    
    public void remove(T data) {
    if (head == null) {
        // List is empty, nothing to delete
        return;
    }
    if (head.getElement().equals(data)) {
        // If the element to delete is in the head node, remove the head
        head = head.getNext();
        
        // If the list is now empty, update tail to null
        if (head == null) {
            tail = null;
        }
        return;
    }
    
    node<T> current = head;
    while (current.getNext() != null && !current.getNext().getElement().equals(data)) {
        current = current.getNext();
    }
    
    if (current.getNext() != null) {
        // Element found in the middle or at the end of the list, remove it
        current.setNext(current.getNext().getNext());
        
        // If we removed the last element, update tail to the current node
        if (current.getNext() == null) {
            tail = current;
        }
    }
}
    
    
   @Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    node<T> current = head;

    sb.append("LinkedList: ");

    while (current != null) {
        sb.append(current.getElement()); // Use getData() to get the element from the node
        if (current.getNext() != null) {
            sb.append(" -> ");
        }
        current = current.getNext();
    }

    return sb.toString();
}
}