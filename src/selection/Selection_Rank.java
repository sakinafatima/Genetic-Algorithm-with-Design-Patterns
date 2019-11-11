package selection;

import geneticAlgoProcess.FitnessModel;
import geneticAlgoProcess.Population;

// TODO: Auto-generated Javadoc
/**
 * The Class Selection_Rank.
 * 
 *  @author SakinaFatima
 */
public class Selection_Rank implements Selection{

	/* (non-Javadoc)
	 * @see selection.Selection#selection(geneticAlgoProcess.Population, geneticAlgoProcess.FitnessModel)
	 */
	@Override
public FitnessModel selection(Population population, FitnessModel fitnessModel){ //Select the most fittest individual
	    	fitnessModel.fittest = population.getFittest();

    //Select the second most fittest individual
	fitnessModel.secondFittest = population.getSecondFittest();
    
    return fitnessModel; 
		
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Rank Selection";
	}
	}


