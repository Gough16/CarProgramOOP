import java.util.Date;

/**
 * ManufacturedEngine class that implements the Engine interface
 *
 * @author Michael Gough
 * @version 1
 * @since 2019-10-24
 */
public class ManufacturedEngine implements Engine {

  /**
   * Declaring private instance variables
   */
  private String engineManufacturer;
  private Date engineManufacturedDate;
  private String engineMake;
  private String engineModel;
  private int engineCylinders;
  private String engineType;
  private String driveTrain;

  /**
   * <p>ManufacturedEngine default constructor that initializes the instance variables with literal
   * values </p>
   */
  public ManufacturedEngine() {
    //Initialize instance variables
    this.engineManufacturer = "Generic";
    this.engineManufacturedDate = new Date();
    this.engineMake = "Generic";
    this.engineModel = "Generic";
    this.engineCylinders = 0;
    this.engineType = "Generic";
    this.driveTrain = "2WD: Two-Wheel Drives";

  }

  /**
   * Overloaded constructor that gets values assigned for each of the instance variables
   *
   * @param engineManufacturer
   * @param engineManufacturedDate
   * @param engineMake
   * @param engineModel
   * @param driveTrain
   * @param engineCylinders
   * @param engineType
   */
  public ManufacturedEngine(String engineManufacturer, Date engineManufacturedDate,
      String engineMake, String engineModel, String driveTrain, int engineCylinders,
      String engineType) {
    this.engineManufacturer = engineManufacturer;
    this.engineManufacturedDate = engineManufacturedDate;
    this.engineMake = engineMake;
    this.engineModel = engineModel;
    this.driveTrain = driveTrain;
    this.engineCylinders = engineCylinders;
    this.engineType = engineType;

  }

  /**
   * Method setEngine variable that gets overriden from the Engine interface
   *
   * @param engineCylinders
   */
  @Override
  public void setEngineCylinders(int engineCylinders) {
    this.engineCylinders = engineCylinders;
  }

  /**
   * setEngineManufacturedDate that gets overriden from the Engine interface
   *
   * @param date
   */
  @Override
  public void setEngineManufacturedDate(Date date) {
    this.engineManufacturedDate = date;
  }

  /**
   * setEngineManufacturer that gets overriden from the Engine interface
   *
   * @param manufacturer
   */
  @Override
  public void setEngineManufacturer(String manufacturer) {
    this.engineManufacturer = manufacturer;
  }

  /**
   * setEngineMake that gets overriden from the Engine interface
   *
   * @param engineMake
   */
  @Override
  public void setEngineMake(String engineMake) {
    this.engineMake = engineMake;
  }

  /**
   * setEngineModel that gets overriden from the Engine interface
   *
   * @param engineModel
   */
  @Override
  public void setEngineModel(String engineModel) {
    this.engineModel = engineModel;
  }

  /**
   * setDriveTrain that gets overriden from the Engine interface
   *
   * @param driveTrain
   */
  @Override
  public void setDriveTrain(String driveTrain) {
    this.driveTrain = driveTrain;
  }

  /**
   * setEngineType that sets overriden from the Engine interface
   *
   * @param fuel
   */
  @Override
  public void setEngineType(String fuel) {
    this.engineType = fuel;
  }

  /**
   * toString method that prints to the console
   *
   * @return String with the values from the instance variable
   */
  public String toString() {
    return "Engine Manufactured : " + this.engineManufacturer + "\n" + "Engine Manufactured : "
        + this.engineManufacturedDate + "\n" + "Engine Make : " + this.engineMake + "\n"
        + "Engine Model : " + this.engineModel + "\n" + "Engine Type : " + this.engineType + "\n"
        + "Engine Cylinders : " + this.engineCylinders + "\n" + "Drive Train : " + this.driveTrain;
  }

  /**
   * Main method to test two scenarios
   */
  public static void main(String[] args) {
    ManufacturedEngine scenarioOne = new ManufacturedEngine();
    System.out.println(scenarioOne);

    //Print out Date?
    ManufacturedEngine scenarioTwo = new ManufacturedEngine("Honda", new Date(1325599999999L),
        "H-Series", "H23A1", "2WD: Two-Wheel Drive", 4, "88 AKI");
    System.out.println(scenarioTwo);
  }
}


