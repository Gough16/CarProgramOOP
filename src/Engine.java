import java.util.Date;

/**
 * Interface Engine.
 *
 * @author Michael Gough
 * @version 1
 * @since 2019-10-24
 */
public interface Engine {

  /**
   * method definition for setEngineCylinders.
   *
   * @param engineCylinders sets engine cylinders.
   */
  public void setEngineCylinders(int engineCylinders);

  /**
   * method definition for setEngineManufacturedDate.
   *
   * @param date sets the Engine Manufactured Date.
   */
  public void setEngineManufacturedDate(Date date);

  /**
   * Method definition for setEngineManufacturer.
   *
   * @param manufacturer sets the Engine manufacturer.
   */
  public void setEngineManufacturer(String manufacturer);

  /**
   * Method definition for serEngineMake.
   *
   * @param engineMake sets Engine make.
   */
  public void setEngineMake(String engineMake);

  /**
   * Method definition for setEngineModel.
   *
   * @param engineModel sets the Engine model.
   */
  public void setEngineModel(String engineModel);

  /**
   * Method definition for setDriveTrain.
   *
   * @param driveTrain sets the Drive Train.
   */
  public void setDriveTrain(String driveTrain);

  /**
   * Method definition for setEngineType.
   *
   * @param fuel sets the engine type.
   */
  public void setEngineType(String fuel);

}
