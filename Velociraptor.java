public class Velociraptor extends Dinosaur {
    private int speed;
    private Pack pack;

    public Velociraptor(String name, double height, double width, double weight, int speed, Pack pack) {
        super(name, height, width, weight);
        this.speed = (seed < 0) ? 30 : speed;
        this.pack = pack;
    }

    public Velociraptor(String name, double height) {
        this(name, height, 12.0, 1000.0, 30, null);
    }

    public Velociraptor(Velociraptor other) {
        this(other.name, other.getHeight(), other.getWidth, other.getWeight(), other.speed, other.pack);
    }

    @Override
    public double enclosureSize() {
        if (pack == null) {
            return 4 * getWidth() * getHeight();
        } else {
            return size * getWidth() * getHeight();
        }
    }

    @Override
    public double calculateFood() {
        return getWeight() * speed * getHeight();
    }

    @Override
    public String toString() {
        if (pack == null) {
            return String.format("%s requires a %.2f square foot enclosure and %.2f pounds of food.", name, encolosureSize(), calculateFood());
        } else {
            return String.format("%s is a family of dinosaurs of size %d! "
            + "%s requires a %.2f square foot enclosure and %.2f pounds of food.",
            packName, size, name, enclosureSize(), calculateFood());
        }
    }

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