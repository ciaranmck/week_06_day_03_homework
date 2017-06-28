import static org.junit.Assert.*;
import org.junit.*;
import vehicle_management.*;

public class DodgemTest {

  Dodgem dodgem;

  @Before
  public void before() {
    dodgem = new Dodgem(25, 2);
  }

  @Test
  public void checkNumberOfSeats() {
    assertEquals(2, dodgem.getNumberOfSeats());
  }

  @Test
  public void checkDriveDistance() {
    assertEquals(4, dodgem.driveDistance(100), .01);
  }
}