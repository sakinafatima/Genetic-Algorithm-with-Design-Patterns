package factories;
import crossover.CrossOver;
import crossover.Cross_over1;
import crossover.Cross_over2;
import mutation.Mutation;
import mutation.Mutation1;
import mutation.Mutation2;
import selection.Selection;
import selection.Selection_Rank;
import selection.Selection_tournament;

// TODO: Auto-generated Javadoc
/**
 * The Class Factory2.
 * This Factory2 is more like Factory1 but it is here to show the concept of abstract factory pattern that if in future the code expands and there
 * are more factories then just like this factory another one is just added as a subclass of the abstract factory class without disturbing the current code.
 * 
 * @author SakinaFatima
 */
public class Factory2 extends GA_AbstractFactory {

	/* (non-Javadoc)
	 * @see factories.GA_AbstractFactory#makeSelection(java.lang.String)
	 */
	protected Selection makeSelection(String type) {
		if (type.equals("Rank"))
		{
			return new Selection_Rank();
			
		}
		else if (type.equals("Tournament")){
			return new Selection_tournament();}
		else return null;
	}

	/* (non-Javadoc)
	 * @see factories.GA_AbstractFactory#selectCrossover(java.lang.String)
	 */
	@Override
	protected CrossOver selectCrossover(String type) {
		if (type.equals("one"))
		{
			return new Cross_over1();
			
		}
		else if (type.equals("two")){
		return new Cross_over2();}
		else return null;
	}

	/* (non-Javadoc)
	 * @see factories.GA_AbstractFactory#selectMutation(java.lang.String)
	 */
	@Override
	protected Mutation selectMutation(String type) {
		if (type.equals("flip"))
		{
			 return new Mutation1();
			
		}
		else if (type.equals("boundary")){
			return new Mutation2();
			}
		 else return null;
			}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Factory 2";
	}
}
