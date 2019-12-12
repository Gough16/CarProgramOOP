import java.util.Date;

/**
 * Vehicle class that implements the Engine and Chassis interface.
 *
 * @author Michael Gough
 * @version 1
 * @since 2019-10-24
 */
public class Vehicle implements Engine, Chassis {

  /**
   * Initialize instance variables used in the the Vehicle class.
   */
  private Date vehicleManufacturedDate;
  private String vehicleManufacturer;
  private String vehicleMake;
  private String vehicleModel;
  private Chassis vehicleFrame;
  private String vehicleType;
  private String driveTrain;
  private Engine vehicleEngine;

  /**
   * Default constructor used to set the instance variables.
   */
  public Vehicle() {
    this.vehicleManufacturedDate = new Date();
    this.vehicleManufacturer = "Generic";
    this.vehicleMake = "Generic";
    this.vehicleModel = "Generic";
    this.vehicleType = "Generic";
    this.vehicleFrame = new VehicleFrame();
    this.vehicleEngine = new ManufacturedEngine();
    this.vehicleEngine.setDriveTrain("Generic");
    this.vehicleEngine.setEngineType("Generic");

  }

  /**
   * Overloaded constructor that is used to set the values of the instance variables.
   *
   * @param vehicleManufacturer accepts the vehicleManufacture
   * @param vehicleManufacturedDate accepts the vehicle manufactured date
   * @param vehicleMake accepts the vehicle make
   * @param vehicleModel accepts the vehicle model
   * @param vehicleType accepts the vehicle type
   * @param vehicleFrame accepts the vehicle frame
   * @param engine accepts the engine
   */
  public Vehicle(Date vehicleManufacturedDate, String vehicleManufacturer, String vehicleMake,
      String vehicleModel, Chassis vehicleFrame, String vehicleType, String driveTrain,
      Engine engine) {
    this.vehicleManufacturer = vehicleManufacturer;
    this.vehicleManufacturedDate = vehicleManufacturedDate;
    this.vehicleMake = vehicleMake;
    this.vehicleType = vehicleType;
    this.driveTrain = driveTrain;
    this.vehicleModel = vehicleModel;
    this.vehicleFrame = vehicleFrame;
    this.vehicleEngine = engine;
  }


  /**
   * public method implementation of setEngineCylinders from the Engine interface.
   *
   * @param engineCylinders sets the engine cylinders.
   */
  @Override
  public void setEngineCylinders(int engineCylinders) {

  }

  /**
   * setEngineManufacturedDate implementation for the method from the Engine interface.
   *
   * @param date sets the engine manufactured date.
   */
  @Override
  public void setEngineManufacturedDate(Date date) {
    vehicleEngine.setEngineManufacturedDate(date);
  }

  /**
   * <p>setEngineManufacturer method implementation for the method from the Engine interface that
   * sets the manufacturer. </p>
   *
   * @param manufacturer sets the engine manufacturer.
   */
  @Override
  public void setEngineManufacturer(String manufacturer) {
    this.vehicleManufacturer = manufacturer;
  }

  /**
   * <p>setEngineMake method implementation for the method from the Engine interface that
   * sets the engineMake. </p>
   *
   * @param engineMake sets the engine make
   */
  @Override
  public void setEngineMake(String engineMake) {
    this.vehicleEngine.setEngineMake(engineMake);
  }

  /**
   * <p>setEngineModel method implementation for the method from the Engine interface that
   * sets the engineModel. </p>
   *
   * @param engineModel sets the engine model.
   */
  @Override
  public void setEngineModel(String engineModel) {
    this.vehicleEngine.setEngineModel(engineModel);
  }

  /**
   * <p>setDriveTrain method implementation for the method from the Engine interface that
   * sets the driveTrain. </p>
   *
   * @param driveTrain sets the DriveTrain
   */
  public void setDriveTrain(String driveTrain) {
    this.vehicleEngine.setDriveTrain(driveTrain);
  }

  /**
   * <p>setEngineType method implementation for the method from the Engine interface that
   * sets the engine type. </p>
   *
   * @param fuel sets the Engine Type
   */
  @Override
  public void setEngineType(String fuel) {
    this.vehicleEngine.setEngineType(fuel);
  }


  /**
   * <p> getChassisType method implementation for the method from the Engine interface that
   * gets the Chassis type. </p>
   *
   * @return Chassis
   */
  @Override
  public Chassis getChassisType() {
    return vehicleFrame;
  }

  /**
   * <p>setChassisType method implementation for the method from the Engine interface that
   * sets the Chassis type.</p>
   *
   * @param vehicleChassis sets the vehicle chassis
   */
  @Override
  public void setChassisType(String vehicleChassis) {
    this.vehicleFrame.setChassisType(vehicleChassis);
  }

  /**
   * toString that prints to the console the values of the instance variables.
   *
   * @return string to print to the console
   */
  public String toString() {
    return "Manufacture Name : " + this.vehicleManufacturer + "\n" + "Manufactured Date : "
        + this.vehicleManufacturedDate.toString() + "\n" + "Vehicle Make : " + this.vehicleMake
        + "\n" + "Vehicle Model : " + this.vehicleModel + "\n" + "Vehicle Type : "
        + this.vehicleType
        + "\n" + vehicleEngine.toString();
  }

}
