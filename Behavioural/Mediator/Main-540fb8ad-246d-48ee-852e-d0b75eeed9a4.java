//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        RestaurantMediator mediator=new RestaurantMediator();

        WingChef pizzaChef=new WingChef(mediator, "Pizza Wing");
        WingChef burgerChef=new WingChef(mediator, "Hamburger Wing");
        WingChef sandwichChef = new WingChef(mediator, "Sandwich Wing");

        ((RestaurantMediator) mediator).addChefToPool(pizzaChef);
        ((RestaurantMediator) mediator).addChefToPool(burgerChef);
        ((RestaurantMediator) mediator).addChefToPool(sandwichChef);

        pizzaChef.requestAdvice();
        sandwichChef.requestAdvice();
    }
}