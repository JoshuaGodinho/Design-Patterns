public class Cup implements Cloneable {
    private String height;

    public Cup(String height) {
        this.height = height;
    }

    public String getHeight() {
        return height;
    }

    @Override
    public Cup clone() {
        return new Cup(this.height);
    }

    @Override
    public String toString() {
        return "Cup [height=" + height + "]";
    }
}
