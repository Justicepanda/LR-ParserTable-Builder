package main;

import scanner.Scanner;
import generator.TableGenerator;
import generator.Rule;

public class Main
{
	public static void main(String[] args)
	{
		Rule[] rules = new Scanner().Scan(args[0]);
		
		
		if(Preferences.debugMode())
		{
			for(int i = 0; i < rules.length; i++)
			{
				System.out.println(rules[i].toString());
			}
		}
		
		TableGenerator generator = new TableGenerator(rules);
		if(generator.generateTable(args[1]))
		{
			System.out.println("Table Generated to file " + args[1]);
		}
	}
}
