/**
 * Class interiorFeature that implements feature
 *
 * @author Michael Gough
 * @version 1
 * @since 2019-10-24
 */
public class InteriorFeature implements Feature {

  /**
   * Initialize instance variables for the InteriorFeature class
   */
  private String interiorFeature;

  /**
   * Default constructor that sets the interiorFeature instance variable to Generic
   */
  InteriorFeature() {
    this.interiorFeature = "Generic";
  }

  /**
   * Overloaded constructor the instance variable to the parameter String value
   *
   * @param interiorFeature
   */
  InteriorFeature(String interiorFeature) {
    this.interiorFeature = interiorFeature;
  }

  /**
   * Method getFeature that gets the feature
   *
   * @return String value of the feature
   */
  public String getFeature() {
    return this.interiorFeature;
  }

  /**
   * setFeature method that sets the instance variable of interiorFeature
   *
   * @param interiorFeature
   */
  public void setFeature(String interiorFeature) {
    this.interiorFeature = interiorFeature;
  }

  /**
   * toString method that returns the instance variable
   *
   * @return String value of instance Variable
   */
  public String toString() {
    return "Interior [" + this.interiorFeature + "]";
  }

  /**
   * Static main method that test two scenarios
   *
   * @param args
   */
  public static void main(String[] args) {

    //Create an object that is used with the default constructor
    InteriorFeature scenarioOne = new InteriorFeature();
    System.out.println(scenarioOne);

    //Creates an object that is used with the overloaded constructor
    InteriorFeature scenarioTwo = new InteriorFeature("Climate Control");
    System.out.println(scenarioTwo);


  }
}
