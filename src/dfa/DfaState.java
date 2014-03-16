package dfa;

import java.util.ArrayList;

public class DfaState 
{
	private int stateNumber;
	private ArrayList<DfaTransition> transitions;
	private ArrayList<Production> productions;
	
	public DfaState(boolean isAcceptState, int stateNumber)
	{
		isAcceptState = false;
		this.stateNumber = stateNumber;
		transitions = new ArrayList<DfaTransition>();
		productions = new ArrayList<Production>();
	}
	
	public ArrayList<DfaTransition> getTransitions()
	{
		return transitions;
	}
	
	public ArrayList<Production> getProductions()
	{
		return productions;
	}
}
