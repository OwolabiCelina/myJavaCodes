package personal;

public class Bike {

    private boolean isOn;

    public boolean isOn() {
        return isOn;
    }

    public boolean turnOn() {
        isOn = true;
        return true;
    }
}
