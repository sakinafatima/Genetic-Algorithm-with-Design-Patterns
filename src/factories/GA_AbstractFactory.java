package factories;
import crossover.CrossOver;
import geneticAlgoProcess.Genetic_AlgoritmProcess;
import mutation.Mutation;
import selection.Selection;


// TODO: Auto-generated Javadoc
/**
 * A factory for creating GA_Abstract objects.
 * 
 *  @author SakinaFatima
 */
public abstract class GA_AbstractFactory
{
	
	/** The selection. */
	Selection  selection;
	
	/** The crossover. */
	CrossOver  crossover;
	
	/** The mutation. */
	Mutation   mutation;
	
	/** The ga. */
	Genetic_AlgoritmProcess ga= new Genetic_AlgoritmProcess();
	
	/**
	 * Do process.
	 *
	 * @param type the type
	 * @param cross the cross
	 * @param mutate the mutate
	 * @param factory the factory
	 */
	public void doProcess(String type, String cross, String mutate, GA_AbstractFactory factory ) {
		 selection= factory.makeSelection(type);
		 crossover= factory.selectCrossover(cross);
		 mutation= factory.selectMutation(mutate);
		 ga.startProcess(selection, crossover, mutation);
	}
	
	/**
	 * Make selection.
	 *
	 * @param type the type
	 * @return the selection
	 */
	protected abstract Selection makeSelection(String type);

	/**
	 * Select crossover.
	 *
	 * @param cross the cross
	 * @return the cross over
	 */
	protected abstract CrossOver selectCrossover(String cross);

	/**
	 * Select mutation.
	 *
	 * @param mutate the mutate
	 * @return the mutation
	 */
	protected abstract Mutation selectMutation(String mutate);	
	
}

