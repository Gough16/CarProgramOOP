import java.util.Date;

/**
 * Interface Engine
 *
 * @author Michael Gough
 * @version 1
 * @since 2019-10-24
 */
public interface Engine {

  /**
   * method definition for setEngineCylinders
   *
   * @param engineCylinders
   */
  public void setEngineCylinders(int engineCylinders);

  /**
   * method definition for setEngineManufacturedDate
   *
   * @param date
   */
  public void setEngineManufacturedDate(Date date);

  /**
   * Method definition for setEngineManufacturer
   *
   * @param manufacturer
   */
  public void setEngineManufacturer(String manufacturer);

  /**
   * Method definition for serEngineMake
   *
   * @param engineMake
   */
  public void setEngineMake(String engineMake);

  /**
   * Method definition for setEngineModel
   *
   * @param engineModel
   */
  public void setEngineModel(String engineModel);

  /**
   * Method definition for setDriveTrain
   *
   * @param driveTrain
   */
  public void setDriveTrain(String driveTrain);

  /**
   * Method definition for setEngineType
   *
   * @param fuel
   */
  public void setEngineType(String fuel);

}
