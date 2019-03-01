
package hotchocolate;

/**
 *
 * @author HENRYELL
 */
public class HotChocolate {

  public static final double tooHot = 185;
  public static final double tooCold = 160;
  
  public static void drinkHotChocolate(double cocoaTemp) throws TooHotException,
          TooColdException {
      if(cocoaTemp >= tooHot){
          throw new TooHotException();
      }else if(cocoaTemp <= tooCold){
          throw new TooColdException();
      }
  }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        double currentCocoaTemp = 170;
        try{
           drinkHotChocolate(currentCocoaTemp);
           System.out.println("That cocoa as good!");
        }catch(TooHotException c1){
            System.out.println("THAT'S TOO HOT!");
        }catch(TooColdException c2){
            System.out.println("THAT'S SO COLD! It's like the artic");
        
    }
        System.out.println("And it's gone");
    }  
}
