import java.util.Date;

/**
 * Main method that test the functionality of the program.
 *
 * @author Michael Gough
 * @version 1
 * @since 2019-10-24
 */
public class Main {

  /**
   * Method that test the objects and constructors created.
   *
   * @param args tests constructors
   */
  public static void main(String[] args) {

    /**
     * Methods to call other methods.
     */
    //testVehicleChassis();
    //testVehicleFrame();
    //testManufacturedEngine();
    //testFeatures();
    //testVehicle();
    testCar();
  }

  /**
   * Method to test the vehicle chassis.
   */
  public static void testVehicleChassis() {
    // Creates two objects, one with the default constructor
    // and the other with the constructor with parameters.
    // Give sample data for the parameters.

    VehicleChassis myChassis = new VehicleChassis();
    System.out.println(myChassis.toString());

    VehicleChassis yourChassis = new VehicleChassis("cn");
    System.out.println(yourChassis.toString());
  }

  /**
   * Methods to test VehicleFrame.
   */
  public static void testVehicleFrame() {
    // Step 4 Test
    VehicleFrame vf1 = new VehicleFrame();
    System.out.println(vf1);

    VehicleFrame vf2 = new VehicleFrame("Ladder Frame");
    System.out.println(vf2);
  }

  /**
   * Methods to test the ManufacturedEngine.
   */
  public static void testManufacturedEngine() {
    ManufacturedEngine me1 = new ManufacturedEngine();
    System.out.println(me1);

    ManufacturedEngine me2 =
        new ManufacturedEngine("Honda", new Date()
            , "H-Series", "H23A1"
            , "2WD: Two-Wheel Drive", 4
            , "88 AKI");
    System.out.println(me2);
  }

  /**
   * Method to test the features.
   */
  public static void testFeatures() {
    InteriorFeature if1 = new InteriorFeature();
    System.out.println(if1);

    InteriorFeature if2 = new InteriorFeature("Climate Control");
    System.out.println(if2);

    ExteriorFeature ef1 = new ExteriorFeature();
    System.out.println(ef1);

    ExteriorFeature ef2 = new ExteriorFeature("Fog Lamps");
    System.out.println(ef2);

  }

  /**
   * Method to test the Vehicle class constructors.
   */
  public static void testVehicle() {
    Vehicle v1 = new Vehicle(new Date(), "Honda", "Prelude", "Coupe", new VehicleChassis("Unibody"),
        "null", "type",
        new ManufacturedEngine("Honda", new Date(), "H-series", "H23A1", "88 AKI", 4,
            "2WD: Two-Wheel Drive"));
    System.out.println(v1);

    Vehicle v2 = new Vehicle(new Date(), "Honda", "Prelude", "Coupe",
        new VehicleChassis("Unibody"),
        "null", "type",
        new ManufacturedEngine("Honda", new Date(), "H-series",
            "H23A1", "88 AKI", 4, "2WD: Two-Wheel Drive"));
    System.out.println(v2);
  }

  /**
   * Method to test the car constructors.
   */
  public static void testCar() {

    // Seed the features with valid subclasses.
    Feature[] f = {new InteriorFeature("AM/FM Radio")
        , new ExteriorFeature("Wood Panels")
        , new InteriorFeature("Air Conditioning")
        , new ExteriorFeature("Moonroof")};

    // Test default constructor and print instance attributes.
    Car c1 = new Car();
    System.out.println(c1);
    System.out.println();

    // Create an overloaded Car instance.
    Car c2 = new Car(new Date(), "Honda", "Prelude", "Coupe",
        new VehicleChassis("Unibody"),
        "null", "type",
        new ManufacturedEngine("Honda", new Date(), "H-series",
            "H23A1", "88 AKI", 4, "2WD: Two-Wheel Drive")
        , f, 2);
    System.out.println(c2);
  }
}
