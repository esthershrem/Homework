/**
 * Represents a pack of dinosaurs.
 */
public class Pack {
    private final int size;
    private final String packName;

    /**
     * Constructs a pack with the specified size and name.
     *
     * @param size the size of the pack
     * @param packName the name of the pack
     */
    public Pack(int size, String packName) {
        this.size = (size < 0) ? 4 : size;
        this.packName = (packName == null || packName.trim().isEmpty()) ? "The Power Pack" : packName;
    }

    @Override
    public String toString() {
        return String.format("%s is a family of dinosaurs of size %d!", packName, size);
    }

    public int getSize() {
        return size;
    }

    public String getPackName() {
        return packName;
    }
}
