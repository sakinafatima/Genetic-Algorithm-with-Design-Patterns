This file describes how to run this project and also what the output shows:
First you should be in the src folder of this project and then  you need to compile each class inside their respective package folder.
To run you need to use the package syntax as below:  
 runner.Runner


Compile statements:
src>javac -d ..\bin .\geneticAlgoProcess\*.java
src>javac -d ..\bin .\crossover\*.java
src>javac -d ..\bin .\mutation\*.java
src>javac -d ..\bin .\selection\*.java
src>javac -d ..\bin .\strategy\*.java
src>javac -d ..\bin .\factories\*.java
src>javac -d ..\bin .\ runner\Runner.java

Run Statement:

src>java -cp ..\bin  runner.Runner

Output Description:
First of all program will choose a strategy randomly and a factory randomly as well to further perform the process.
After that user will be asked to give his/her choice about selection, mutation and crossover. 

Here based on this choice, first of all an initial population is generated and from there, indivials are selected by the choosen selection method, after that selected crossover and mutation technique (in some cases) is applied on that. 
The search will keep on iterating untill the target string is generated. 
At the end of the output, Selection Method, Mutation Method, CrossOver Method, Strategy Name and factory name will be shown as well along with the generation in which the solution is found and the target string.
Output:

Genetic Algoritm Process: 
Choose selection menthod, Rank or Tournament ?
Tournament
Choose your CrossOverMethod: one or two ?
two
Choose your Mutation Method: boundary or flip ?
flip
Generation:0 Fittest:4
Generation:1 Fittest:4
Generation:2 Fittest:4
Generation:3 Fittest:4
Generation:4 Fittest:4
Generation:5 Fittest:4
Generation:6 Fittest:4
Generation:7 Fittest:4
Generation:8 Fittest:4
Generation:9 Fittest:4
Generation:10 Fittest:5

Solution found in generation 10 with Selection Method: Tournament Selection ,CrossOver Method: Two-Point CrossOver and Mutation Method: Flip Bit Mutation
Fitness: 5
Genes: 11111
 Above execution is done by strategy: Strategy B Factory: Factory 2

If the iteration is more 10000, The search will stop and display an error message i.e. "Solution not found in defined time, so cannot execute further. Run Again!" to restart the process.


