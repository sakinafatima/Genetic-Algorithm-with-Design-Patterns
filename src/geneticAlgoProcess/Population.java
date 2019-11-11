package geneticAlgoProcess;
// TODO: Auto-generated Javadoc

/**
 * The Class Population.
 * 
 *  @author SakinaFatima
 */
/* This class implements the concept of Singleton Pattern. It will create only one instance
	 * of InitialPopulation class.Here, I have chosen lazy initialization because it's threadsafe
	 * and initialization happens at class loading time, and Java does not load classes until they
	 * are first referred. Because of single instance creation, all classes of this code will
	 * access the same data created in Population class.
	 */
public class Population {
	
	/** The instance. */
	private static Population instance = null; //singleton part 1: creating a private static instance of Population
	
	/** The random id. */
	int randomId;
	 
 	/** The population size. */
 	int populationSize = 10;
	    
    	/** The individuals. */
    	public Person[] individuals = new Person[10];
	    
    	/** The fittest. */
    	int fittest = 0;
	    
    	/**
    	 * Instantiates a new population.
    	 */
    	private Population()// singleton part 2
		{
	    	initializePopulation(populationSize);
		}
	    
    	/**
    	 * Initialize population.
    	 *
    	 * @param size the size
    	 */
    	//Initialize population
	    public void initializePopulation(int size) {
	        for (int i = 0; i < individuals.length; i++) {
	            individuals[i] = new Person();
	        }
	    }

	    /**
    	 * Gets the fittest.
    	 *
    	 * @return the fittest
    	 */
    	//Get the fittest individual 
	    public Person getFittest() {
	        int highFit = Integer.MIN_VALUE;
	        int highFitIndex = 0;
	        for (int i = 0; i < individuals.length; i++) {
	            if (highFit <= individuals[i].fitness) {
	                highFit = individuals[i].fitness;
	                highFitIndex = i;
	            }
	        }
	        fittest = individuals[highFitIndex].fitness;
	        return individuals[highFitIndex];
	    }

	    /**
    	 * Gets the second fittest.
    	 *
    	 * @return the second fittest
    	 */
    	//Get the second most fittest individual[1]
	    public Person getSecondFittest() {
	        int highFit1 = 0;
	        int highFit2 = 0;
	        for (int i = 0; i < individuals.length; i++) {
	            if (individuals[i].fitness > individuals[highFit1].fitness) {
	                highFit2 = highFit1;
	                highFit1 = i;
	            } else if (individuals[i].fitness > individuals[highFit2].fitness) {
	                highFit2 = i;
	            }
	        }
	        return individuals[highFit2];
	    }

	    /**
    	 * Gets the least fittest index.
    	 *
    	 * @return the least fittest index
    	 */
    	//Get index of least fittest individual [1]
	    public int getLeastFittestIndex() {
	        int minFitVal = Integer.MAX_VALUE;
	        int minFitIndex = 0;
	        for (int i = 0; i < individuals.length; i++) {
	            if (minFitVal >= individuals[i].fitness) {
	                minFitVal = individuals[i].fitness;
	                minFitIndex = i;
	            }
	        }
	        return minFitIndex;
	    }    
	    
	    /**
    	 * Calculate fitness.
    	 */
    	//Calculate fitness of each individual [1]
	    public void calculateFitness() {

	        for (int i = 0; i < individuals.length; i++) {
	            individuals[i].checkFitness();
	        }
	        getFittest();
	    }
	    
	    /**
    	 * Gets the single instance of Population.
    	 *
    	 * @return single instance of Population
    	 */
    	public static Population getInstance() {//singleton part 2: method to get instance of population
			if(instance == null)
			{
				synchronized(Population.class) {
				instance = new Population(); 
				}
			}
			return instance;
		}
		
		/**
		 * Tournament pop.
		 *
		 * @return the person
		 */
		public Person tournamentPop() {// method for tournament selection
			for (int i=0; i<4; i++)
	    	{
	    		 randomId= (int)(Math.random()*populationSize);
	    	}
	    	fittest = individuals[randomId].fitness;
	       
	    	return individuals[randomId];
		} 
	}
//References: [1] https://towardsdatascience.com/introduction-to-genetic-algorithms-including-example-code-e396e98d8bf3
