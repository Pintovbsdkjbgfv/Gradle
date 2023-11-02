/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testeed;

/**
 *
 * @author filip
 */
public class main {

    public static void main(String[] args) {
        
     ArrayStack ll = new ArrayStack<Integer>();
     
     ll.add(1);
     ll.add(2);
     ll.add(3);
     ll.add(4);
     
     ll.remove(2);
     ll.remove(4);
     
         

    
    System.out.println(ll.toString());
   }
}
