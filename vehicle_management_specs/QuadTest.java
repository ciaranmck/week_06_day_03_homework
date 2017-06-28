import static org.junit.Assert.*;
import org.junit.*;
import vehicle_management.*;

public class QuadTest {

  Quad quad;

  @Before
  public void before() {
    quad = new Quad(120, 250);
  }

  @Test
  public void checkEngineCapacity() {
    assertEquals(250, quad.getEngineCapacity());
  }

  @Test
  public void checkDriveDistance() {
    assertEquals(.83, quad.driveDistance(100), .01);
  }
}