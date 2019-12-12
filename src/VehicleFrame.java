/**
 * Creates a concrete class name VehicleFrame that implements the interface Chassis
 *
 * @author Michael Gough
 * @version 1
 * @since 2019-10-24
 */
public class VehicleFrame implements Chassis {

  /**
   * Declare a String named vehicleFrameType
   */
  private String vehicleFrameType = " ";

  /**
   * Default constructor that sets the instance variable to "Unibody"
   */
  public VehicleFrame() {
    this.vehicleFrameType = "Unibody";
  }

  /**
   * Overloaded constructor that sets the instance variable
   *
   * @param vehicleFrameType
   */
  public VehicleFrame(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }

  /**
   * Overriden method getChassisType
   *
   * @return Chassis
   */
  @Override
  public Chassis getChassisType() {
    return this;
  }

  /**
   * Override method setChassisValue that sets the instance variable chassisName
   *
   * @param vehicleFrameType
   */
  @Override
  public void setChassisType(String vehicleFrameType) {
    //set the instance variable vehicleFrameType
    this.vehicleFrameType = vehicleFrameType;
  }

  /**
   * toString that prints a String with chassis, vehicleFrameType
   *
   * @return String value
   */
  public String toString() {
    return "Chassis : " + chassis + "\n" + "Vehicle Frame : " + vehicleFrameType;
  }

  /**
   * static method that test two scenarios
   *
   * @param args
   */
  public static void main(String[] args) {
    //Creates an object for the default constructor
    VehicleFrame vehicle1 = new VehicleFrame();
    //print vehicle1 to the console
    System.out.println(vehicle1);

    //Creates an object for the overloaded constructor
    VehicleFrame vehicle2 = new VehicleFrame("Ladder Frame");
    //Prints the value of VehicleFrame set to "Ladder Frame"
    System.out.println(vehicle2);

  }
}