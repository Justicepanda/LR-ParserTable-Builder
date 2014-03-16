package generator;

import java.util.ArrayList;

public class ParserTable 
{
	private Action[][] actionTable;
	private int[][] goToTable;
	private ArrayList<String> terminals;
	private ArrayList<String> nonTerminals;
	
	public ParserTable(int numOfStates, ArrayList<String> terms, ArrayList<String> nonTerms)
	{
		actionTable = new Action[numOfStates][terms.size()];
		goToTable = new int[numOfStates][nonTerms.size()];
		terminals = terms;
		nonTerminals = nonTerms;
	}
}
