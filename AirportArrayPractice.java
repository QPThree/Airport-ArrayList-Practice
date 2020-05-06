import java.util.*;
import java.util.Scanner;
import java.util.ArrayList; 


public class AirportArrayPractice {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create scanner
		Scanner scanner = new Scanner(System.in);
		//create array
		ArrayList<Airports> AirportList = new ArrayList<Airports>(5); 
		while (true) {
			//1. main menu
			System.out.println("Main Menu");
			System.out.println("0: Add airport\n1. Look up airport\n2. Show All\n9. Exit");
			//2. user makes choice
			int choice = scanner.nextInt();
		
			if(choice == 0) {
				//System.out.print("This option will prompt user for new info");
				System.out.println("Where is the airport located?");
					String name = scanner.next();
				System.out.println("How many airlines operate out of the new location?");
					int airlines = scanner.nextInt();
					
				System.out.println("How many flights are offered out of the city?");
					int flights = scanner.nextInt();
				System.out.println("What is the new airports code?  This is typically 3 letters to ID the airport.");
					String code = scanner.next();
						Airports x = new Airports(name, airlines, flights, code);
							AirportList.add(x);
								System.out.println("Airport has been added");
			}	
		else if (choice == 1) {
			
			System.out.println("Which airport would you like to look up?");
				int i = scanner.nextInt();
					
				
				showInfo(AirportList.get(i));
		}
		else if (choice == 2) {
			for (int i= 0; i<AirportList.size(); i++) {
				showInfo(AirportList.get(i));
			}
		}else if (choice == 9) {
			System.out.println("Goodbye. Go Pats");
			break;
			}
		
		}
	}
	
	//Methods
	private static void showInfo(Airports airports) {
		
		System.out.println("City: "+airports.city+" Airlines: "+airports.airlines+" Flights: "+airports.flights+" Code: "+airports.code);
		
		}
			//add airports
	private static void addAirport() {
		//create local scanner
		Scanner scanner = new Scanner(System.in);
		//user is prompted for all of new airport's info
		System.out.println("Where is the airport located?");
			String name = scanner.next();
		System.out.println("How many airlines operate out of the new location?");
			int airlines = scanner.nextInt();
		System.out.println("How many flights are offered out of the city?");
			int flights = scanner.nextInt();
		System.out.println("What is the new airports code?  This is typically 3 letters to ID the airport.");
			String code = scanner.next();
		}
	

}

