
package persons;

import static persons.HairColor.*;

/**
 *
 * @author HENRYELL
 */
public class Persons {

    
     HairColor hairColor = BLACK;
    
    public Persons(){
       int a = 5; 
    }
    
    
               
    
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persons peterParker = new Persons();
        Persons spiderMan = peterParker;
        
        peterParker.hairColor = PINK;
        
        
        System.out.println("Hair Color of Peter Parker "+ peterParker.hairColor);
        System.out.println("Hair Color of Spiderman "+ spiderMan.hairColor);
    }
    
}