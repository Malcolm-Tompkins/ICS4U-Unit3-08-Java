/*
* This program is a Truck class.
*
* @author  Malcolm Tompkins
* @version 1.0
* @since   2021-12-27
*/

/**
 * Truck.
 */
public class Truck extends Vehicle {
    /**
    * Constant.
    */
    private static final int EIGHT = 8;
    /**
    * License plate variable.
    */
    private String licensePlate;

    /**
    * Number of tires variable.
    */
    private int numberOfTires = EIGHT;

    /**
    * Constructor.
    *
    * @param inicialColour colour
    * @param topSpeed speed
    * @param inicialPlate plate
    */
    public Truck(final String inicialColour, final int topSpeed,
                   final String inicialPlate) {
        super(inicialColour, topSpeed);
        this.licensePlate = inicialPlate;
    }

    /**
    * Getter.
    *
    * @return good
    */
    public String getLicensePlate() {
        return this.licensePlate;
    }

    /**
    * Setter.
    *
    * @param newPlate good
    */
    public void setLicensePlate(final String newPlate) {
        this.licensePlate = newPlate;
    }

    /**
    * Print all.
    */
    public void status() {
        super.status();
        System.out.println("License plate: " + licensePlate);
    }

    /**
    * Apply air.
    *
    * @param airPressure air pressure
    */
    public void applyAir(final int airPressure) {
        super.setSpeed(super.getSpeed() - airPressure);
    }

    /**
    * Method for number of tires.
    *
    * @return numberOfTires number of tires
    */
    public int getNumberOfTires() {
        return this.numberOfTires;
    }
}
