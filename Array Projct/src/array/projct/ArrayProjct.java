
package array.projct;

//import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author HENRYELL
 */
public class ArrayProjct {
    
    public static<E> void printArray(E[] array){
        System.out.print("[");
        
        for(E element : array){
            System.out.print(element + " ");
        }
        
       // Integer [] intArray1;
       // Integer[] intArray2 = new Integer[4];
        //for (int i = 0; i < array.length; i++){
          //  E item = array[i];
            //System.out.print(item);
            //if(i < array.length - 1){
              //  System.out.print(",");
            //}
        //}
        //System.out.println("]");
    }

   // public static void printArray(String[] array){
     //   System.out.print("[");
       // for (int i = 0; i < array.length; i++){
         //   String item = array[i];
           // System.out.print(item);
            //if(i < array.length - 1){
              //  System.out.print(",");
            //}
        //}
        //System.out.println("]");
    //}

    
    public static void main(String[] args) {
        // TODO code application logic here
        //Index; 0  1  2  3  4
        //Array:[0, 9, 3, 2. 1] --> length 5
        
        //Random objects from array
        //Math.abs(rand.nextInt) % length;
        
        // Index:    0       1        2
        // Array: ["bob", "sally", "max"] --> length 3
        // Declaring, Allocating, and Initilizing
        Integer[] intArray1;
        Integer[] intArray2 = new Integer[4];
        printArray(intArray2);
        Integer[] intArray3 = {5, 2, 1, 9, 3};
        
        String[] shoppingList = {"bannas", "apples", "pears"};
        
         //Index; 0  1  2  3  
        //Array:[10, 8, 5, 10] --> length 4
        
        intArray2[0] = 10;
        intArray2[1] = 8;
        intArray2[2] = 5;
        intArray2[3] = 3;
        
        // Print out Arrays
        System.out.println(Arrays.toString(intArray2));
        System.out.println(Arrays.toString(intArray3));
        System.out.println();
        // custom print out arrays
        printArray(intArray2);
        printArray(intArray3);
        
        // Retrieve objcts
        System.out.println(intArray2[3]);
        System.out.println();
        
        
        // Given functions
        Arrays.sort(intArray3);
        printArray(intArray3);
        
        //Print String Array
        printArray(shoppingList);
        
        System.out.println("Special for loop");
        // Special for loop foreach
        for(String s: shoppingList){
            System.out.println(s);
        }
        
        
    }
}
 