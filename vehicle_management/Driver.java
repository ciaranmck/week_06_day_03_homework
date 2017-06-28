package vehicle_management;
import behaviours.*;

public class Driver extends Vehicle implements Driveable {

  String name;
  private Driveable vehicleType;

  public Driver(double avgSpeed, String name, Driveable vehicleType) {
    super(avgSpeed);
    this.name = name;
    this.vehicleType = vehicleType;
  }

  public String getName(){
    return this.name;
  }

  public Driveable getVehicleType(){
    return this.vehicleType;
  }

  public void setVehicle(Driveable vehicle) {
    this.vehicleType = vehicle;
  }

  // public int drive() {
  //   return 1;
  // }

  // public String fly(){
  //   return this.ride.fly();
  // }

}
