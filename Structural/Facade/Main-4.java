//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Restaurant restaurant=new Restaurant();

        Host host=restaurant.getHost();

        System.out.println(host.getMenu("Italian"));

    }
}