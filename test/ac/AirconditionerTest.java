package ac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AirconditionerTest {

    private Airconditioner airconditioner;

    @BeforeEach
    public void Cooling(){
        airconditioner = new Airconditioner();
    }

    @Test
    public void test_isOn() throws Exception {
        String on = airconditioner.isOn("on");
        Assertions.assertEquals(on, on);
    }

    @Test
    public void test_isOnIsNotValid() throws Exception {
        String onVar = airconditioner.isOn("pppp");
        Assertions.assertEquals(onVar, "pppp");
    }

    @Test
    public void test_isOff() throws Exception {
        String off = airconditioner.isOff("off");
        Assertions.assertEquals(off, "off");
    }

    @Test
    public void test_isOffNotValid() throws Exception {
        String offVar = airconditioner.isOff("ppp");
        Assertions.assertEquals(offVar, "ppp");
    }

    @Test
    public void test_increaseTemp() throws Exception {
        int increase = airconditioner.increaseTemp(20);
        Assertions.assertEquals(increase, 20);
    }
    @Test
    public void test_increaseTempInvalid() throws Exception {
        int increase = airconditioner.increaseTemp(40);
        Assertions.assertEquals(increase, 40);
    }

    @Test
    public void test_decreaseTemp() throws Exception {
        int decrease = airconditioner.decreaseTemp(18);
        Assertions.assertEquals(decrease, 18);
    }

    @Test
    public void test_decreaseTempInvalid() throws Exception {
        int decrease = airconditioner.decreaseTemp(15);
        Assertions.assertEquals(decrease, 15);
    }
}