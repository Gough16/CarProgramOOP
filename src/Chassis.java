/**
 * Interface named Chassis
 *
 * @author Michael Gough
 * @version 1
 * @since 2019-10-24
 */
public interface Chassis {

  /**
   * Declaring a public String named chassis that gets the value of Chassis
   */
  public String chassis = "Chassis";


  /**
   * Method getChassis that gets the value of the String Chassis 
   *
   * @return Chassis String value
   */
  public Chassis getChassisType();

  /**
   * Declaring method definition for setChassisType that accepts String vehicleChassis
   *
   * @return void
   */
  public void setChassisType(String vehicleChassis);


}