public class Pterodactyl extends Dinosaur {
    private double flightCeiling;

    public Pterodactyl(Sring name, double height, double width, double weight, double flightCeiling) {
        super(name, height, width, weight);
        this.flightCeiling = (flightCeiling < 10 || flightCeiling > 100) ? 50 : flightCeiling;
    }

    public Pterodactyl(String name, double width) {
        this(name, 15.0, width, 1000.0, 50);
    }

    public Pterodactyl(String name) {
        this(name, 12.0);
    }

    public Pterodactyl(Pterodactyl other) {
        this(other.name, other.getHeight(), other.getWidth, other.getWeight(), other.flightCeiling);
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

    public double getFlightCeiling() {
        return flightCeiling;
    }

    public void setFlightCeiling(double flightCeiling) {
        this.flightCeiling = (flightCeiling < 10 || flightCeiling > 100) ? 50 : flightCeiling;
    }
}