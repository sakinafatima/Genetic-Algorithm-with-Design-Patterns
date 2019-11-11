package crossover;

import java.util.Random;

import geneticAlgoProcess.FitnessModel;
import geneticAlgoProcess.Population;

// TODO: Auto-generated Javadoc
/**
 * The Class Cross_over1.
 */
public class Cross_over1 implements CrossOver{
	
	/* (non-Javadoc)
	 * @see crossover.CrossOver#crossover(geneticAlgoProcess.Population, geneticAlgoProcess.FitnessModel)
	 */
	public FitnessModel crossover(Population population, FitnessModel fitnessModel) {
        Random rn = new Random();
        //This is a Single-point crossover
        //Here A point on both parents' chromosomes is picked randomly, and designated a 'crossover point'.
        //Only one Crossover point is selected 
        int crossOverPoint = rn.nextInt(population.individuals[0].geneLength);

        //Values of parent's chromosome is swapped at only one crossover point
        for (int i = 0; i < crossOverPoint; i++) {
            int temp = fitnessModel.fittest.genes[i];
            fitnessModel.fittest.genes[i] = fitnessModel.secondFittest.genes[i];
            fitnessModel.secondFittest.genes[i] = temp;
        }
        
        return fitnessModel;
    }
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Single-Point CrossOver";
	}
}
