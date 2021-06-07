public class Vehicle {

    public static int vehicleNbre;
    private String motor;
    private String person;
    private String color;

    public Vehicle (String motor, String person, String color){
        this.motor = motor;
        this.person = person;
        this.color = color;
        vehicleNbre++;
    }

    public static int getVehicleNbre() {
        return vehicleNbre;
    }

    public String getColor() {
        return color;
    }

    public String getMoteur() {
        return motor;
    }

    public void setMoteur(String moteur) {
        this.motor = moteur;
    }


}
