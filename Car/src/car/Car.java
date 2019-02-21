
package car;

/**
 *
 * @author HENRYELL
 */
public class Car {

    int maxSpeed = 100;
    int minSpeed = 0;
    
    double weight = 4079;
    
    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy";
    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;
    
    int numberOfPeopleInCar =1;
    int maxNumberOfPeopleInCar = 6;
    
    
    
    public Car(){
        
    }
    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn){
       maxSpeed = customMaxSpeed; 
       weight = customWeight;
       isTheCarOn =customIsTheCarOn;
    }
    
    //  Getters and Setters
      public int getMaxSpeed(){
          return this.maxSpeed;
      } 
      
      public void setMaxSpeed(int newMaxSpeed){
          this.maxSpeed = newMaxSpeed;
      }
      
      public int getMinSpeed(){
          return this.minSpeed;
      }
      
      public double getWeight(){
          return this.weight;
      }
      
      public boolean getIsTheCarOn(){
          return this.isTheCarOn;
      }
    public void printVariables() {
        System.out.println("This is the maxspeed " + maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
        System.out.println(numberOfPeopleInCar);
      }
    public void upgradeMaxSpeed(){
          setMaxSpeed(getMaxSpeed() + 10);
     }
    public void getIn() {
        
    // numbrOfPeopleInCar = numberOfpeopleInCar +
        //  If there are not to many people in the car
     if (numberOfPeopleInCar < maxNumberOfPeopleInCar){
         //  tthen someone can get in
         numberOfPeopleInCar++;
         System.out.println("Someone got in");
     }else{
         //  otherwise print out atahe fact the car is full
         System.out.println("The car is full" + numberOfPeopleInCar + "=" + maxNumberOfPeopleInCar);
     } 
    }
    
    public void getOut() {
     //   nuberOfPeopleInCar = number OfPeopleinCar - 1;
        // If there's people in the car
        if (numberOfPeopleInCar > 0) {
            //  Then tell one person to get out
            numberOfPeopleInCar--;
        }else{
            //  Otherwise no one can get out and we will print that
        System.out.print("No one is in the car" + numberOfPeopleInCar);
                }
    }
    
    public double howManyMilesTillOutOfGas() {
        return currentFuel * mpg;
    }
    
    public double maxMilesPerFillUp()
    {
        return maxFuel * mpg;
    }
    
   public void turnTheCarOn(){
       //  If the car isn't on...
     if ( !isTheCarOn ) {
         //  turn it on
         isTheCarOn = true;
     } else{
         //otherwise print out the fact it is on
         System.out.println("The Car is alredy on " + isTheCarOn );
     }
         
   } 
    
    public static void main(String[] args) {
        // TODO code application logic here
        
      Car tommyCar = new Car();
      tommyCar.getOut();
      tommyCar.getOut();
      tommyCar.getIn();
      tommyCar.getIn();
      tommyCar.getIn();
      tommyCar.getIn();
      tommyCar.getIn();
      tommyCar.getIn();
      tommyCar.getIn();
      tommyCar.turnTheCarOn();
      tommyCar.turnTheCarOn();
      
      
       // System.out.println("Christmas Car");
        //Car christmasPresent = new Car(550, 2000, false);
        //christmasPresent.printVariables();
        
    }
    
}
