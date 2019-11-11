package strategy;

import java.util.Random;

import factories.Factory1;
import factories.Factory2;
import factories.GA_AbstractFactory;

// TODO: Auto-generated Javadoc
/**
 * The Class StrategyB.
 * 
 *  @author SakinaFatima
 */
public class StrategyB implements StrategySelection{
 
 /** The r. */
 Random r= new Random();
	
	/* (non-Javadoc)
	 * @see strategy.StrategySelection#getfactory()
	 */
	@Override
	public GA_AbstractFactory getfactory() 
		{
			if (r.nextInt(10)<5)
			{
		 	 return new Factory1();
		 	}
		 	else
		 	
		 		return new Factory2();
	
		}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Strategy B";
	}
}
	
	


