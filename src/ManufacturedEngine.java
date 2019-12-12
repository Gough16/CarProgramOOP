import java.util.Date;

/**
 * ManufacturedEngine class that implements the Engine interface.
 *
 * @author Michael Gough
 * @version 1
 * @since 2019-10-24
 */
public class ManufacturedEngine implements Engine {

  /**
   * Declaring private instance variables.
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
   * values. </p>
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
   * Overloaded constructor that gets values assigned for each of the instance variables.
   *
   * @param engineManufacturer accepts the engineManufacturer
   * @param engineManufacturedDate accepts the engineManufacturedDate
   * @param engineMake accepts engine Make
   * @param engineModel accepts engine model
   * @param driveTrain accepts the drive train
   * @param engineCylinders accepts the engine cylinders
   * @param engineType accepts the engine type
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
   * Method setEngine variable that gets override from the Engine interface.
   *
   * @param engineCylinders sets the engine cylinders
   */
  @Override
  public void setEngineCylinders(int engineCylinders) {
    this.engineCylinders = engineCylinders;
  }

  /**
   * setEngineManufacturedDate that gets override from the Engine interface.
   *
   * @param date sets the engine manufactured date.
   */
  @Override
  public void setEngineManufacturedDate(Date date) {
    this.engineManufacturedDate = date;
  }

  /**
   * setEngineManufacturer that gets override from the Engine interface.
   *
   * @param manufacturer sets the engine manufacturer.
   */
  @Override
  public void setEngineManufacturer(String manufacturer) {
    this.engineManufacturer = manufacturer;
  }

  /**
   * setEngineMake that gets override from the Engine interface.
   *
   * @param engineMake sets the engine make string
   */
  @Override
  public void setEngineMake(String engineMake) {
    this.engineMake = engineMake;
  }

  /**
   * setEngineModel that gets override from the Engine interface.
   *
   * @param engineModel sets the engine model.
   */
  @Override
  public void setEngineModel(String engineModel) {
    this.engineModel = engineModel;
  }

  /**
   * setDriveTrain that gets override from the Engine interface.
   *
   * @param driveTrain sets the Drive train.
   */
  @Override
  public void setDriveTrain(String driveTrain) {
    this.driveTrain = driveTrain;
  }

  /**
   * setEngineType that sets override from the Engine interface.
   *
   * @param fuel sets the engine type.
   */
  @Override
  public void setEngineType(String fuel) {
    this.engineType = fuel;
  }

  /**
   * toString method that prints to the console.
   *
   * @return String with the values from the instance variable.
   */
  public String toString() {
    return "Engine Manufactured : " + this.engineManufacturer + "\n" + "Engine Manufactured : "
        + this.engineManufacturedDate + "\n" + "Engine Make : " + this.engineMake + "\n"
        + "Engine Model : " + this.engineModel + "\n" + "Engine Type : " + this.engineType + "\n"
        + "Engine Cylinders : " + this.engineCylinders + "\n" + "Drive Train : " + this.driveTrain;
  }

  /**
   * Main method to test two scenarios.
   */
  public static void main(String[] args) {
    ManufacturedEngine scenarioOne = new ManufacturedEngine();
    System.out.println(scenarioOne);

    ManufacturedEngine scenarioTwo = new ManufacturedEngine("Honda", new Date(1325599999999L),
        "H-Series", "H23A1", "2WD: Two-Wheel Drive", 4, "88 AKI");
    System.out.println(scenarioTwo);
  }
}


