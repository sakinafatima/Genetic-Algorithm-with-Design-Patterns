package mutation;

import geneticAlgoProcess.FitnessModel;
import geneticAlgoProcess.Population;

// TODO: Auto-generated Javadoc
/**
 * The Interface Mutation.
 * 
 *  @author SakinaFatima
 */
public interface Mutation {

	/**
	 * Mutation.
	 *
	 * @param population the population
	 * @param fitnessModel the fitness model
	 * @return the fitness model
	 */
	FitnessModel mutation(Population population, FitnessModel fitnessModel);
}
