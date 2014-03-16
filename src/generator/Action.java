package generator;

public class Action 
{
	private ActionType type;
	private int state;
	
	public Action(int state, ActionType type)
	{
		this.state = state;
		this.type = type;
	}
	
	public ActionType getType()
	{
		return type;
	}
	
	public int getState()
	{
		return state;
	}
}
