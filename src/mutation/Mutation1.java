package mutation;

import java.util.Random;

import geneticAlgoProcess.FitnessModel;
import geneticAlgoProcess.Population;

// TODO: Auto-generated Javadoc
/**
 * The Class Mutation1.
 * 
 *  @author SakinaFatima
 */
public class Mutation1 implements Mutation{

	/* (non-Javadoc)
	 * @see mutation.Mutation#mutation(geneticAlgoProcess.Population, geneticAlgoProcess.FitnessModel)
	 */
	@Override
	public FitnessModel mutation(Population population, FitnessModel fitnessModel) {
		
		   Random rand = new Random();

	        //Select a random mutation point
	        int mutationPoint = rand.nextInt(population.individuals[0].geneLength);

	        //Flip values at the mutation point
	        if (fitnessModel.fittest.genes[mutationPoint] == 0) {
	        	fitnessModel.fittest.genes[mutationPoint] = 1;
	        } else {
	        	fitnessModel.fittest.genes[mutationPoint] = 0;
	        }

	        mutationPoint = rand.nextInt(population.individuals[0].geneLength);

	        if (fitnessModel.secondFittest.genes[mutationPoint] == 0) {
	        	fitnessModel.secondFittest.genes[mutationPoint] = 1;
	        } else {
	        	fitnessModel.secondFittest.genes[mutationPoint] = 0;
	        }
	        
	        return fitnessModel;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Flip Bit Mutation";
	}
}
