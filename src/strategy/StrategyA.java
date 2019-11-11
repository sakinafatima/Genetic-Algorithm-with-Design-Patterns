package strategy;

import factories.Factory1;
import factories.Factory2;
import factories.GA_AbstractFactory;

// TODO: Auto-generated Javadoc
/**
 * The Class StrategyA.
 * 
 *  @author SakinaFatima
 */
public class StrategyA implements StrategySelection {

	/* (non-Javadoc)
	 * @see strategy.StrategySelection#getfactory()
	 */
	@Override
	public GA_AbstractFactory getfactory() {
		{ 
			if (Math.random()<0.2)
		 	{
		 	 return new Factory1();
		 	}
		 	else 
		 		
			return new Factory2();
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Strategy A";
	}
}


