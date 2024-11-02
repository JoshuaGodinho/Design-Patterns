public class Water extends SodaFountain{
    @Override
    public void dispenseSoda() {
        System.out.println("Dispensing water");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding a few cubes of ice to the water");
    }
}
