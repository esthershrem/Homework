/**
 * Represents a Pterodactyl in the Jurassic Park.
 */
public class Pterodactyl extends Dinosaur {
    private double flightCeiling;

    /**
     * Constructs a Pterodactyl with the specified attributes.
     *
     * @param name the name of the Pterodactyl
     * @param height the height of the Pterodactyl
     * @param width the width of the Pterodactyl
     * @param weight the weight of the Pterodactyl
     * @param flightHeight the flight height of the Pterodactyl
     */
    public Pterodactyl(String name, double weight, double height, double width, double flightSpeed) {
        super(name, height, width, weight);
        this.flightCeiling = (flightCeiling < 10 || flightCeiling > 100) ? 50 : flightCeiling;
    }

    /**
     * Constructs a Pterodactyl with default weight, and flight height.
     *
     * @param name the name of the Pterodactyl
     * @param width the width of the Pterodactyl
     */
    public Pterodactyl(String name, double width) {
        this(name, 15.0, width, 1000.0, 50);
    }

    /**
     * Constructs a Pterodactyl with default width, weight, and flight height.
     *
     * @param name the name of the Pterodactyl
     */
    public Pterodactyl(String name) {
        this(name, 12.0);
    }

    /**
     * Copy constructor for Pterodactyl.
     *
     * @param other the Pterodactyl to copy
     */
    public Pterodactyl(Pterodactyl other) {
        this(other.name, other.getHeight(), other.getWidth(), other.getWeight(), other.flightCeiling);
    }

    @Override
    public double enclosureSize() {
        return 4 * getWidth() * getHeight() + flightCeiling;
    }

    @Override
    public String toString() {
        return String.format("%s can fly %.2f feet into the air! %s requires a"
                    + " %.2f square foot enclosure and %.2f pounds of food.",
                    name, flightCeiling, name, enclosureSize(), calculateFood());
    }

    // Getters and setters for the Pterodactyl properties

    public double getFlightCeiling() {
        return flightCeiling;
    }

    public void setFlightCeiling(double flightCeiling) {
        this.flightCeiling = (flightCeiling < 10 || flightCeiling > 100) ? 50 : flightCeiling;
    }
}
