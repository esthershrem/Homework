/**
 * Represents a Velociraptor in the Jurassic Park.
 */
public class Velociraptor extends Dinosaur {
    private int speed;
    private Pack pack;

    /**
     * Constructs a Velociraptor with the specified attributes.
     *
     * @param name the name of the Velociraptor
     * @param height the height of the Velociraptor
     * @param width the width of the Velociraptor
     * @param weight the weight of the Velociraptor
     * @param speed the speed of the Velociraptor
     * @param pack the pack of the Velociraptor
     */
    public Velociraptor(String name, double height, double width, double weight, int speed, Pack pack) {
        super(name, height, width, weight);
        this.speed = (speed < 0) ? 30 : speed;
        this.pack = pack;
    }

    /**
     * Constructs a Velociraptor with default width, weight, and speed.
     *
     * @param name the name of the Velociraptor
     * @param height the height of the Velociraptor
     */
    public Velociraptor(String name, double height) {
        this(name, height, 12.0, 1000.0, 30, null);
    }

    /**
     * Copy constructor for Velociraptor.
     *
     * @param other the Velociraptor to copy
     */
    public Velociraptor(Velociraptor other) {
        this(other.name, other.getHeight(), other.getWidth(), other.getWeight(), other.speed, other.pack);
    }

    @Override
    public double enclosureSize() {
        if (pack == null) {
            return 4 * getWidth() * getHeight();
        } else {
            return pack.getSize() * getWidth() * getHeight();
        }
    }

    @Override
    public double calculateFood() {
        return getWeight() * speed * getHeight();
    }

    @Override
    public String toString() {
        if (pack == null) {
            return String.format("%s requires a %.2f square foot enclosure and %.2f pounds of food.",
            name, enclosureSize(), calculateFood());
        } else {
            return String.format("%s is a family of dinosaurs of size %d! "
            + "%s requires a %.2f square foot enclosure and %.2f pounds of food.",
            pack.getPackName(), pack.getSize(), name, enclosureSize(), calculateFood());
        }
    }

    // Getters and setters for the Velociraptor properties

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = (speed < 0) ? 30 : speed;
    }

    public Pack getPack() {
        return pack;
    }

    public void setPack(Pack pack) {
        this.pack = pack;
    }
}
