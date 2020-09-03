/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.objects;

/**
 *
 * @author Victor Francis
 */
public class ClassesObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //This is how we make objects
        Phone newPhone2 = new Phone();
        
        //This is how we set values to private variables [SETTERS]
        newPhone2.setColor("GREY");
        newPhone2.setNumber(1744783783);
        
        
        //This is how we get values from private variables [GETTERS]
        System.out.println("Color: " + newPhone2.getColor());
        System.out.println("Phone Number: " + newPhone2.getNumber());
        
        //This is how we make an object and set values to private variables
        Phone newPhone = new Phone(312,"iOS");
        
        //This is how we set values to public variables
        newPhone.name = "iPhone";
        newPhone.model = "6S";
        newPhone.serial = 167832;
        
        System.out.println("Name of the Phone: " + newPhone.name + " " + newPhone.model);
        System.out.println("Serial Number: " + newPhone.serial);
        
        newPhone.makeCall();
        newPhone.sendMessage();
        newPhone.playMusic();
        newPhone.takePictures();
        
        //function calls for private variables of Phone class
        newPhone.showIMEI();
        newPhone.showOS();
    }
    
}
