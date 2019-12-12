import java.util.Date;

/**
 * Concrete class named Car that extends Vehicle class.
 *
 * @author Michael Gough
 * @version 1
 * @since 2019-10-24
 */
public class Car extends Vehicle {

  /**
   * Declaring variables for car class.
   */
  private Feature[] feature = new Feature[10];
  private int carAxle;

  /**
   * default car constructor that calls super.
   */
  public Car() {
    super();

    //Instantiate the values for the variables feature and carAxle
    Feature[] carFeature = {new InteriorFeature("No Interior Features"),
        new ExteriorFeature("No Exterior Features")};
    this.feature = carFeature;
    this.carAxle = 2;
  }


  /**
   * public overloaded constructor that instantiates all the variables defined.
   *
   * @param vehicleManufacturer     accepts vehicleManufacturer
   * @param vehicleManufacturedDate accepts vehicleManufacturedDate
   * @param vehicleMake             accepts vehicleMake
   * @param vehicleModel            accepts vehicleModel
   * @param vehicleType             accepts vehicleType
   * @param vehicleFrame            accepts vehicleFrame
   * @param vehicleEngine           accepts vehicleEngine
   * @param feature                 accepts feature
   * @param carAxle                 accepts carAxle
   */
  public Car(Date vehicleManufacturedDate, String vehicleManufacturer, String vehicleMake,
      String vehicleModel, Chassis vehicleFrame, String vehicleType, String driveTrain,
      Engine vehicleEngine,
      Feature[] feature, int carAxle) {
    super(vehicleManufacturedDate, vehicleManufacturer, vehicleMake, vehicleModel, vehicleFrame,
        vehicleType, driveTrain,
        vehicleEngine);

    this.feature = feature;
    this.carAxle = carAxle;
  }

  /**
   * Method getExteriorFeatures that gets the exterior features for the car and uses a loop.
   *
   * @return String value for the exterior
   */
  public String getExteriorFeatures() {
    String list = "";

    //For loop that gets the exterior features and returns them to the string list
    for (int i = 0; i < this.feature.length; i++) {
      if (this.feature[i] instanceof ExteriorFeature) {
        if (list.length() == 0) {
          list += this.feature[i];
        } else {
          list += "\n" + this.feature[i];
        }
      }

    }
    return list;
  }

  /**
   * Method getInteriorFeature that gets the interior features of the car.
   *
   * @return
   */
  public String getInteriorFeatures() {
    String list = " ";

    //For loop that goes through the the interior features and returns them to the list String
    for (int i = 0; i < this.feature.length; i++) {
      if (this.feature[i] instanceof InteriorFeature) {
        if (list.length() == 0) {
          list += this.feature[i];
        } else {
          list += "\n" + this.feature[i];
        }
      }
    }
    return list;
  }

  /**
   * Override toString that gets the values from the car class and prints them out to the console.
   *
   * @return String values of the features for the car
   */
  @Override
  public String toString() {
    String list = "";

    for (int i = 0; i < this.feature.length; i++) {
      if (list.length() == 0) {
        list += this.feature[i];
      } else {
        list += "\n" + this.feature[i];
      }
    }
    return super.toString() + "\n" + "Features : " + "\n" + list + "\n" + "Car Axle : " + carAxle;
  }

}
