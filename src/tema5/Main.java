/**
 * 
 */
package tema5;

import tema5.factories.FactoryProducer;
import tema5.factories.*;
import tema5.drinks.*;
import tema5.food.*;

/**
 * @author Razvan
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AbstractFactory drinkFactory1 = FactoryProducer.getFactory("drink");
		IDrink drink1 = drinkFactory1.getDrink("beer");
		drink1.prepareDrink();
		
		AbstractFactory foodFactory1 = FactoryProducer.getFactory("food");
		IFood food1 = foodFactory1.getFood("mexican");
		food1.cookFood();
	}

}
