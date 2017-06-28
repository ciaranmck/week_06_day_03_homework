package vehicle_management;

public abstract class Vehicle {

  double avgSpeed;
  double driveDistance;

  public Vehicle(double avgSpeed) {
    this.avgSpeed = avgSpeed;
  }

  public double getAvgSpeed() {
    return this.avgSpeed;
  }

  public double driveDistance(double distance) {
      double time = distance / avgSpeed;
      return time;
    }
}