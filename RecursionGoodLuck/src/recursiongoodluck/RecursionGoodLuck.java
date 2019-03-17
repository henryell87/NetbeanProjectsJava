
package recursiongoodluck;

/**
 *
 * @author HENRYELL
 */
public class RecursionGoodLuck {

 // f(f(f(x)))----a = 20
    // f(a) = 5+a
    // f(20) = 5 +20 = 25
    
    
    public static int Summation(int n){
        // Base case We are at an end
        if(n <= 0){
            return 0;
        
        // Recursive case KEEP GOING
    }
      else{
    // 3 + Summation(2);
    // 3 + 2 + Summation(1);
    // 3 + 2 +1 + Summation(0);
    // 3 + 2 + 1 + 0 = 6        
    return n + Summation(n-1);
  }
}
    
    public static int Factorial(int n){
        // Base case
        if(n <= 1){
            return 1;
        }
        // Recursive case
        else{
            // Factorial(4) = 4 * Factorial(3);
            // 4 * 3 * Factorial(2);
            // 4 * 3 * 2 * Factorial(1);
            // 4 * 3 * 2 * 1 
            return n * Factorial(n - 1);
        }
    }
    
    
    // 5^3 = 5 * 5 * 5 
    public static int exponentiation(int n, int p){
        // Base case
        if(p <= 0){ // mult idenity
            return 1;
        }
        // Recursive
        else{
          // 5 * exponentiation(5,2);
          // 5 * 5 *exponentiation(5,1);
          // 5 * 5 * 5 * exponentiation(5,0);
          // 5 * 5 *  5 = !
          return n * exponentiation(n, p-1);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Summation(3));
        System.out.println(Factorial(3));
        System.out.println(exponentiation(5,3));
        
        
        
    }
    
}
