public class Pack {
    private final int size;
    private final String packName;

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