/**
@auther Marne Vermaak 48073253
@version cmpg221 assignment 1
*/

public class Constructor extends F1Teams
{
	//variables
	String chassisName="";
	int wins;
	int races;
	
	//constructor
	public Constructor()
	{
		this("","","", "", 0, 0);
	}
	
	//constructor
	public Constructor(String teamName, String country, String budget, String chassisName, int wins, int races)
	{
		super(teamName, country, budget);
		this.chassisName = chassisName;
		this.wins = wins;
		this.races = races;
	}
	
	//set chassisName
	private void setChassisName(String chassisName)
	{
		this.chassisName = chassisName;
	}
	
	//set wins
	private void setWins(int wins)
	{
		this.wins = wins;
	}
	
	//set races
	private void setRaces(int races)
	{
		this.races = races;
	}
	
	//get chassis name
	private String getChassisName()
	{
		return chassisName;
	}
	
	//get wins
	private int getWins()
	{
		return wins;
	}
	
	//get races
	private int getRaces()
	{
		return races;
	}
	
	//abstract method -- show the career stats -- wins/races
	@Override
	public String getCarreerStats()
	{
		return String.format("Win percentage: %.2f%%", ((double) getWins() / getRaces()) * 100);
	}
	
	@Override
	public String toString()
	{
		return super.toString() + "\nChassis: " + getChassisName() + "\nWins: " + getWins() + "\nRaces: " + getRaces();
	}
}