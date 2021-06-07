import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Vehicle car1 = new Car("5 horses", "Bassem" , "Red");
        System.out.println(Vehicle.getVehicleNbre());

        Vehicle car2 = new Car("4 horses", "Emna" , "pink");
        System.out.println(Vehicle.getVehicleNbre());

        Vehicle motorcycle1 = new Motorcycle("2 horses", "Wassim" , "Black");
        System.out.println(Vehicle.getVehicleNbre());

        List<Vehicle> listOfVehicles = new ArrayList<>();
        listOfVehicles.add(car1);
        listOfVehicles.add(car2);
        listOfVehicles.add(motorcycle1);

        for (int i = 0; i< listOfVehicles.size(); i++){
            System.out.println(listOfVehicles.get(i).getColor());
        }

    }
}
