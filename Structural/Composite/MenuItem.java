public class MenuItem extends MenuComponent{

    private String name;
    private String description;
    private String image;
    private double price;

    public MenuItem(String name, String description, String image, double price) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.price = price;

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getPhoto() {
        return image;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println("Item: " + getName() + ", " + getDescription() + ", Photo: " + getPhoto() + ", Price: $" + getPrice());
    }
}
