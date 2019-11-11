/**
 * This is strategy class. Here one of the strategy will be randomly returned at run time. Here its done by math.Random function but here client's input can be used to select the strategy.
 * @author SakinaFatima
 * 
*/
package strategy;


// TODO: Auto-generated Javadoc
/**
 * The Class Strategy.
 * 
 *  @author SakinaFatima
 */
public class Strategy {

	/**
	 * Gets the selection.
	 *
	 * @return the selection
	 */
	public static StrategySelection getSelection()
	{
		if (Math.random()<0.2)
	 	{
	 	 return new StrategyA();
	 	}
	 	else 
	 		
		return new StrategyB();
}
}
