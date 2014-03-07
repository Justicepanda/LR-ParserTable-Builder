package generator;

import scanner.Token;

public class Rule 
{
	private Token leftToken;
	private Token[] rightTokens;
	
	public Rule(String rule)
	{
		String[] tempTokens = rule.split(" ");
		leftToken = new Token(Token.getTokenType(tempTokens[0]), tempTokens[0]);
		
		if(tempTokens.length > 2)
		{
			rightTokens = new Token[tempTokens.length - 2];
			for(int i = 0; i < rightTokens.length; i++)
			{
				rightTokens[i] = new Token(Token.getTokenType(tempTokens[i + 2]), tempTokens[i + 2]);
			}
		}
		
		if(tempTokens.length == 2)
		{
			rightTokens = new Token[tempTokens.length];
			rightTokens[0] = new Token(Token.getTokenType(tempTokens[0]), tempTokens[0]);
		}
		
		if(tempTokens.length == 1)
		{
			rightTokens = null;
		}
	}
	
	public String toString()
	{
		String toString = leftToken.getValue();

		if(rightTokens != null)
		{
			for(int i = 0; i < rightTokens.length; i++)
			{
				toString += " " + rightTokens[i].getValue();
			}
		}
		
		return toString;
	}
	
	public Token[] getTokens()
	{
		return rightTokens;
	}
	
	public Token getLeftToken()
	{
		return leftToken;
	}
}
