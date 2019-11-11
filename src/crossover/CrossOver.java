package crossover;

import geneticAlgoProcess.FitnessModel;
import geneticAlgoProcess.Population;

// TODO: Auto-generated Javadoc
/**
 * The Interface CrossOver.
 */
public interface CrossOver {

	/**
	 * Crossover.
	 *
	 * @param population the population
	 * @param fitnessModel the fitness model
	 * @return the fitness model
	 */
	FitnessModel crossover(Population population, FitnessModel fitnessModel);
}
