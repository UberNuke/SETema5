/**
 * 
 */
package tema5.factories;

/**
 * @author Razvan
 * FactoryProducer instantiates and returns the appropriate factory.
 */
public class FactoryProducer {

	public static AbstractFactory getFactory(String factoryType)
	{
		if (factoryType == "drink")
			return new DrinkFactory();
		
		if (factoryType == "food")
			return new FoodFactory();
		
		return null;
	}
}
