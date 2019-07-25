
package car;

public class CarTest {
   
    public static void main(String[] args) {
        String make1 = "Toyota";
        String model1 = "Camry";
        int year1= 1999;
        String name1 = "Bluey";
        String color1 = "Blue";
        int owned1 = 20;
        double miles1 = 130000.32;
        
       Car car1= new Car(make1, model1, year1, name1, color1, owned1, miles1);
       
       System.out.println("Car 1: " + car1.getMake() + " " + car1.getModel() + " from " + car1.getYear());
       
       car1.turnOn();
       car1.turnOff();
       car1.turnOff();
              
    }
   
}
