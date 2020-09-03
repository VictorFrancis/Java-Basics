/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;
import java.util.List;

/**
 *
 * @author Victor Francis
 */
public class ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List newList = new java.util.ArrayList();
        newList.add(0,57);
        newList.add(1,68);
        newList.add(2,79);
        newList.add(3,70);
        for (int i = 0; i <newList.size() ; i++) {
            System.out.println(newList.get(i));
        }
        //This is advanced for loop
        for (Object o: newList) {
            System.out.println(newList);
        }

        List vegetables = new java.util.ArrayList();

        vegetables.add("Tomato");
        vegetables.add("Spinach");
        vegetables.add("Radish");
        vegetables.add("Carrot");
        vegetables.add("Potato");

        for (int i = 0; i <vegetables.size() ; i++) {
            System.out.println(vegetables.get(i));
        }

        vegetables.remove("Radish");
        vegetables.remove(1);
        for (int i = 0; i <vegetables.size() ; i++) {
            System.out.println(vegetables.get(i));
        }

        if (vegetables.contains("Potato")){
            System.out.println("You Love potato");
        }
        else{
            System.out.println("You got not potato");
        }

    }
    
}
