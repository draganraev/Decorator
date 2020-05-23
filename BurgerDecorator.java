
public class BurgerDecorator implements Burger {
	
	protected Burger createdBurger;

	   public BurgerDecorator(Burger createdBurger){
	      this.createdBurger = createdBurger;
	   }

	   public void make(){
	      createdBurger.make();
	   }	
}
