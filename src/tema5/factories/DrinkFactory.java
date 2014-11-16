/**
 * 
 */
package tema5.factories;
import tema5.drinks.Beer;
import tema5.drinks.Cocktail;
import tema5.drinks.IDrink;
import tema5.food.IFood;

/**
 * @author Razvan
 * DrinkFactory returns the requested drink class.
 */
public class DrinkFactory extends AbstractFactory{
	
	@Override
	public IFood getFood(String foodType)
	{
		return null;
	}
	
	@Override
	public IDrink getDrink(String drinkType)
	{
		
		if (drinkType == "beer")
			return new Beer();
		
		if (drinkType == "cocktail")
			return new Cocktail();
		
		return null;
	}

}
