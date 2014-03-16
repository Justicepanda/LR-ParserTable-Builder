package dfa;

import generator.Rule;
import scanner.Token;

public class Production
{
	int position; //Calculated to be before the token at position, except for when it is after the last token (ex. E -> E.xfs, position = 1)
	Token leftToken;
	Token[] tokens;
	
	public Production(int position, Rule rule)
	{
		this.position = position;
		this.leftToken = rule.getLeftToken();
		this.tokens = rule.getTokens();
	}
	
	public String toString()
	{
		String returnString = leftToken.getValue() + " -> ";
		for(int i = 0; i < tokens.length; i++)
		{
			if(tokens.length > 0)
			{
				if(i == position)
				{
					returnString += " . " + tokens[i].getValue();
				}
				else
				{
					returnString += " " + tokens[i].getValue();
				}
			}
		}
		
		if(position > tokens.length)
			returnString += " . ";
		
		return returnString;
	}
}
