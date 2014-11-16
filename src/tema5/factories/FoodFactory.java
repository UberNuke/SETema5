package tema5.factories;
import tema5.drinks.IDrink;
import tema5.food.HouseSpecial;
import tema5.food.IFood;
import tema5.food.Mexican;

/**
 * @author Razvan
 * FoodFactory returns the requested food class.
 */
public class FoodFactory extends AbstractFactory{
	
	@Override
	public IFood getFood(String foodType)
	{
		if (foodType == "mexican")
			return new Mexican();
		
		if (foodType == "house special")
			return new HouseSpecial();
		
		return null;
	}
	
	@Override
	public IDrink getDrink(String drinkType)
	{
		return null;
	}
	
}