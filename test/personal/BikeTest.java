//package personal;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//class BikeTest {
//  private Bike bike = new Bike();
//
//  @BeforeEach
//    public void setUp(){
//      Bike bike = new Bike();
//  }
//
//  @Test
//    public void bikeCanBeTurnedOnTest(){
//      bike.isOn();
//      assertFalse(bike.isOn());
//
//      bike.turnOn();
//      assertTrue(bike.isOn());
//  }
//
//  @Test
//  public void bikeCanBeTurnedOffTest(){
//    bike.isOn();
//    bike.turnOff();
//    assertFalse(bike.isOn());
//  }
//
//
//}