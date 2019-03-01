
package librarycatalogue;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author HENRYELL
 */
public class LibraryCatalogue {

    
    Map<String,Book> bookCollection = new HashMap<String,Book>();
    
    int currentDay = 0;
    int lengthOfCheckedoutPeriod = 7;
    double initialLateFee = 0.50; 
    double feePerLateDay = 1.00;
    
    // Constructors
    
    public LibraryCatalogue(Map<String,Book> collection){
        this.bookCollection = collection;
    } 
    
    public LibraryCatalogue(Map<String,Book> collection, int LengthOfCheckouPeriod,
            double initialLateFee, double feePerLateDay){
        this.bookCollection = collection;
        int lengthofCheckedoutPeriod;
        this.lengthOfCheckedoutPeriod = lengthOfCheckedoutPeriod;
        this.initialLateFee = initialLateFee;
        this.feePerLateDay = feePerLateDay;
        
        
    } 
    
    // Getters
    public int getCurrentDay(){
        return this.currentDay;
    }
    
     public Map<String, Book> getBookCollection(){
        return this.bookCollection;
    }
     
     public Book getBook(String bookTitle){
        return getBookCollection().get(bookTitle);
    } 
    
     public int getLengthOfCheckoutPeriod(){
        return this.lengthOfCheckedoutPeriod;
    }
    
     public double getInitialLateFee(){
        return this.initialLateFee;
    }
     
      public double getFeePerLateDay(){
        return this.feePerLateDay;
    }
      
    // Setters  
     public void nextday(){
         currentDay++;
     } 
      
      public void setDay(int day){
          currentDay = day;
      }
      
      // INTANCE METHODS
      
      public void checkOutBook(String title){
          Book book = getBook(title);
          if(book.getIsCheckedOut()){
              sorryBookAlreadyCheckedOut(book);
          }else{
              book.setIsCheckedOut(true, currentDay);
              System.out.println("you just checked out"+ title +", it is due on day "+
                      (getCurrentDay()+ getLengthOfCheckoutPeriod())+",");
          }
      }
      
      public void returnBook(String title){
         Book book = getBook(title);
         int daysLate = currentDay - (book.getDayCheckedOut() + getLengthOfCheckoutPeriod());
         if(daysLate > 0){
             System.out.println("You owe the Library $" + (getInitialLateFee() + daysLate + getFeePerLateDay()) +
             " because your book is "+ daysLate+ "days overdue.");
         } else{
             System.out.println("Book Returned. Thank You");
         }
         book.setIsCheckedOut(false,-1);
      }
      
      public void sorryBookAlreadyCheckedOut(Book book){
          System.out.println("Sorry, "+book.getTitle() + " is already checked out. "
          + "It should be back on day "+ (book.getDayCheckedOut() + getLengthOfCheckoutPeriod())+".");
      }
      
      
      
      
    
    public static void main(String[] args) {
        // TODO code application logic here
        Map<String, Book> bookCollection = new HashMap<String,Book>();
        Book harry = new Book("Harry Potter", 827132, 99999999);
        bookCollection.put("Harry Potter", harry);
        LibraryCatalogue lib = new LibraryCatalogue(bookCollection);
        lib.checkOutBook("Harry Potter");
        lib.nextday();
        lib.nextday();
        lib.checkOutBook("Harry Potter");
        lib.setDay(17);
        lib.returnBook("Harry Potter");
        lib.checkOutBook("Harry Potter");
    
    }
}
