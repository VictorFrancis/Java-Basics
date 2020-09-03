/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclasslibrary;

import java.util.Scanner;

/**
 *
 * @author Victor Francis
 */
public class JavaClassLibrary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        StringBuilder string = new StringBuilder();
        
        string.append("I love");
        string.append(" Programming");
        
        System.out.println(string);
        
        string.delete(0, 1);
        
        System.out.println(string);
        
        System.out.println(string.capacity());
        
        Scanner cin = new Scanner(System.in);
        
        int store = cin.nextInt();
        
        System.out.println(store);

    }
    
}
