/**
 * This is Runner class of my Genetic Algorithm. In this class, I have implemented Abstract factory pattern.
 * I have chosen Abstract factory pattern because it makes a class independent of how its objects are created 
 * (which concrete classes are instantiated) and class can be configured with a factory object, which it uses 
 * to create objects, and even more, the factory object can be exchanged at run-time.
 * Here, I have created factories of factory. i.e Factory1 and Factory2 of GeneticFactory. Object of FactoryOne
 * and FactoryTwo decides are selected at run time. And the strategy through which these factories are created are also 
 * selected at run time  through Strategy Pattern by Startegy class Instance i.e. strategy_selected  .
 *  
 * @author SakinaFatima
 * 
*/
package runner;
import java.util.Scanner;

import factories.GA_AbstractFactory;
import strategy.Strategy;
import strategy.StrategySelection;
// TODO: Auto-generated Javadoc

/**
 * The Class Runner.
 * 
 *  @author SakinaFatima
 */
public class Runner{


/** The strategy selected. */
public static StrategySelection strategy_selected=null;// Strategy instance to first get the strategy randomly and then to get any factory at run time. 
//I have used Math.Random to select the factory and the strategy. Client can give his input at runtime to select a factory or strategy as well.

/**
 * Sets the strategy.
 *
 * @return the strategy selection
 */
public static StrategySelection setStrategy(){
strategy_selected= Strategy.getSelection();
return strategy_selected;
}

/**
 * The main method.
 *
 * @param args the arguments
 */
@SuppressWarnings("resource")

public static void main(String[] args){
	    strategy_selected=Runner.setStrategy();// to set the strategy at run time(changing behavior at run time: reason to use strategy method)
	    Scanner input = new Scanner(System.in);
        System.out.println("Genetic Algoritm Process: \nChoose selection menthod, Rank or Tournament ?");
        String n = input.nextLine();
        System.out.println("Choose your CrossOverMethod: one or two ?");
        String n1 = input.nextLine();
	 	System.out.println("Choose your Mutation Method: boundary or flip ?");
	 	String n2 = input.nextLine();
	 	GA_AbstractFactory factory_selected=strategy_selected.getfactory();
	    factory_selected.doProcess(n,n1,n2, factory_selected);// Client's input about selection, Mutation, CrossOver along with run time selected factory is passed to Abstract class to continue the process.
	    System.out.println(" Above execution is done by strategy: " + strategy_selected.toString()+ " Factory: " + factory_selected.toString());
}

}
