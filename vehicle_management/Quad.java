package vehicle_management;
import behaviours.*;

public class Quad extends Vehicle implements Driveable {

  int engine_capacity;

  public Quad(double avgSpeed, int engine_capacity) {
    super(avgSpeed);
    this.engine_capacity = engine_capacity;
  }

  public int getEngineCapacity() {
    return this.engine_capacity;
  }

  // public int drive() {
  //   return 1;
  // }
}