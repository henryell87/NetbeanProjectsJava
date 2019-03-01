
package dictionart.practice;

import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author HENRYELL
 */
public class DictionartPractice {

    
    
    
    
    public static void main(String[] args) {
        // English to Spanish Dictionary
        Map<String,String>englSpanDictionary = new HashMap<String,String>();
        // Puttig things inside our dictionary
        englSpanDictionary.put("Monday","Lunes");
        englSpanDictionary.put("Tuesday","Martes");
        englSpanDictionary.put("Wednesday","Miercoles");
        englSpanDictionary.put("Sunday","Domingo");
        
        // Retrieve things from our dictionary
        System.out.println(englSpanDictionary.get("Monday"));
        System.out.println(englSpanDictionary.values());
        System.out.println(englSpanDictionary.get("Tuesday"));
        System.out.println(englSpanDictionary.get("Wednesday"));
        System.out.println(englSpanDictionary.get("Thursday"));
        englSpanDictionary.put("Thursday","Jueves");
        englSpanDictionary.put("Friday","Viernes");
        englSpanDictionary.put("Saturday","Sabado");
        System.out.println(englSpanDictionary.get("Friday"));
        // print out all keys
        System.out.println(englSpanDictionary.keySet());
        // Print out all keys
        // print out size
        System.out.println("The size of our Dictionary is "+englSpanDictionary.size());
        
        
        // Shopping list
        Map<String,Boolean>shoppingList = new HashMap<String,Boolean>();
        // Put some stuff in dictionary
        shoppingList.put("Ham", true);
        shoppingList.put("Bread", Boolean.TRUE);
        shoppingList.put("Eggs", Boolean.FALSE);
        shoppingList.put("Sugar", false);
        shoppingList.put("Oreos",Boolean.TRUE);
        // Retrieve items
        System.out.println(shoppingList.get("Ham"));
        System.out.println(shoppingList.get("Sugar"));
        System.out.println(shoppingList.get("Oreos"));
        //Key-Value Pairs Print Out
        System.out.println(shoppingList.toString());
        // Is Empty
        System.out.println(shoppingList.isEmpty());
        //Remove things
        shoppingList.remove("Eggs");
        // Replce things
        shoppingList.replace("Bread", Boolean.FALSE);
        // 
        System.out.println(shoppingList.toString());
         // Clear Dictionary
        shoppingList.clear();
        System.out.println(shoppingList.toString());
        // Is Empty
        System.out.println(shoppingList.isEmpty());
        
    }
    
}
