package selection;

import geneticAlgoProcess.FitnessModel;
import geneticAlgoProcess.Population;

// TODO: Auto-generated Javadoc
/**
 * The Class Selection_tournament.
 * 
 *  @author SakinaFatima
 */
public class Selection_tournament implements Selection {

	/* (non-Javadoc)
	 * @see selection.Selection#selection(geneticAlgoProcess.Population, geneticAlgoProcess.FitnessModel)
	 */
	@Override
	  
  public FitnessModel selection(Population population, FitnessModel fitnessModel) {

      
  	fitnessModel.fittest = population.tournamentPop();

      
  	fitnessModel.secondFittest = population.tournamentPop();
      
      return fitnessModel;
     
  }
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Tournament Selection";
	}
}
