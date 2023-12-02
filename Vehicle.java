// Scenario 1: Vehicle Hierarchy
// Consider a vehicle hierarchy where you have a base class called "Vehicle" and derived classes like "Car," "Motorcycle," and "Truck." Define common attributes and behaviors in the base class and specific attributes and behaviors in the derived classes.
class vehicle {
    String brand;
    String fuelType;
    Integer Average;
    String Colour;

    void name(String Name){
        brand = Name;
        System.out.println("Brand is "+ brand);
    }
}

class Car extends vehicle {
    String Model;

    void inFo(String brand , String fuelType , String Model , String Colour , Integer Average) {
        this.brand = brand;
        this.Model = Model;
        this.fuelType = fuelType;
        this.Colour = Colour;
        this.Average = Average;
        System.out.println("Brand name " + this.brand + " Model " + this.Model + ".");
        System.out.println("Color "+this.Colour + " Fuel "+this.fuelType+" average "+this.Average +".");
    }

}

class TwoWheelers extends vehicle {
    String Model;
    boolean SideCart;

    void inFo(String brand , String fuelType , String Model , String Colour , Integer Average , boolean SideCart) {
        this.brand = brand;
        this.Model = Model;
        this.fuelType = fuelType;
        this.Colour = Colour;
        this.Average = Average;
        this.SideCart = SideCart;
        System.out.println("Brand name " + this.brand + " Model " + this.Model + " with " + this.SideCart+ " sidecart.");
        System.out.println("Color "+this.Colour + " Fuel "+this.fuelType+" average "+this.Average +".");
    }
}

public class Vehicle {

    public static void main(String[] args) {
        Car maruti = new Car();
        // Car ford = new Car();

        maruti.inFo(null, null, null, null, null);
    }
    
}
