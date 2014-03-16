package dfa;

import java.util.ArrayList;
import java.util.HashMap;

import main.Preferences;
import scanner.Token;
import scanner.TokenType;
import generator.Rule;

public class Dfa
{
	private ArrayList<Dfa> states;
	private HashMap<Token, ArrayList<Production>> productionMap;
	
	public Dfa(Rule[] rules)
	{
		productionMap = new HashMap<Token, ArrayList<Production>>();
		
		//Calculate all of the possible productions
		for(int i = 0; i < rules.length; i++)
		{
			ArrayList<Production> productions = new ArrayList<Production>();
			if(rules[i].getTokens() != null)
			{	
				for(int pos = 0; pos < rules[i].getTokens().length; pos++)
				{
					productions.add(new Production(pos, rules[i]));
				}
				productions.add(new Production(rules[i].getTokens().length + 1, rules[i]));
				productionMap.put(rules[i].getLeftToken(), productions);
			}
		}
		
		if(Preferences.debugMode())
		{
			for(int i = 0; i < productionMap.size(); i++)
			{
				for(Token t: productionMap.keySet())
				{
					ArrayList<Production> p = productionMap.get(t);
					System.out.println(t.getValue() + "");
					for(int j = 0; j < p.size(); j++)
					{
						System.out.println("| " + p.get(j).toString());
					}
					System.out.println("---\n");
				}
			}
		}
		
		//Build dfa based on those productions
		
	}
}
