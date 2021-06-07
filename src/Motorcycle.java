public class Motorcycle extends Vehicle implements TwoWheels {

    public final String ALERT_MSG = "casqueeeee!!!";

    public Motorcycle(String motor, String person, String color) {
        super(motor, person, color);
    }

    @Override
    public String getAlertMessage() {
        return ALERT_MSG;
    }


}
