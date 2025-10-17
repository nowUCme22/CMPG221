/**
@auther Marne Vermaak 48073253
@version cmpg221 assignment 1
*/

public abstract class F1Teams
{
	//variables
	String teamName="", country="", budget="";
	
	//constructor
	public F1Teams()
	{
		this("","","");
	}
	
	//constructor
	public F1Teams(String teamName, String country, String budget)
	{
		this.teamName = teamName;
		this.country = country;
		this.budget = budget;
	}
	
	//set the team name
	private void setTeamName(String teamName)
	{
		this.teamName = teamName;
	}
	
	//set the country
	private void setCountry(String country)
	{
		this.country = country;
	}
	
	//set the budget
	private void setBudget(String budget)
	{
		this.budget = budget;
	}
	
	//get the team name
	public String getTeamName()
	{
		return teamName;
	}
	
	//get the country
	private String getCountry()
	{
		return country;
	}
	
	//get the budget
	private String getBudget()
	{
		return budget;
	}
	
	//abstract method to display the info
	public abstract String getCarreerStats();
	
	//toString method
	@Override
	public String toString()
	{
		return "Team: " + getTeamName() + "(" + getCountry() + ")" + "\nBudget: $" + getBudget() + " million";
	}
}