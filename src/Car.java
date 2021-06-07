public class Car extends Vehicle implements FourWheels {

    int placeNbre;

    public Car(String motor, String person, String color) {
        super(motor, person, color);
    }

    @Override
    public void setPlaceNbre(int placeNbre) {
        this.placeNbre = placeNbre ;
    }

}
