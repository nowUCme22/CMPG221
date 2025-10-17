/**
@auther Marne Vermaak 48073253
@version cmpg221 assignment 1
*/

public class TestTeams
{
	//constant variable
	private static final int MAX_NO_TEAM = 20;
	
	
	public static void main(String args[])
	{
		//variables
		//int numOfTeams = 0;
		
		// array of the superclass
		F1Teams teams[] = new F1Teams[MAX_NO_TEAM];
		
		//input team values
		//input the constructor subclass values
		teams[0] = new Constructor("McLaren", "United Kingdom" ,"135" , "MCL39", 9, 12);
		teams[1] = new Constructor("Ferrari", "Italy" ,"135" , "--", 0, 12);
		teams[2] = new Constructor("Mercedes", "United Kingdom" ,"135" , "--", 1, 12);
		teams[3] = new Constructor("Red Bull Racing", "Austria" ,"135" , "RBPT", 2, 12);
		teams[4] = new Constructor("Williams", "United Kingdom" ,"135" , "--", 0, 12);
		teams[5] = new Constructor("Kick Sauber", "Switzerland" ,"135" , "--", 0, 12);
		teams[6] = new Constructor("Racing bulls", "United Kingdom" ,"135" , "VCARB 02", 0, 12);
		teams[7] = new Constructor("Aston Martin", "USA" ,"135" , "--", 0, 12);
		teams[8] = new Constructor("Haas", "United Kingdom" ,"135" , "--", 0, 12);
		teams[9] = new Constructor("Alpine", "France" ,"135" , "--", 0, 12);
		
		//enter the driver subclass values
		teams[10] = new Driver("McLaren", "United Kingdom" ,"135" , "Oscar Piastri", 7,58,5,12);
		teams[11] = new Driver("Ferrari", "Italy" ,"135" , "Charles Leclerc", 8,161,0,12);
		teams[12] = new Driver("Mercedes", "United Kingdom" ,"135" , "George Russell", 4,140,1,12);
		teams[13] = new Driver("Red Bull Racing", "Austria" ,"135" , "Max Verstappen", 65,221,2,12);
		teams[14] = new Driver("Williams", "United Kingdom" ,"135" , "Alex Albon", 0,116,0,12);
		teams[15] = new Driver("Kick Sauber", "Switzerland" ,"135" , "Nico Hulkenberg", 0,239,0,12);
		teams[16] = new Driver("Racing bulls", "United Kingdom" ,"135" , "Isack Hadjar", 0,12,0,12);
		teams[17] = new Driver("Aston Martin", "USA" ,"135" , "Lance Stroll", 0,178,0,12);
		teams[18] = new Driver("Haas", "United Kingdom" ,"135" , "Esteban Ocon", 1,168,0,12);
		teams[19] = new Driver("Alpine", "France" ,"135" , "Pierre Gasly", 1,165,0,12);
		
		//display all info
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("DISPLAY ALL DATA");
		System.out.println("------------------------------------------------------------");
		for (int i=0 ; i < MAX_NO_TEAM ; i++)
		{
			System.out.println(teams[i]);
			System.out.println("------------------------------------------------------------");
		}
		
		//display constructor stats
		System.out.println();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("CONSTRUCTOR STATS");
		System.out.println("------------------------------------------------------------");
		for (int i=0 ; i < MAX_NO_TEAM; i++)
		{
			if (teams[i] instanceof Constructor)
			{
				Constructor c = (Constructor)teams[i];
				System.out.println(c.getTeamName() + "\nStats: \n" + c.getCarreerStats());
				System.out.println("------------------------------------------------------------");
			}
		}
		
		//display drivers stats
		System.out.println();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("DRIVER STATS");
		System.out.println("------------------------------------------------------------");
		for (int i=0 ; i < MAX_NO_TEAM; i++)
		{
			if (teams[i] instanceof Driver)
			{
				Driver d = (Driver)teams[i];
				System.out.println(d.getDriverName() + "\nStats: \n" + d.getCarreerStats());
				System.out.println("------------------------------------------------------------");
			}
		}
			
		
	}
}