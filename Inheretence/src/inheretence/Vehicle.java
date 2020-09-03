/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheretence;

/**
 *
 * @author Victor Francis
 */
public class Vehicle {
    
    //properties
    public String body;
    public int numberOfWheels;
    public int numberOfHorns;
    
    //
    public void accelerate(){
    
        System.out.println("Accelerating");
    }
    
    public void horn(){
        System.out.println("Beeep!");
    }
    
    public void brake(){
        System.out.println("Brake applied");
    }
}
