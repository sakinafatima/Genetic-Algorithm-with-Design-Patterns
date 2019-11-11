package mutation;

import java.util.Random;

import geneticAlgoProcess.FitnessModel;
import geneticAlgoProcess.Population;

// TODO: Auto-generated Javadoc
/**
 * The Class Mutation2.
 * 
 *  @author SakinaFatima
 */
public class Mutation2 implements Mutation {
	
	/* (non-Javadoc)
	 * @see mutation.Mutation#mutation(geneticAlgoProcess.Population, geneticAlgoProcess.FitnessModel)
	 */
	@Override

	public FitnessModel mutation(Population population, FitnessModel fitnessModel) {
		 Random rand = new Random();


	        //Since its the Boundry Mutation, we will select the boundry value as a mutation point and then flip the bit
		    int mutationPoint = (int) getMutationBoundary(rand.nextInt(population.individuals[0].geneLength));// 

	        //Flip values at the mutation point
	        if (fitnessModel.fittest.genes[mutationPoint] == 0) {
	        	fitnessModel.fittest.genes[mutationPoint] = 1;
	        } else {
	        	fitnessModel.fittest.genes[mutationPoint] = 0;
	        }
	       //Selecting Boundary value mutation point of second parent
	         mutationPoint = (int) getMutationBoundary(rand.nextInt(population.individuals[0].geneLength));
            
	        if (fitnessModel.secondFittest.genes[mutationPoint] == 0) {
	        	fitnessModel.secondFittest.genes[mutationPoint] = 1;
	        } else {
	        	fitnessModel.secondFittest.genes[mutationPoint] = 0;
	        }
	        
	        return fitnessModel;
	    }
	
	/**
	 * Gets the mutation boundary.
	 *
	 * @param generation the generation
	 * @return the mutation boundary
	 */
	float getMutationBoundary(int generation) {
	    float boundary =4 - 0.1f * generation;

	    if (boundary < 0) {
	        boundary = 0;
	    }
	    return boundary;    
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Boundary Mutation";
	}
	}


