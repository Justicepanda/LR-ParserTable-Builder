package dfa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DfaTransition 
{
	private String acceptedInput;
	private DfaState destinationState;
	
	public DfaTransition(String acceptedInput, DfaState destinationState)
	{
		this.acceptedInput = acceptedInput;
		this.destinationState = destinationState;
	}
	
	public boolean inputAccepted(String input)
	{
		return Pattern.compile(this.acceptedInput).matcher(input).matches();
	}
	
	public DfaState getDestState()
	{
		return destinationState;
	}
}
