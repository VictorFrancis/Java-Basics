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
public class Inheretence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehicle newVehicle = new Vehicle();
        newVehicle.body = "BLACK";
        newVehicle.numberOfWheels = 2;
        newVehicle.numberOfHorns = 1;
        newVehicle.accelerate();
        
        Bike newBike = new Bike();
        newBike.motor = true;
        newBike.gasTank = 20;
        
        newBike.accelerate();
    }
        
    
}
