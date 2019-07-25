
package car;


public class Car {

   String make, model, name, color;
   int year, owned;
   boolean isOn;
   double miles;
   
   public Car(String newMake, String newModel, int newYear, String nickName, String color, int yearsOwned, double miles) {
       make=newMake;
       model=newModel;
       year=newYear;
       isOn = false;
       name=nickName;
       color=color;
       owned=yearsOwned;
       miles=miles;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOwned() {
        return owned;
    }

    public void setOwned(int owned) {
        this.owned = owned;
    }

    public boolean isIsOn() {
        return isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }
   
       public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public String nickName() {
        return name;
    }
   
    public void nickName(String name) {
        this.name = name;
    }
    
    public String color() {
        return color;
    }
    
    public void color(String name) {
        this.color = color;
    }
    
    public int yearsOwned() {
        return owned;
    }
    
    public void yearsOwned(int owned) {
        this.owned = owned;
    }
    
     public double miles() {
         return miles;
     }       
     
     public void miles (float miles) {
         this.miles = miles;
     }
    public void turnOn() {
        isOn=true;
        System.out.println("The car is now on!");
    }
   
    public void turnOff() {
        if (isOn==true) {
            isOn=false;
            System.out.println("The car is now off!");
        } 
        else {
            System.out.println("The car is already off!");
        }
       
    }
}
