public class ChocolateController {
	public static void main(String args[]) {
		ChocolateBoiler boiler = ChocolateBoiler.getUniqueInstance();
		boiler.fill();
		boiler.boil();
		boiler.drain();
		System.out.println(boiler.toString());
		// This line should return the existing instance and not create a new one
		ChocolateBoiler boiler2 = ChocolateBoiler.getUniqueInstance();
		System.out.println(boiler2.toString());
	}
}
