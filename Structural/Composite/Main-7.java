//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MenuComponent pancake = new MenuItem("Pancake", "Fluffy pancakes with syrup", "pancake.jpg", 7.99);
        MenuComponent omelette = new MenuItem("Omelette", "Three-egg omelette with cheese", "omelette.jpg", 8.99);
        MenuComponent pizza = new MenuItem("Pizza", "Margherita pizza with fresh basil", "pizza.jpg", 12.99);
        MenuComponent burger = new MenuItem("Burger", "Beef burger with fries", "burger.jpg", 10.99);

        MenuComponent breakfastMenu = new Menu("Breakfast Menu", "Weekday Breakfast Items");
        MenuComponent weekendBreakfastMenu = new Menu("Weekend Breakfast Menu", "Special Weekend Breakfast Items");

        breakfastMenu.add(pancake);
        breakfastMenu.add(omelette);
        weekendBreakfastMenu.add(new MenuItem("French Toast", "Crispy French toast with syrup", "frenchtoast.jpg", 9.99));

        MenuComponent weekdayLunchMenu = new Menu("Weekday Lunch Menu", "Lunch Items");
        weekdayLunchMenu.add(pizza);
        weekdayLunchMenu.add(burger);

        MenuComponent weekendLunchMenu = new Menu("Weekend Lunch Menu", "Special Lunch Items for weekend");
        weekendLunchMenu.add(new MenuItem("Beef Steak", "Medium rare steak with veggies", "beefSteak.jpg", 8.99));

        MenuComponent restaurantMenu = new Menu("Restaurant Menu", "All available meals");
        restaurantMenu.add(breakfastMenu);
        restaurantMenu.add(weekendBreakfastMenu);
        restaurantMenu.add(weekdayLunchMenu);
        restaurantMenu.add(weekendLunchMenu);

        restaurantMenu.print();

        }
    }