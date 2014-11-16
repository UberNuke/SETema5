/**
 * 
 */
package tema5.factories;
import tema5.drinks.*;
import tema5.food.*;

/**
 * @author Razvan
 * AbstractFactory to be extended by the Drinks and Food factories
 */
public abstract class AbstractFactory {

	public abstract IFood getFood(String foodType);
	public abstract IDrink getDrink(String drinkType);

}
