package geneticAlgoProcess;

import java.util.Random;

import crossover.CrossOver;
import mutation.Mutation;
import selection.Selection;
// TODO: Auto-generated Javadoc

/**
 * The Class Genetic_AlgoritmProcess.
 * 
 *  @author SakinaFatima
 */
public class Genetic_AlgoritmProcess {

	/** The fitness model. */
	FitnessModel fitnessModel = new FitnessModel();
    
    /** The rand. */
    Random rand = new Random();
    
    /** The generation count. */
    int generationCount = 0;
    
    /** The population. */
    Population population= Population.getInstance();//Singleton pattern part 4: calling getInstance() to create an object of population here
    //Population population2 = Population.getInstance(); /*just for demonstration purpose, I am creating an other instance of population to show that with singleton pattern, 
    //only one instance of population will be created at one time. You can comment out line 21 below and see that both of these instances 
    /**
     * StartProcess.
     *
     * @param selection the selection
     * @param crossOver the crossOver
     * @param mutation the mutation
     */
    //are pointing towards same address in memory.
    public void startProcess(Selection selection,CrossOver crossOver, Mutation mutation)
	{
			//Initialize population
        population.calculateFitness(); 
        //System.out.println("Both instances of population pointing at same address( just for demo) " + "first instance: " + population + " second instance: " + population2); [1]
        System.out.println("Generation:" +  generationCount + " Fittest:" +  population.fittest );
        while ( population.fittest < 5) {
        	
            ++generationCount;
            fitnessModel = selection.selection(population, fitnessModel);//Do selection
            fitnessModel = crossOver.crossover(population, fitnessModel); //Do crossover

            if (rand.nextInt() < 2.5) { 					//Do mutation under a random probability
            	fitnessModel =  mutation.mutation(population, fitnessModel);
            }

            fitnessModel =  addFittestOffspring(population, fitnessModel);  	//Add fittest offspring to population
            population.calculateFitness(); 								//Calculate new fitness value

            System.out.println("Generation:" +  generationCount + " Fittest:" +  population.fittest);
            //individual.print();
            if (generationCount>10000)// limiting the search to ten thousand iterations so that it does not go to an infinate loop.
            {
            	System.out.println("Solution not found in defined time, so cannot execute further. Run Again!");
            	System.exit(0);
            }
        }

        System.out.println("\nSolution found in generation " +  generationCount +" with Selection Method: "+ selection.toString()+ " ,CrossOver Method: " + crossOver.toString()+ " and Mutation Method: "+ mutation.toString());
        System.out.println("Fitness: "+ population.getFittest().fitness);
        System.out.print("Genes: ");
       
        
        for (int i = 0; i < 5; i++) {
            System.out.print( population.getFittest().genes[i]);
        }

        System.out.println("");


}

    /**
     * Gets the fittest offspring.
     *
     * @param fitnessModel the fitness model
     * @return the fittest offspring
     */
    public //Get fittest offspring
    Person getFittestOffspring(FitnessModel fitnessModel) {
        if (fitnessModel.fittest.fitness > fitnessModel.secondFittest.fitness) {
            return fitnessModel.fittest;
        }
        return fitnessModel.secondFittest;
    }


    /**
     * Adds the fittest offspring.
     *
     * @param population the population
     * @param fitnessModel the fitness model
     * @return the fitness model
     */
    //Replace least fittest individual from most fittest offspring [1]
    public FitnessModel addFittestOffspring(Population population, FitnessModel fitnessModel) {

        //Update fitness values of offspring
    	fitnessModel.fittest.checkFitness();
    	fitnessModel.secondFittest.checkFitness();

        //Get index of least fit individual
        int leastFittestIndex = population.getLeastFittestIndex();

        //Replace least fittest individual from most fittest offspring
        population.individuals[leastFittestIndex] = getFittestOffspring(fitnessModel);
        
        return fitnessModel;
        
      
    }
   
}
//References: [1] https://towardsdatascience.com/introduction-to-genetic-algorithms-including-example-code-e396e98d8bf3
