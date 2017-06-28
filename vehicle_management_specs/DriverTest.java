import static org.junit.Assert.*;
import org.junit.*;
import vehicle_management.*;

public class DriverTest {

  Dodgem dodgem;
  Driver driver;

  @Before
  public void Before() {
    dodgem = new Dodgem(25, 2);
    driver = new Driver(100, "Ciaran", dodgem);
  }

  @Test
  public void hasName(){
    assertEquals("Ciaran", driver.getName());
  }

  @Test
  public void hasDodgem(){
    Dodgem vehicle = (Dodgem)driver.getVehicleType();
    assertEquals(2, vehicle.getNumberOfSeats());
  }

  @Test
  public void canDriveQuad() {
    Quad quad = new Quad(120, 250);
    Driver driver = new Driver(100, "Joe", quad);
    assertEquals(250, quad.getEngineCapacity());
  }

  @Test
  public void canSetVehicle() {
    Quad quad = new Quad(120, 250);
    driver.setVehicle(quad);
    assertEquals(250, quad.getEngineCapacity());
  }

}