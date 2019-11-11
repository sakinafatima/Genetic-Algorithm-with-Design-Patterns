package selection;

import geneticAlgoProcess.FitnessModel;
import geneticAlgoProcess.Population;

// TODO: Auto-generated Javadoc
/**
 * The Interface Selection.
 * 
 *  @author SakinaFatima
 */
public interface Selection {

	/**
	 * Selection.
	 *
	 * @param population the population
	 * @param fitnessModel the fitness model
	 * @return the fitness model
	 */
	FitnessModel selection(Population population, FitnessModel fitnessModel);
	
}
