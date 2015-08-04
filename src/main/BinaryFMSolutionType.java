package main;
//  BinarySolutionType.java
//
//  Author:
//       Antonio J. Nebro <antonio@lcc.uma.es>
//       Juan J. Durillo <durillo@lcc.uma.es>
// 
//  Copyright (c) 2011 Antonio J. Nebro, Juan J. Durillo
//
//  This program is free software: you can redistribute it and/or modify
//  it under the terms of the GNU Lesser General Public License as published by
//  the Free Software Foundation, either version 3 of the License, or
//  (at your option) any later version.
//
//  This program is distributed in the hope that it will be useful,
//  but WITHOUT ANY WARRANTY; without even the implied warranty of
//  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//  GNU Lesser General Public License for more details.
// 
//  You should have received a copy of the GNU Lesser General Public License
//  along with this program.  If not, see <http://www.gnu.org/licenses/>.



import jmetal.core.Problem;
import jmetal.core.SolutionType;
import jmetal.core.Variable;
import jmetal.encodings.variable.Binary;

/**
 * Class representing the solution type of solutions composed of Binary 
 * variables
 */
public class BinaryFMSolutionType extends SolutionType {

	/**
	 * Constructor
	 * @param problem
	 * @throws ClassNotFoundException 
	 */
	public BinaryFMSolutionType(FMProblem problem) throws ClassNotFoundException {
		super(problem) ;
	} // Constructor
	
	/**
	 * Creates the variables of the solution
	 * @param decisionVariables
	 */
	public Variable[] createVariables() {
		Variable[]  variables = new Variable[problem_.getNumberOfVariables()];
		
		ParsedFM pfm = ((FMProblem) problem_).getParsedFM();
		
	    for (int var = 0; var < problem_.getNumberOfVariables(); var++)
	    	variables[var] = new Binary(pfm.getInitialString()); 
	    //System.out.println(variables);
    
    return variables ;
	} // createVariables
} // BinarySolutionType
