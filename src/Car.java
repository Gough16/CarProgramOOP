import java.util.Date;

/**
 * Concrete class named Car that extends Vehicle class
 *
 * @author Michael Gough
 * @version 1
 * @since 2019-10-24
 */
public class Car extends Vehicle {

  /**
   * Declaring variables for car class
   */
  private Feature[] feature = new Feature[10];
  private int carAxle;

  /**
   * default car constructor that calls super
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
   * public overloaded constructor that instantiates all the variables defined
   *
   * @param vehicleManufacturer
   * @param vehicleManufacturedDate
   * @param vehicleMake
   * @param vehicleModel
   * @param vehicleType
   * @param vehicleFrame
   * @param vehicleEngine
   * @param feature
   * @param carAxle
   */
  public Car( Date vehicleManufacturedDate, String vehicleManufacturer, String vehicleMake,
      String vehicleModel, Chassis vehicleFrame, String vehicleType, String driveTrain,  Engine vehicleEngine,
      Feature[] feature, int carAxle) {
    super( vehicleManufacturedDate,vehicleManufacturer, vehicleMake, vehicleModel,vehicleFrame, vehicleType, driveTrain,
        vehicleEngine);

    this.feature = feature;
    this.carAxle = carAxle;
  }


  public String getExteriorFeatures() {
    String list = "";

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

  public String getInteriorFeatures() {
    String list = " ";

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
//
//  public static void main(String[] args) {
//
//    Car scenarioOne = new Car();
//    System.out.println(scenarioOne);
//
//    Feature[] nF = {new InteriorFeature("AM/FM"), new ExteriorFeature("Wood Panels"),
//        new InteriorFeature("Air Conditioning"), new ExteriorFeature("Moonroof")};
//
//    Car scenarioTwo = new Car( new Date(1235599999999L), "Honda","Honda", "Prelude", "Coupe",
//        new VehicleChassis("Unibody"),
//        new ManufacturedEngine("Honda", new Date(), "H-Series", "H23A1", "2WD: Two-Wheel Drive", 4,
//            "88 AKI"), nF, 2);
//    System.out.println(scenarioTwo);
//
//  }

}
