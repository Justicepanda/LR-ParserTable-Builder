package generator;

import dfa.*;

public class TableGenerator 
{
	Rule[] rules;
	
	public TableGenerator(Rule[] rules)
	{
		this.rules = rules;
	}
	
	public boolean generateTable(String fileName)
	{
		//First create the LR(1) DFA
		Dfa stateDiagram = new Dfa(rules);
		
		return true;
	}
}
