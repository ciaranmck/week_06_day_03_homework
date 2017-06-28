package vehicle_management;
import behaviours.*;

public class Dodgem extends Vehicle implements Driveable {

  int numberOfSeats;

  public Dodgem(double avgSpeed, int numberOfSeats) {
    super(avgSpeed);
    this.numberOfSeats = numberOfSeats;
  }

  public int getNumberOfSeats() {
    return this.numberOfSeats;
  }

  // public int drive() {
  //   return 1;
  // }
}