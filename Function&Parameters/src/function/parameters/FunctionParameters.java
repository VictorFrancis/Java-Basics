/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function.parameters;

/**
 *
 * @author Victor Francis
 */
public class FunctionParameters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String myName = "Victor Francis";
        int age = 24;
        
        int num1 = 10;
        int num2 = 100;
        String streetName = "57 East Rajabazar";
        String cityName = "Dhaka-1215, Bangladesh";
        char group = 'B';
        
        welcomeMessage();
        DisplayBiodata(myName, age);
        Addition(num1, num2);
        System.out.println("Difference: " + Subtraction(num1, num2));
        System.out.println("Product: " + Multiplication(num1, num2));
        System.out.println("Address: " + LoadAddress(streetName, cityName));
        System.out.println("Blood Group: " + LoadBloodGroup(group) + "+");
        
    }
    
    //Methods or Functions
    
    public static void welcomeMessage() {
        System.out.println("This is all about functions &  parameters");
    }
    
    public static void DisplayBiodata(String myName, int age) {
        System.out.println(myName);
        System.out.println(age);
    }
    
    public static void Addition(int num1, int num2) {
        System.out.println("Sum: " + (num1 + num2));
    }
    
    //Returns integer
    
    public static int Subtraction(int num1, int num2) {
        return num1 - num2;
    }
    
    public static int Multiplication(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }
    
    public static String LoadAddress(String streetName, String cityName) {
        return streetName + " " +cityName;
    }
    
    public static char LoadBloodGroup(char group) {
        return group;
    }
}
