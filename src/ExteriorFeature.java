/**
 * ExteriorFeature class that implements the Feature interface.
 *
 * @author Michael Gough
 * @version 1
 * @since 2019-10-24
 */
public class ExteriorFeature implements Feature {

  /**
   * Initialize the instance variable String exteriorFeature.
   */
  private String exteriorFeature;

  /**
   * Default constructor that sets the instance variable exteriorFeature to generic.
   */
  public ExteriorFeature() {
    //Set the instance variable
    this.exteriorFeature = "Generic";
  }

  /**
   * Overloaded constructor that sets the instance variable.
   *
   * @param exteriorFeature initializes the String value for exteriorFeature.
   */
  public ExteriorFeature(String exteriorFeature) {
    //Set instance variable
    this.exteriorFeature = exteriorFeature;
  }

  /**
   * Override method getFeature that gets the instance variable exteriorFeature.
   *
   * @return String value for the Feature.
   */
  @Override
  public String getFeature() {
    return this.exteriorFeature;
  }

  /**
   * Override method setFeature that sets the instance variable.
   *
   * @param exteriorFeature sets the Feature for the car.
   */
  @Override
  public void setFeature(String exteriorFeature) {
    this.exteriorFeature = exteriorFeature;
  }

  /**
   * toString that returns the instance variable to the console.
   *
   * @return String value of the instance variable to the console.
   */
  public String toString() {
    return "Exterior [" + this.exteriorFeature + "]";
  }

  /**
   * Static main method that tests two scenarios.
   */
  public static void main(String[] args) {
    //Test the default constructor
    ExteriorFeature scenarioOne = new ExteriorFeature();
    System.out.println(scenarioOne);

    //Test the overloaded constructor
    ExteriorFeature scenarioTwo = new ExteriorFeature("Fog Lamps");
    System.out.println(scenarioTwo);
  }
}
