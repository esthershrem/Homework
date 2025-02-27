public class Dinosaur {
    protected final String name;
    private double height;
    private double width;
    private double weight;
    protected static int totalEnclosures = 0;

    public Dinosaur(String name, double height, double width, double weight) {
        this.name = (name == null || name.trim().isEmpty()) ? "Barney" : name;
        this.height = height;
        this.width = width;
        this.weight = weight;
    }

    public Dinosaur() {
        this("Barney", 15.0, 20.0, 1000.0);
    }

    public Dinosaur(Dinosaur other) {
        this(other.name, other.height, other.width, other.weight);
    }

    public double enclosureSize() {
        return (height * width) * 10;
    }

    public double calculateFood() {
        return height * weight * width;
    }

    @Override
    public String toString() {
        return String.format("%s requires a %.2f square foot enclosure and %.2f pounds of food.", name, enclosureSize(), calculateFood());
    }

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
