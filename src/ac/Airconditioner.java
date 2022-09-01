package ac;

public class Airconditioner {

    public String isOn(String on) throws Exception {
        if ( on == "on") {
            System.out.println("AC is On");
        }
        else {
            throw new Exception("Please on ac properly");
        }
        return on;
    }

    public String isOff(String off) throws Exception {
        if (off == "off") {
            System.out.println("AC is off");
        }
        else {
            throw new Exception("Please off ac properly");
        }
        return off;
    }
    public int increaseTemp(int increase) throws Exception {
        if (increase > 30 ){
            throw new Exception("Tempareture is invalid");
        }
        else {
            System.out.println("The tempareture has increase to: " +increase);;
        }
        return increase;
    }

    public int decreaseTemp(int decrease) throws Exception {
        if (decrease  < 16 ){
            throw new Exception("Tempareture is invalid");
        }
        else {
            System.out.println("The tempareture has decrease to: " +decrease);;
        }
        return decrease;
    }

}


