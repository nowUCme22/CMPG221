/**
@auther Marne Vermaak 48073253
@version cmpg221 assignment 1
*/

public class Driver extends F1Teams
{
	//variables
	String driverName="";
	int carreerWins=0, consWins = 0;
	int carreerRaces=0, consRaces =0;
	
	//constructor
	public Driver()
	{
		this("","","", "", 0, 0, 0, 0);
	}
	
	//constructor
	public Driver(String teamName, String country, String budget, String driverName, int carreerWins, int carreerRaces, int consWins, int consRaces)
	{
		super(teamName, country, budget);
		this.driverName = driverName;
		this.carreerWins = carreerWins;
		this.carreerRaces = carreerRaces;
		this.consWins = consWins;
		this.consRaces = consRaces;
	}
	
	//set driverName
	private void setDriverName(String driverName)
	{
		this.driverName = driverName;
	}
	
	//set carreerWins
	private void setCarreerWins(int carreerWins)
	{
		this.carreerWins = carreerWins;
	}
	
	//set carreerRaces
	private void setCarreerRaces(int carreerRaces)
	{
		this.carreerRaces = carreerRaces;
	}
	
	//set consWins
	private void setConsWins(int consWins)
	{
		this.consWins = consWins;
	}
	
	//set consRaces
	private void setConsRaces(int consRaces)
	{
		this.consRaces = consRaces;
	}
	
	
	
	//get driverName
	public String getDriverName()
	{
		return driverName;
	}
	
	//get carreerWins
	private int getCarreerWins()
	{
		return carreerWins;
	}
	
	//get carreerRaces
	private int getCarreerRaces()
	{
		return carreerRaces;
	}
	
	//get consWins
	private int getConsWins()
	{
		return consWins;
	}
	
	//get consRaces
	private int getConsRaces()
	{
		return consRaces;
	}
	
	
	
	//abstract method -- show the career stats -- wins/races
	@Override
	public String getCarreerStats()
	{
		return String.format("Win percentage for career: %.2f%%\nWin percentage for constructor/season: %.2f%%",
		((double) getCarreerWins() / getCarreerRaces()) * 100, ((double) getConsWins() / getConsRaces()) * 100);
	}
	
	@Override
	public String toString()
	{
		return super.toString() + "\nDriver: " + getDriverName()  + "\nCareer races: " + getCarreerRaces() + "\nCareer wins: " + getCarreerWins() + "\nRaces for Constructor/season: " + getConsRaces() 
		+ "\nWins for Constructor/season: " + getConsWins();
	}
}