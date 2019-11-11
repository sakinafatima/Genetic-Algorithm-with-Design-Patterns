package crossover;

import java.util.Random;

import geneticAlgoProcess.FitnessModel;
import geneticAlgoProcess.Population;

// TODO: Auto-generated Javadoc
/**
 * The Class Cross_over2.
 */
public class Cross_over2 implements CrossOver {
	
	/* (non-Javadoc)
	 * @see crossover.CrossOver#crossover(geneticAlgoProcess.Population, geneticAlgoProcess.FitnessModel)
	 */
	public FitnessModel crossover(Population population, FitnessModel fitnessModel) {
        Random rn = new Random();

        //This is a two-point CrossOver
        //Here two crossover points are picked randomly from the parent chromosomes. 
        //The bits in between the two points are swapped between the parent organisms
        int crossOverPoint = rn.nextInt(population.individuals[0].geneLength);
        int crossOverPoint2 = rn.nextInt(population.individuals[0].geneLength);
       
        //Swap values at first CrossOver Point
        for (int i = 0; i < crossOverPoint; i++) {
            int temp = fitnessModel.fittest.genes[i];
            fitnessModel.fittest.genes[i] = fitnessModel.secondFittest.genes[i];
            fitnessModel.secondFittest.genes[i] = temp;

        }
        //Swap values at second CrossOver Point
        for (int i = 0; i < crossOverPoint2; i++) {
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
		return "Two-Point CrossOver";
	}
}
