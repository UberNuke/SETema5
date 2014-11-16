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
		
		//Created a DrinkFactory object using the FactoryProducer
		AbstractFactory drinkFactory1 = FactoryProducer.getFactory("drink");
		//Created a Beer object using the DrinkFactory instantiated earlier
		IDrink drink1 = drinkFactory1.getDrink("beer");
		//Called the method prepareDrinks implemented from IDrink
		drink1.prepareDrink();
		
		//Created a FoodFactory object using the FactoryProducer
		AbstractFactory foodFactory1 = FactoryProducer.getFactory("food");
		//Created a Mexican object using the FoodFactory instantiated earlier
		IFood food1 = foodFactory1.getFood("mexican");
		//Called the method cookFood implemented from IFood
		food1.cookFood();
	}

}
