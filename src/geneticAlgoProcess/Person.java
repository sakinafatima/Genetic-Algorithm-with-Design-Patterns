package geneticAlgoProcess;

import java.util.Random;

// TODO: Auto-generated Javadoc
/**
 * The Class Person.
 * 
 *  @author SakinaFatima
 */
public class Person {
	
	/** The fitness. */
	int fitness = 0;
    
    /** The genes. */
    public int[] genes = new int[5];
    
    /** The gene length. */
    public int geneLength = 5;
   
   /** The genes 1. */
   String genes1;

    /**
     * Instantiates a new person.
     */
    public Person() {
        Random rand = new Random();
        for (int i = 0; i < genes.length; i++)//Setting five random digits from 0 to one for an individual person's genes.
        {
            genes[i] = Math.abs(rand.nextInt() % 2);
            genes1+=genes[i];
        } 
        fitness = 0;
    }


    /**
     * Check fitness.
     */
    //Calculate fitness [1]
    public void checkFitness() {

        fitness = 0;
        for (int i = 0; i < 5; i++) {
            if (genes[i] == 1) {
                ++fitness;// the target gene is 11111 so here genes element is compared with this target string that whether it is 1 or not.
            }
        }
    }

}
//References: [1] https://towardsdatascience.com/introduction-to-genetic-algorithms-including-example-code-e396e98d8bf3

