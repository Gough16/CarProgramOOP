import java.util.Date;

/**
 * Vehicle class that implements the Engine and Chassis interface
 *
 * @author Michael Gough
 * @version 1
 * @since 2019-10-24
 */
public class Vehicle implements Engine, Chassis {

  /**
   * Initialize instance variables used in the the Vehicle class
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
   * Default constructor used to set the instance variables
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
   * Overloaded constructor thats used to set the values of the instance variables
   *
   * @param vehicleManufacturer
   * @param vehicleManufacturedDate
   * @param vehicleMake
   * @param vehicleModel
   * @param vehicleType
   * @param vehicleFrame
   * @param engine
   */
  public Vehicle(Date vehicleManufacturedDate,String vehicleManufacturer,  String vehicleMake,
      String vehicleModel, Chassis vehicleFrame, String vehicleType, String driveTrain, Engine engine) {
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
   * public method implementation of setEngineCylinders from the Engine interface
   *
   * @param engineCylinders
   */
  @Override
  public void setEngineCylinders(int engineCylinders) {

  }

  /**
   * setEngineManufacturedDate implementation for the method from the Engine interface
   *
   * @param date
   */
  @Override
  public void setEngineManufacturedDate(Date date) {
    vehicleEngine.setEngineManufacturedDate(date);
  }

  /**
   * <p>setEngineManufacturer method implementation for the method from the Engine interface that
   * sets the manufacturer</p>
   *
   * @param manufacturer
   */
  @Override
  public void setEngineManufacturer(String manufacturer) {
    this.vehicleManufacturer = manufacturer;
  }

  /**
   * <p>setEngineMake method implementation for the method from the Engine interface that
   * sets the engineMake</p>
   *
   * @param engineMake
   */
  @Override
  public void setEngineMake(String engineMake) {
    this.vehicleEngine.setEngineMake(engineMake);
  }

  /**
   * <p>setEngineModel method implementation for the method from the Engine interface that
   * sets the engineModel</p>
   *
   * @param engineModel
   */
  @Override
  public void setEngineModel(String engineModel) {
    this.vehicleEngine.setEngineModel(engineModel);
  }

  /**
   * <p>setDriveTrain method implementation for the method from the Engine interface that
   * sets the driveTrain</p>
   *
   * @param driveTrain
   */
  public void setDriveTrain(String driveTrain) {
    this.vehicleEngine.setDriveTrain(driveTrain);
  }

  /**
   * <p>setEngineType method implementation for the method from the Engine interface that
   * sets the engine type</p>
   *
   * @param fuel
   */
  @Override
  public void setEngineType(String fuel) {
    this.vehicleEngine.setEngineType(fuel);
  }


  /**
   * <p> getChassisType method implementation for the method from the Engine interface that
   * gets the Chassis type</p>
   *
   * @return
   */
  @Override
  public Chassis getChassisType() {
    return vehicleFrame;
  }

  /**
   * <p>setChassisType method implementation for the method from the Engine interface that
   * sets the Chassis type</p>
   *
   * @param vehicleChassis
   */
  @Override
  public void setChassisType(String vehicleChassis) {
    this.vehicleFrame.setChassisType(vehicleChassis);
  }

  /**
   * toString that prints to the console the values of the instance variables
   *
   * @return
   */
  public String toString() {
    return "Manufacture Name : " + this.vehicleManufacturer + "\n" + "Manufactured Date : "
        + this.vehicleManufacturedDate.toString() + "\n" + "Vehicle Make : " + this.vehicleMake
        + "\n" + "Vehicle Model : " + this.vehicleModel + "\n" + "Vehicle Type : "
        + this.vehicleType
        + "\n" + vehicleEngine.toString();
  }

//  /**
//   * Static main method that test two scenarios
//   *
//   * @param args
//   */
//  public static void main(String[] args) {
//    //Scenario one that test the default constructor
//    Vehicle scenarioOne = new Vehicle();
//    System.out.println(scenarioOne);
//
//    //Scenario two that test the overloaded constructor
//    Vehicle scenarioTwo = new Vehicle("Honda", new Date(1325599999999L), "Honda", "Prelude",
//        "Coupe",
//        new VehicleChassis("Unibody"),
//        new ManufacturedEngine("Honda", new Date(), "H-Series", "H23A1", "2WD: Two - Wheel Drive",
//            4, "88 AKI"));
//    System.out.println(scenarioTwo);
//  }
}
