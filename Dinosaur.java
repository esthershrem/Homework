/**
 * Represents a dinosaur in the Jurassic Park.
 * @author Esther Shrem
 */
public class Dinosaur {
    protected final String name;
    private double height;
    private double width;
    private double weight;
    protected static int totalEnclosures = 0;

    /**
     * Constructs a dinosaur with the specified name, height, width, and weight.
     *
     * @param name the name of the dinosaur
     * @param height the height of the dinosaur
     * @param width the width of the dinosaur
     * @param weight the weight of the dinosaur
     */
    public Dinosaur(String name, double height, double width, double weight) {
        this.name = (name == null || name.trim().isEmpty()) ? "Barney" : name;
        this.height = height;
        this.width = width;
        this.weight = weight;
    }

    /**
     * Default constructor for Dinosaur.
     */
    public Dinosaur() {
        this("Barney", 15.0, 20.0, 1000.0);
    }

    /**
     * Copy constructor for Dinosaur.
     *
     * @param other the Dinosaur to copy
     */
    public Dinosaur(Dinosaur other) {
        this(other.name, other.height, other.width, other.weight);
    }

    /**
     * Returns the enclosure size required for the dinosaur.
     *
     * @return the enclosure size
     */
    public double enclosureSize() {
        return (height * width) * 10;
    }

    /**
     * Calculates the amount of food required for the dinosaur.
     *
     * @return the amount of food
     */
    public double calculateFood() {
        return height * weight * width;
    }

     /**
     * String representation of this object.
     *
     * @return string representation
     */
    @Override
    public String toString() {
        return String.format("%s requires a %.2f square foot enclosure and %.2f pounds of food.",
        name, enclosureSize(), calculateFood());
    }

    /**
     * Builds the enclosure for the dinosaur and returns a description.
     *
     * @return the enclosure description
     */
    public String buildEnclosure() {
        String result = toString();
        if (enclosureSize() > 6000.0 || calculateFood() > 80000.0) {
            result += " " + name + " is too expensive for the park!";
        } else {
            result += " " + name + " has been added to the park!";
            totalEnclosures++;
        }
        return result;
    }

    // Getters and setters for the dinosaur properties

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getTotalEnclosures() {
        return totalEnclosures;
    }
}
