package factories;
import crossover.CrossOver;
import crossover.Cross_over1;
import crossover.Cross_over2;
import mutation.Mutation1;
import mutation.Mutation2;
import mutation.Mutation;
import selection.Selection;
import selection.Selection_Rank;
import selection.Selection_tournament;

// TODO: Auto-generated Javadoc
/**
 * The Class Factory1.
 * 
 *  @author SakinaFatima
 */
public class Factory1 extends GA_AbstractFactory{

	/* (non-Javadoc)
	 * @see factories.GA_AbstractFactory#makeSelection(java.lang.String)
	 */
	protected Selection makeSelection(String type) {
		if (type.equals("Tournament"))
		{
			return new Selection_tournament();
			
		}
		else if (type.equals("Rank")){
			return new Selection_Rank();}
		else return null;
	}

	/* (non-Javadoc)
	 * @see factories.GA_AbstractFactory#selectCrossover(java.lang.String)
	 */
	@Override
	protected CrossOver selectCrossover(String type) {
		if (type.equals("two"))
		{
			return new Cross_over2();
			
		}
		else if (type.equals("one")){
		return new Cross_over1();}
		else return null;
	}

	/* (non-Javadoc)
	 * @see factories.GA_AbstractFactory#selectMutation(java.lang.String)
	 */
	@Override
	protected Mutation selectMutation(String type) {
		if (type.equals("boundary"))
		{
			return new Mutation2();
			
		}
		else if (type.equals("flip")){
			 return new Mutation1();
			}
		 else return null;
			}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Factory 1";
	}
   
}
