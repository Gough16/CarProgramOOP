/**
 * Concrete class VehicleChassis that implements Chassis.
 *
 * @author Michael Gough
 * @version 1
 * @since 2019-10-24
 */
public class VehicleChassis implements Chassis {

  /**
   * Declaring private String chassisName.
   */
  private String chassisName;

  /**
   * Default constructor for VehicleChassis class that setting the instance variable.
   */
  public VehicleChassis() {
    //Setting instance variable ChassisName = Chassis
    this.chassisName = Chassis.chassis;
  }

  /**
   * Overloaded constructor for VehicleChassis class that sets the ChassisName instance variable.
   *
   * @param chassisName string that sets the instance variable.
   */
  public VehicleChassis(String chassisName) {
    //Setting instance variable chassisName equal to itself
    this.chassisName = chassisName;
  }


  /**
   * Override method getChassisType.
   *
   * @return an instance of the interface Chassis.
   */
  @Override
  public Chassis getChassisType() {
    return this;
  }

  /**
   * Override method setChassisType that sets the instance variable chassisName.
   *
   * @param vehicleChassis sets the chassis type.
   */
  @Override
  public void setChassisType(String vehicleChassis) {
    //Setting instance variable ChassisName = vehicleChassis
    this.chassisName = vehicleChassis;
  }

  /**
   * toString that returns a string with the instance variable chassisName.
   *
   * @return String with the String of chassisName and the variable.
   */
  public String toString() {
    return "Chassis Name : " + chassisName;
  }

  /**
   * Static method main that creates two objects for the default and overloaded constructor.
   *
   * @param args implements the args to test the constructor
   */
  public static void main(String[] args) {
    //Creates an object for the default constructor
    VehicleChassis scenarioOne = new VehicleChassis();
    System.out.println(scenarioOne);

    //Creates an object that uses the overloaded constructor
    VehicleChassis scenarioTwo = new VehicleChassis();
    System.out.println(scenarioTwo);
  }
}