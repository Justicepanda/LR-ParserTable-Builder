package scanner;

import generator.Rule;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class Scanner 
{
	public Rule[] Scan(String fileName)
	{
		try
		{
			InputStream inputStream = getClass().getClassLoader().getResourceAsStream(fileName);
			BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
			ArrayList<String> tempLines = new ArrayList<String>();
			
			String line = "";
			while((line = reader.readLine()) != null)
			{
				tempLines.add(line);
			}
			reader.close();
			
			String[] lines = tempLines.toArray(new String[tempLines.size()]);
			Rule[] rules = new Rule[lines.length];
			
			if(lines != null)
			{
				for(int i = 0; i < rules.length; i++)
				{
					rules[i] = new Rule(lines[i]);
				}
			}
			
			return rules;
		}
		catch(IOException e)
		{
			System.err.print(e.toString());
			return null;
		}
	}
}
