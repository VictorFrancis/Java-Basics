/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getting.ready;

/**
 *
 * @author Victor Francis
 */
public class GettingReady {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Print
        System.out.println("Hello World");
        
        //Variables        
        String firstName = "Victor";
        String lastName = "Francis";
        System.out.println(firstName);
        
        //Integers
        int myAge = 24;                 
        System.out.println(myAge);
        
        //Concatenation
        System.out.println("Hi! My Name is " + firstName + " " + lastName + " I am " + myAge + " years old.");
        
        //Byte - small type | MAX[127]
        byte myByte = 127;
        
        //short - 2x byte
        short myShort = 129;
        
        //Float - decimal numbers with 1 digit
        float myfloat = 3.14f;
        
        //Double - decimal numbers with more than 1 digit
        double myDouble = 23.27;
        
        //char - characters
        char myChar = 'V';
        
        //Boolean - true or false | 1 or 0
        boolean myBool = true;
        
        //====OPERATORS=====
        double num1 = 23.42;
        double num2 = 56.41;
        double product,sum,difference,dividend,remainder;
        
        //Addition(+), Subtraction(-), Multiplication(*), Division(/), Remainder(%)
        sum = num1 + num2;
        product = num1 * num2;
        difference = num1 - num2;
        dividend = num1 / num2;
        remainder = num1 % num2;
        
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Difference: " + difference);
        System.out.println("Division: " + dividend);
        System.out.println("Remainder: " + remainder);
        
        System.out.println("Sum: " + (num1 + num2));
        
        //=========Relational Operators========
        
        int num3 = 10;
        int num4 = 20;
        
        // == (Strictly equal)
        if (num3 == num4){
            System.out.println("number 3 is equal to number 4");
        }
        else{
            System.out.println("number 3 is not equal to number 4");
        }
        
        // != (Not equal)
        if (num3 != num4){
            System.out.println("number 3 is not equal to number 4");
        }
        else{
            System.out.println("number 3 is equal to number 4");
        }
        
        // > (greater than)
        if (num3 > num4){
            System.out.println("number 3 is greater than number 4");
        }
        else{
            System.out.println("number 3 is less than number 4");
        }
        
        // < (less than)
        if (num3 < num4){
            System.out.println("number 3 is less than number 4");
        }
        else{
            System.out.println("number 3 is greater than number 4");
        }
        
        // > (greater or equal)
        if (num3 >= num4){
            System.out.println("number 3 is greater than or equal number 4");
        }
        else{
            System.out.println("number 3 is less than or equal number 4");
        }
        
        // < (less or equal)
        if (num3 <= num4){
            System.out.println("number 3 is less than or equal number 4");
        }
        else{
            System.out.println("number 3 is greater than or equal number 4");
        }
        
        //=========Logical Operators=======
        
        boolean isOld = true;
        boolean isYoung = false;
        
        //AND(&&) [Both sides need to be true to be finally true]
        if (isOld && isYoung){
            System.out.println("You're crazy");
        }
        else{
            System.out.println("It's okay, we are confused");
        }
        
        //OR(||) [Either one of them needs to be true to be finally true]
        if (isOld || isYoung){
            System.out.println("You're either old or young, dosen't matter");
        }
        else{
            System.out.println("None?! What are you?");
        }
        
        //NOT(!) [Needs to be false or opposite]
        if (isOld == !isYoung){
            System.out.println("You're old");
        }
        else{
            System.out.println("You're young");
        }
        
        //========LOOPS===========
        
        //for loop
        
        for (int i=0; i<5; i++){
            System.out.println("Counting for " + i);
            if(i % 2 == 0){
                System.out.println(i +" is even");
            }
            else{
                System.out.println(i +" odd");
            }
        }
        
        //while loop
        
        int w = 0;
        
        while(w < 5){
            System.out.println("Counting while " + w);
            w++;
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
