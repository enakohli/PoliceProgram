/*
 * Project: Assistance at the Police Station
 * Programmer Name: Ena Kohli
 * Date: January 10th, 2019
 * Purpose: Create a program that assists the police in filing a complaint, 
 recording a missing persons report, keeping track of past and present criminal records, 
 and looking at community outreach opportunities
 */

import java.util.Scanner;
import java.text.NumberFormat;
public class Police {

	public static void main(String[] args) {
		//Initiate Scanner
		Scanner input = new Scanner (System.in); 
		//declare variables
		int mainMenu = 0;
		String name = "";
		//main loop for the main menu
		System.out.println("Welcome to the Police Station\n\nWe are here to address any of your needs\n");
		//the user is asked to enter their name
		System.out.println("\nPlease enter your name: ");
		name = input.next();
		do
		{
			//introduction - the user is asked to select one of the options in the main menu 
			System.out.println("\nPlease choose an option: \n\n1. File a complaint\n2. Missing person's report\n3. Criminal record archives\n4. Community Outreach Program\n5. Exit");
			mainMenu = input.nextInt();
			//error checking for the main menu
			while (mainMenu != 1 && mainMenu != 2 && mainMenu != 3 && mainMenu != 4 && mainMenu != 5)
			{
				System.out.println("\nInvalid Input. Please try again\nPlease choose an option:\n\n1. File a complaint\n2. Missing person's report\n3. Criminal record archives\n4. Community Outreach Program\n5. Exit");
				mainMenu = input.nextInt();
			}
			//a switch case for the main menu options
			switch (mainMenu)
			{
				case 1:
					//first method
					complaint(name);
					break;
				case 2:
					//second method
					missing(name);
					break;
				case 3:
					//third method
					criminal(name);
					break;
				case 4:
					//fourth method
					community(name);
					break;
				case 5:
					//fifth method
					exit(name);
					break;
			}		
		}while (mainMenu != 5);		
	}
	//first method - where the user can file a complaint
	public static void complaint (String name)
	{
		//Initiate Scanner
		Scanner input = new Scanner (System.in); 
		//arrays
		String officer [] = {"Officer Alam", "Officer Deoram", "Officer Baker", "Officer Ritchie"};
		String item [] = {"Money", "Jewels", "Artifacts"};
		String worth [] = {"$0 to $99 999", "$100 000 to $999 999", "more than $1 000 000"};
		//declare variables
		int officerChoice = 0, crime = 0, itemChoice = 0, worthChoice = 0, type = 0, q1 = 0, q2 = 0;
		String stolenItem = "", stolenWorth = "", q3 = "", time = "", murderName = "";
		//introduction to filing a complaint
		System.out.println("\n"+ name + ", here you can file a complaint\nPlease choose the officer you would like to meet with: \n\n1. " + officer [0] + "\n2. " + officer [1] + "\n3. " + officer [2] + "\n4. " + officer [3]);
		officerChoice = input.nextInt();
		//error checking for officer choices
		while (officerChoice != 1 && officerChoice != 2 && officerChoice != 3 && officerChoice != 4)
		{
			System.out.println("\nInvalid Input. Please try again\n" + name + ", here you can file a complaint\nPlease choose the officer you would like to meet with: \n\n1. " + officer [0] + "\n2. " + officer [1] + "\n3. " + officer [2] + "\n4. " + officer [3]);
			officerChoice = input.nextInt();
		}
		//switch case for officers
		switch (officerChoice)
		{
			case 1: 
				System.out.println("You have booked an appointment with " + officer[0] + " to file a complaint.");
				break;			
			case 2: 
				System.out.println("You have booked an appointment with " + officer[1] + " to file a complaint.");
				break;			
			case 3: 
				System.out.println("You have booked an appointment with " + officer[2] + " to file a complaint.");
				break;
			case 4: 
				System.out.println("You have booked an appointment with " + officer[3] + " to file a complaint.");
				break;
		}
		//the user is asked what kind of criminal offense they are filing a complaint about
		System.out.println("\nPlease select the type of criminal offense you would like to record:\n\n1. Robbery\n2. Harassment\n3. Murder\n");
		crime = input.nextInt();
		//error checking for the crime
		while (crime != 1 && crime != 2 && crime != 3)
		{
			System.out.println("Invalid Input. Please try again\nPlease select the type of criminal offense you would like to record:\n1. Robbery\n2. Harassment\n3. Murder\n");
			crime = input.nextInt();
		}
		//switch case for the crime chosen
		switch (crime)
		{
			case 1:
				//user is asked what item is stolen
				System.out.println("\nYou would like to file a complaint for a robbery.\nPlease select what item was stolen:\n\n1. Money\n2. Jewels\n3. Artifacts\n");
				itemChoice = input.nextInt();
				//error checking for item chosen
				while (itemChoice != 1 && itemChoice != 2 && itemChoice != 3)
				{
					System.out.println("Invalid Input. Please try again\nYou would like to file a complaint for a robbery.\nPlease select what item was stolen:\n\n1. Money\n2. Jewels\n3. Artifacts\n");
					itemChoice = input.nextInt();
				}
				//switch case for item choice
				switch (itemChoice)
				{
					case 1:
						stolenItem = item[0];
						break;
					case 2:
						stolenItem = item[1];
						break;
					case 3:
						stolenItem = item[2];
						break;					
				}		
				//user is asked to enter approximate value of stolen item
				System.out.println("\nPlease select the approximate value of the item stolen:\n\n1. $0 to $99 999\n2. $100 000 to $999 999\n3. more than $1 000 000\n");
				worthChoice = input.nextInt();
				//error checking for value
				while (worthChoice != 1 && worthChoice != 2 && worthChoice != 3)
				{
					System.out.println("Invalid Input. Please try again\nPlease select the approximate value of the item stolen:\n\n1. $0 to $99 999\n2. $100 000 to $999 999\n3. more than $1 000 000\n");
					worthChoice = input.nextInt();
				}
				//switch case for the value
				switch (worthChoice)
				{
					case 1:
						stolenWorth = worth [0];
						break;
					case 2:
						stolenWorth = worth [1];
						break;
					case 3:
						stolenWorth = worth [2];
						break;
				}
				//displays item stolen and worth
				System.out.println("\nItem Stolen: " + stolenItem + "\nWorth: " + stolenWorth +"\nThank you " + name + " for filing a complaint. We will make sure to address it soon\n");
				break;
			case 2:
				//user is asked what kind of harassment they face
				System.out.println(name + ", you would like to file a complaint for harassment. Please indicate what type of harassment you would like to report:\n\n1. Sexual\n2. Physical\n3. Personal\n");
				type = input.nextInt();
				//error checking for type of harassment
				while (type != 1 && type != 2 && type != 3)
				{
					System.out.println("Invalid Input. Please try again\n" + name + ", you would like to file a complaint for harassment. Please indicate what type of harassment you would like to report:\n\n1. Sexual\n2. Physical\n3. Personal\n");
					type = input.nextInt();
				}
				//switch case for harassment types
				switch (type)
				{
					case 1:
						//sexual harassment
						System.out.println("You have filed a complaint for experiencing sexual harassment\nSexual harassment is behavior characterized by the making of unwelcome and inappropriate sexual remarks in a workplace\n");
						break;
					case 2:
						//physical harassment
						System.out.println("You have filed a complaint for experiencing physical harassment\nPhysical harassment is behaviour characterized by unwanted touching in a workplace\n");
						break;
					case 3:
						//personal harassment
						System.out.println("You have filed a complaint for experiencing personal harassment\nPersonal harassment is behaviour characterized by bullying another person is any way in a workplace\n");
						break;
				}
				//displays a message after complaint is filed
				System.out.println("\nThank you " + name + " for filing a complaint. We will make sure to address it soon\n");
				break;
			case 3:
				//displays a special message if there is a complaint about a murder
				System.out.println("\n******************** MURDER ALERT ********************\nYou would like to file a complaint for a murder.\nBefore you begin to start telling us about a murder you have witnessed, we guarantee you that you will be under the eye witness protection program\nThis means you can openly share anything you would like with us, and we guarantee that you will be safe\nThe way this will work is we will ask you a series of questions about the murder and you will answer by choosing an option\n");
				//asked who got murdered
				System.out.println("\nQuestion #1: Who got murdered?\n\n1. A family member or friend\n2. A neighbour\n3. A stranger");
				q1 = input.nextInt();
				//error checking for question 1
				while (q1 != 1 && q1 != 2 && q1 != 3)
				{
					System.out.println("Invalid Input. Please try again\nQuestion #1: Who got murdered?\n\n1. A family member or friend\n2. A neighbour\n3. A stranger");
					q1 = input.nextInt();
				}
				//switch case for an individual who got murdered
				switch (q1)
				{
					case 1:
						//asked to enter name of murdered victim
						System.out.println(name + ", we are sorry for your loss\nPlease enter the name of the person murdered:");
						murderName = input.next();
						break;
					case 2:
						//asked to enter name of murdered victim
						System.out.println(name + ", we are sorry you had to witness this\nPlease enter the name of the person murdered:");
						murderName = input.next();
						break;
					case 3:
						System.out.println(name + ", we are sorry you had to witness this");
						break;
				}
				//the user is asked how long ago the victim was murdered
				System.out.println("\nQuestion #2: How long ago were they murdered?\n\n1. Longer than a week ago\n2. A week ago to yesterday\n3. Today");
				q2 = input.nextInt();
				//error checking for question 2
				while (q2 != 1 && q2 != 2 && q2 != 3)
				{
					System.out.println("Invalid Input. Please try again\nQuestion #2: How long ago were they murdered?\n\n1. Longer than a week ago\n2. A week ago to yesterday\n3. Today");
					q2 = input.nextInt();
				}
				//switch case for question 2
				switch (q2)
				{
					case 1:
						time = "more than a week ago";
						System.out.println("You witnessed this murder " + time);
						break;
					case 2:
						time = "within the last week";
						System.out.println("You witnessed this murder " + time);
						break;
					case 3:
						time = "today";
						System.out.println("You witnessed this murder " + time);
						break;
				}
				//the user is asked if they know where the murder took place
				System.out.println("\nQuestion #3: Do you know where this murder took place (Y or N)?");
				q3 = input.next();
				q3 = q3.toUpperCase();
				//error checking for question 3
				while (!q3.equals("Y")&& !q3.equals("N"))
				{
					System.out.println("Invalid Input. Please try again\nQuestion #3: Do you know where this murder took place (Y or N)?");
					q3 = input.next();
					q3 = q3.toUpperCase();
				}
				//switch case for question 3
				switch (q3)
				{
				case "Y":
					//if the user knows the location, they take them there and a story is displayed on what happens
					System.out.println("\nPlease take us to that location immediately.\n******************** CALL FOR BACKUP ********************\nEveryone arrives at the scene of the murder.\nThere is a dead body lying right in the centre of the room.\nThe person seems to have been murdered " + time +".\nSuddenly, a sound comes from a closed door. The police open the door, and there is a man who is holding a knife in his hand. He pleads guilty");
					//Miranda warning
					System.out.println("\n\n******************** MIRANDA WARNING ********************\nYou are under arrest for the murder of " + murderName +".\nYou have the right to remain silent. Anything you say can be used against you in court.\nYou have the right to talk to a lawyer for advice before we ask you any questions. You have the right to have a lawyer with you during questioning.\nIf you cannot afford a lawyer, one will be appointed for you before any questioning if you wish. \nIf you decide to answer questions without a lawyer present, you have the right to stop answering at any time");
					break;
				case "N":
					//if the user does not know they location, they are assured that the crime will be solved
					System.out.println("Okay, thank you " + name + " for all your help, we will try to solve this case as soon as possible and we will get back to you. ");
					break;
				}
				//a special message is displayed
				System.out.println("\nThank you so much " + name + " for assisting us with this case. You have greatly helped defend the law\n");
				break;
		}
	}
	//second method - used to file a missing persons report
	public static void missing (String name)
	{
		//initiate scanner
		Scanner input = new Scanner (System.in);
		//declare variables
		String missingName, place = "", hair = "", eyes = "", clothes = "", relation = "", amber = "";
		int age = 0, time = 0;
		double weight = 0, height = 0;
		//introduction
		System.out.println("\nHere you can file a missing person's report\n" + name + ", you will be asked a series of questions about the individual you are filing a report about\nYou will answer the questions, and we will create a report for you immediately\nWe will try our level best to find this individual\nPlease enter the name of the individual who is missing: ");
		missingName = input.next();
		//age of missing person
		System.out.println("How old is the missing person?\n");
		//if the person is a child, an amber alert is released
		age = input.nextInt();
		if (age <= 18)
		{
			amber = "YES";
		}
		else 
		{
			amber = "No";
		}
		//length of time they have been missing
		System.out.println("How long have they been missing (Hours)?\n");
		time = input.nextInt();
		//last place they were seen
		System.out.println("Where was the last place they were seen?\n");
		place = input.next();
		//colour of hair
		System.out.println("What colour is their hair?\n");
		hair = input.next();
		//colour of eyes
		System.out.println("What colour are their eyes?\n");
		eyes = input.next();
		//colour of clothing
		System.out.println("What colour were they wearing?\n");
		clothes = input.next();
		//approximate weight
		System.out.println("What is their approximate weight (in kilograms)?\n");
		weight = input.nextDouble();
		//approximate height
		System.out.println("What is their approximate height (in centimeters)?\n");
		height = input.nextDouble();
		//relationship to person
		System.out.println("What is your relation to this person?\n");
		relation = input.next();
		//prints all this to the screen
		System.out.println("\n******************** MISSING PERSONS REPORT ********************\n\nMissing Person: " + missingName + "\nAge: " + age + "\nAmber Alert: " + amber + "\nMissing Time: " + time + " hours\nPlace: " + place + "\n\nPHYSICAL APPEARANCE\nHair Colour: " + hair + "\nEye Colour: " + eyes + "\nClothing Colour: " + clothes + "\nApproximate Weight: " + weight + " kg\nApproximate Height: " + height + " cm\n\nReport Filed By: " + name + "\nRelationship to Missing Person: " + relation + "\n****************************************************************\n");
		
	}
	//third method - a criminal record database
	public static void criminal (String name) 
	{
		//initiate scanner
		Scanner input = new Scanner (System.in);
		//declare variables
		final String password = "crime";
		final int counter = 50;
		String guess = "", answer = "";
		int current = 0, jailCounter = 0;
		String currentCriminal [] = {"Alexis Flores", "Shane O'Brien", "Robert William Fisher", "Dawood Ibrahim"};
		String criminals [] = {"Ted Bundy","Jack the Ripper", "John Dillinger","Jeffrey Dahmer"};
		int total [][]= {{30, 10, 24, 64}, {35, 2, 54, 91}, {8, 32, 15, 55},{52, 3, 12, 67}};
		//user is asked to enter the password
		System.out.println("\n" + name + ", in order to access these criminal records, you have to enter a password:\nPlease enter the password: ");
		guess = input.next();
		//if they enter the password, then they get to access all the files in the database
		if (guess.equalsIgnoreCase(password))
		{
			//prints a list of a few of the most notorious serial killers
			System.out.println("\nHere you can look at criminal record archives\nHere is a list of a few of the scariest serial killers of all time\nThe list shows how many murders, robberies and assaults they have committed\n\n");
			System.out.println("Criminal\t\tMurders\t\tRobberies\tAssaults\tTotal Crimes Committed\n");
			for (int i = 0; i<total.length;i++)
			{
				System.out.print(criminals[i] + "\t\t");
				for (int x = 0; x<total.length;x++)
				{
					System.out.print(total[i][x] + "\t\t");
				}
				//print the total number of crimes committed by the criminal
				System.out.println("");
			}
			//the user is asked if they would like to have a more detailed description about current criminals
			System.out.println("\n\nWould you like a more detailed description about a few of the current criminals on the loose (Y or N)?");
			answer = input.next();
			answer = answer.toUpperCase();
			//error checking for the criminals
			while (!answer.equals("Y")&& !answer.equals("N"))
			{
				System.out.println("Invalid Input. Please try again\nWould you like a more detailed description about a few of the current criminals on the loose (Y or N)?");
				answer = input.next();
				answer = answer.toUpperCase();
			}
			//switch case for if the user would like to pick a criminal
			switch (answer)
			{
			case "Y":
				//if they select y, then a list of current criminals is displayed for them to choose from
				System.out.println("\nHere is a list of a few different criminals who are currently on the loose\nPlease select an option:\n\n1. " + currentCriminal[0] + "\n2. " +  currentCriminal[1] + "\n3. "  + currentCriminal[2] + "\n4. "  + currentCriminal[3]);
				current = input.nextInt();
				//error checking for the criminals
				while (current != 1 && current != 2 && current != 3 && current != 4)
				{
					System.out.println("Invalid Input. Please try again\nHere is a list of a few different criminals who are currently on the loose\nPlease select an option:\n\n1. " + currentCriminal[0] + "\n2. " +  currentCriminal[1] + "\n3. "  + currentCriminal[2] + "\n4. "  + currentCriminal[3]);
					current = input.nextInt();
				}
				//a switch case on the criminals and information on the criminals is displayed
				switch (current)
				{
					//Alexis Flores
					case 1:
						System.out.println("Criminal: " + currentCriminal[0] + "\n- a fugitive\n- wanted for murder, rape and assault\n- on the FBI's most wanted list\n- still missing\n");
						jailCounter = counter;
						break;
					//Shane O'Brien
					case 2:
						System.out.println("Criminal: " + currentCriminal[1] + "\n- suspected killer\n- on the run for 2 years\n- on Interpol's worldwide most wanted list\n- $50 000 award for information\n");
						jailCounter = counter + 10;
						break;
					//Robert William Fisher
					case 3:
						System.out.println("Criminal: " + currentCriminal[2] + "\n- FBI's most wanted list\n- $100 000 reward\n- killed his entire family\n- missing for 17 years\n- name has been on the FBI list for the longest time\n");
						jailCounter = counter + 20;
						break;
					//Dawood Ibrahim
					case 4:
						System.out.println("Criminal: " + currentCriminal[3] + "\n- most wanted man in India\n- drug trafficking\n- contract killing\n- murder\n- extortion\n- terrorism\n");
						jailCounter = counter + 15;
						break;
				}
				//calculates the time spent in jail if these criminals are caught
				System.out.println("\nNow we will calculate how long this criminal will stay in prison if they are caught\nThere is a base punishment of " + counter + " years. \nThis criminal will stay in jail for " + jailCounter + " years\n" + name + ", if you have any information on any of these criminals, please contact 911\n");
				break;
			//if the user does not want to see records, they are taken back to the main menu
			case "N":
				System.out.println("\n" + name + ", you will now be taken back to the main menu\n");
				break;
			}			
		}
		//if they do not guess the correct password, they are directed back to the main menu
		else
		{
			System.out.println("\nThat is the incorrect password, " + name + ". You will be taken back to the main menu\n");
		}		
	}
	//fourth method - talks about all the community out reach programs the police station is a part of
	public static void community (String name)
	{
		//initiate scanner
		Scanner input = new Scanner (System.in);
		//Initiate number format
		NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();
		//declare variables
		int event = 0, hours = 0, volunteering = 0;
		double money = 0, donation = 0, station = 0;
		String answer = "";
		String volunteer [] = {"Youth in Police", "Crisis Prevention Counsellor", "Auxiliary Officer"};
		//introduction
		System.out.println("\n" + name + ", here you can look at all the various types of community outreach this police station participates in\nPlease choose an option you would like to know more about:\n\n1. School Visits\n2. Crime Prevention Presentations\n3. Booths at Fairs\n");
		event = input.nextInt();
		while (event != 1 && event != 2 && event != 3)
		{
			System.out.println("Invalid Input. Please select another option\n" + name + ", here you can look at all the various types of community outreach this police station participates in\nPlease choose an option you would like to know more about:\n\n1. School Visits\n2. Crime Prevention Presentations\n3. Booths at Fairs\n");
			event = input.nextInt();
		}
		//switch case on the different events the police department participates in 
		switch(event)
		{
			//school visits
			case 1:
				System.out.println("\nOur police station participates in a lot of school visits\nWe like to make sure that students are well aware about important issues in today's society\nThis is why we visit schools in the area\n");
				break;
			//presentations
			case 2:
				System.out.println("\nOur police station participates in a lot of crime prevention presentations\nThese presentations usually take place at schools, clubs, at community events\nWe also target students but also adults so they are all well aware about what is currently happening in the world\n");
				break;
			//booths
			case 3:
				//asks user to enter the amount earned at a fair
				System.out.println("\nOur police station participates in a lot of fairs where we have booths.\nThese booths make sure that everyone in the community is aware about what the police is doing to keep everyone safe\nThrough these booths, we also make money\nWe give a small percent as a form of police tax and then the rest of the money is used for improving our police department\n\nPlease enter the amount of money made at the booth this year:\n");
				money = input.nextDouble();
				//calculates the amount donated to a charity
				donation = money*0.3;
				station = money-donation;
				//prints amount donated and amount kept by department
				System.out.println("\nAs a result, we get to donate " + moneyFormat.format(donation) + " and keep " + moneyFormat.format(station) + " for our police department\n");
				break;			
		}
		//ask user if they want to volunteer
		System.out.println(name + ", would you like to look at volunteer opportunites to earn community service hours (Y or N)?\n");
		answer = input.next();
		answer = answer.toUpperCase();
		//error checking for answer
		while (!answer.equals("Y")&& !answer.equals("N"))
		{
			System.out.println("Invalid Input. Please try again\n" + name + ", would you like to look at volunteer opportunites to earn community service hours (Y or N)?\n");
			answer = input.next();
			answer = answer.toUpperCase();
			
		}
		//switch case for if the user would like to pick a volunteering opportunity
		switch (answer)
		{
		//if they want to volunteer, opportunities are displayed
		case "Y":
			//select opportunity
			System.out.println("\nPlease select a volunteer opportunity\n\n1. " + volunteer[0] + "\n2. " + volunteer[1] + "\n3. " + volunteer[2]);
			volunteering = input.nextInt();
			//error checking for volunteering option
			while (volunteering != 1 && volunteering != 2 && volunteering != 3)
			{
				System.out.println("Invalid Input. Please try again\nPlease select a volunteer opportunity\n\n1. " + volunteer[0] + "\n2. " + volunteer[1] + "\n3. " + volunteer[2]);
				volunteering = input.nextInt();
			}
			//switch case for volunteering options - displays more info about it
			switch(volunteering)
			{
			case 1:
				System.out.println("\nYou would like to volunteer as a " + volunteer[0] + "\nIn this program, you get an opportunity to teach young students the basics of policing\nYou get to be a mentor for students, and introduce them to the world of policing\n");
				hours = 10;
				break;
			case 2:
				System.out.println("\nYou would like to volunteer as a " + volunteer[1] + "\nIn this program, you have an opportunity to assist many individuals in crisis situation.\nYou will also help provide any community resources to people who have faced emotional, physical, or psychological trauma\n");
				hours = 15;
				break;
			case 3:
				System.out.println("\nYou would like to volunteer as a " + volunteer[2] + "\nIn this program, you will assist in community events\nYou will also get to go through training programs to help keep neighbourhoods safe.\n");
				hours = 20;
				break;
			}
			//display hours 
			System.out.println("\nFor this opportunity, you will earn " + hours + " volunteer hours a week\n");
			break;
		//if the user does not want to see the volunteer opportunities, they are taken back to the main menu
		case "N":
			System.out.println(name + ", you will now be taken back to the main menu\n");
			break;
		}
	}
	//fifth method - exits the program after displaying a message
	public static void exit (String name)
	{
		System.out.println("\nThank you " + name + ", for coming to the police station. We hope we were successful is addressing all of your needs. ");
		System.exit(0);
	}

}
