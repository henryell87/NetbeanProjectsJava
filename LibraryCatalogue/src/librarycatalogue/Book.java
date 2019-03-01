
package librarycatalogue;

/**
 *
 * @author HENRYELL
 */
public class Book {
    
  String title;
  int pageCount;
  int ISDN;
  boolean isCheckedOut; // Wheather or not a book is checked out
  int dayCheckedOut = -1;
  
  // Costructor
    
  public Book(String bookTitle, int bookPageCount, int bookISDN){
      this.title = bookTitle;
      this.pageCount = bookPageCount;
      this.ISDN = bookISDN;
      isCheckedOut = false; 
  }
  
  // Getters----Instance Variables
  
  public String getTitle(){
      return this.title;
  }
  
  
  public int getPageCount(){
      return this.pageCount;
  }
  
  public int getISDN(){
      return this.ISDN;
  }
  
  public boolean getIsCheckedOut(){
      return this.isCheckedOut;
  }
  
  public int getDayCheckedOut(){
      return this.dayCheckedOut;
  }
  
  
  // Setters
  public void setIsCheckedOut(boolean newIsCheckedOut, int currentDayCheckedOut){
     this.isCheckedOut = newIsCheckedOut;
     setDayCheckedOut(currentDayCheckedOut);
     
  }
  
  private void setDayCheckedOut(int day){
      this.dayCheckedOut = day;
  }
  
  
  
}



