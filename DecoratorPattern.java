
public class DecoratorPattern {
	 public static void main(String[] args) {

	      Burger classic = new Classic();

	      Burger cheese = new BurgerDecorator(new Cheese());

	      Burger egg = new BurgerDecorator(new Egg());
	      System.out.println("Classic Burger");
	      classic.make();

	      System.out.println("Cheeseburger");
	      cheese.make();

	      System.out.println("EggBuger");
	      egg.make();
	   }
}
