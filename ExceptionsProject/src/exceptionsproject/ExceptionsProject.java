
package exceptionsproject;

/**
 *
 * @author HENRYELL
 */
public class ExceptionsProject {

    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
  //int[]  intArray = new[10];
  //System.out,println(intArray[10]);
    try{
    int[ ] c = new int[6];
    System.out.println("Element 6 at index 5 ="+c[10]);
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Exception thrown"+e);
    }
    finally{
    System.out.println("Finally clause");
    }
    }
}
