/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author Victor Francis
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] oddNumbers = {1,3,5,7,9};
        String[] greetingMessage = {"Welcome","To","Arrays"};
        
        System.out.println(oddNumbers[0]);
        System.out.println(greetingMessage[0]);
        
        System.out.println("Length of Greeting Message: " + greetingMessage.length);
        
        for (int i = 0; i < greetingMessage.length; i++) {
            System.out.println("Item #" + i + " " + greetingMessage[i]);
            
        }
         int[] myArray = {1,2,3,4,5};
         
         Scanner cin = new Scanner(System.in);
         
         for (int i = 0; i < 4; i++) {
            myArray[i] = cin.nextInt();
        }
         for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
            
        }
        
        int[] evenNumbers = new int[5];
        String[] funMessage = new String[3];
        
        funMessage[0] = "Arrays ";
        funMessage[1] = "Are ";
        funMessage[2] = "Useful ";
        
        for (int i = 0; i < evenNumbers.length; i++) {
            evenNumbers[i] = cin.nextInt();
            
        }
        
        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.println("Even number Array # " + evenNumbers[i]);
            
        }
        
        for (int i = 0; i < funMessage.length; i++) {
            System.out.println("Fun Message: " + funMessage[i]);
            
        }
        
        
    }
    
}
