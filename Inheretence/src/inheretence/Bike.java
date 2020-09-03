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
public class Bike extends Vehicle{ //Bike inherets Vehicle
    
    //unique properties only apply to bike
    public boolean motor;
    public int gasTank;
    
    //functions
    public void shiftGear(){
    }
    
    @Override //function of parent class is overidden
    public void accelerate(){
    
        System.out.println("Bike is accelerating");
    }
}
