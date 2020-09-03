
package classes.objects;

import java.math.BigInteger;

/**
 *
 * @author Victor Francis
 */
public class Phone { //This is a blueprint of Phones, we call it class
    
    //Public - anyone can access
    //Private - Only accessed within the class
   
    //Children classes
    //Properties or instance variables
    public String name;
    public String model;
    public int serial;
    private int IMEI;
    private String OS;
    private String color;
    private long number;
    
    
    //Constructors - A method that every class has, it is used to set properties of an object, before creating the object
 
    public Phone(){ //Empty constructor for extensions
        //default
    }
    
    public Phone(int IMEI, String mOS){
        
        this.IMEI = IMEI; //this.IMEI is the variable we set for current Phone.IMEI
                          //IMEI is the variable we receive form the main
        OS = mOS;
    }
    
    //Constructor Overloading - We can have more than 1 constructor but it has to have different parameters
    
    public Phone(int IMEI, String mOS, long mNumber){
        
        this.IMEI = IMEI; //this.IMEI is the variable we set for current Phone.IMEI
                          //IMEI is the variable we receive form the main
        OS = mOS;
        
        number = mNumber;
    }
    
    //Behaviors or functions
    
    //We need to create sepearte public functions to gain access to private variables
    public void showIMEI(){
        
        //IMEI is the same IMEI we have on the class Phone.IMEI
        System.out.println("IMEI: " + IMEI);
    
    }
    
    public void showOS(){
    
        System.out.println("OS: " + OS);
    }
    
    //SETTERS & GETTERS
    public void setColor(String mColor){
    
        color = mColor;
    
    }
    
    public String getColor(){
    
        return color;
    }
    
    public void setNumber(long number){
    
        this.number = number;
    
    }
    
    public long getNumber(){
    
        return number;
    
    }
    
    
    
    public void makeCall(){
        
        System.out.println("Making a call");
    
    }
    public void sendMessage(){
        
        System.out.println("Sending a Message");
    
    }
    public void playMusic(){
        
        System.out.println("Playing Music");
    
    }
    public void takePictures(){
        
        System.out.println("Taking Pictures");
    
    }
    
    
}
