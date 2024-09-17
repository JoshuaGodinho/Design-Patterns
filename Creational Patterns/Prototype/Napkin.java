public class Napkin implements Cloneable {
    private String color;

    public Napkin(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public Napkin clone() {
        return new Napkin(this.color);
    }

    @Override
    public String toString() {
        return "Napkin [color=" + color + "]";
    }
}
