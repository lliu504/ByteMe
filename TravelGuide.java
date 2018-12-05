/*
The goal of this project is to create a travel guide that caters to college students who want to explore Boston. The following program prompts the users to enter
their preferences with their budget. Then helps them pick their activities, transportation and food and prints out an itinerary at the end. If the users have no preferences, they can opt in for a random itinerary!
*/

public class TravelGuide {
	public static void main(String[] args) {
		boolean keepGoing = true;
		while(keepGoing) {
			System.out.println("Do you want to travel into Boston? Answer 'Yes' or 'No'");
			String response = TextIO.getlnWord();
			String activity = "";
			String food = "";
			String transportChoice = "";
			if(response.equalsIgnoreCase("No")) {
				System.out.println("thank you, next - Ariana Grande https://www.youtube.com/watch?v=gl1aHhXnN1k");
				activity = "Stay home";
				keepGoing = false;
			}
			if(response.equalsIgnoreCase("Yes")) {
				System.out.println("Would you like a random itinerary?");
				String random = TextIO.getlnWord();
				if(random.equalsIgnoreCase("Yes")) {
					System.out.println("What is your standard budget for each activity?");
					int standard = TextIO.getlnInt();
					if(standard >=0 && standard < 11) {
						String[] randomAct = {"Isabella Stewart Gardner Museum","Boston Commons","JFK Museum","Boston Harbor","BPL Copley","Freedom Trail","Paul Revere House"};
						int random1 = (int)(Math.random()*6);
						activity = randomAct[random1];
						String[] randomFood = {"Grass Roots Cafe","Hong Kong Eatery","El Pelón Taquería","Cafe Mami",
						"Daksen","Pho Pasteur","Roxy’s Grilled Cheese","Thornton's Restaurant","Rondo’s Sub Shop","Ba Le","New Saigon","Le’s Restaurant","S & I","Nud Pob","Pikaichi","Tampopo","Tenoch Mexican","Chutneys","Bottega di Capri"
						,"Alfredo's","Bottega Fiorentina","JMP Fine Indian Cuisine","Halal Indian Cuisine","Taqueria Jaliso","Clay Pot Cafe","He La Moon","OliToki","Misono Grill","Peperi Mediterranean Grill","Noon Mediterranean","Pita"};
						int random2 = (int)(Math.random()*randomFood.length);
						food = randomFood[random2];
						String[] randomTransport = {"Walking", "Biking", "Bus", "Subway"};
						int random3 = (int)(Math.random()*randomTransport.length);
						transportChoice = randomTransport[random3];
					}
					if(standard >=11 && standard<=30) {
						String[] randomAct = {"New England Aquarium","Museum of Fine Arts","Harvard Museum of Natural History","Museum of Science","Skywalk Observatory","Franklin Park Zoo","Quincy Market","Duck Tours"};
						int random1 = (int)(Math.random()*randomAct.length);
						activity = randomAct[random1];
						String[] randomFood = {"Giacomo’s Ristorante","Carmelina’s","Pomodoro","Panza",
						"Seoul Soulongtang","SOJUba","Bonchon","The Salty Pig","Legal Seafood Restaurant","Silvertone","Committee","Metropolis","Mistral","Lolita Cocina & Tequila Bar","Locao Taqueria and Oyster Bar","El Centro","Q Restaurant","Gourmet Dumpling House","New Golden Gate"
						,"Ittoku","Genki Ya","Gyu Kaku","Twelve Hours","Brown Sugar Cafe","Laughing Monk Cafe","Punjab Place","Himalayan Bistro","Mumbai Spice","Anh Hong","Pho Basil","Pho Le"};
						int random2 = (int)(Math.random()*randomFood.length);
						food = randomFood[random2];
						transportChoice = "Commuter Rail";
					}
					if(standard >=31) {
						String[] randomAct = {"Whale Watching","Prudential Center","Newbury Street","Charles River Kayak"};
						int random1 = (int)(Math.random()*randomAct.length);
						activity = randomAct[random1];
						String[] randomFood = {"Da Vinci","SRV Boston","Mamma Maria","Neptune’s Oysters",
						"Clink","Yvonne’s","Porto","Oleana","Trade","Temazcal Tequila Cantina","Toro","PABU","Douzo","Fugakyu","Taj Cafe","Tiger Mama"};
						int random2 = (int)(Math.random()*randomFood.length);
						food = randomFood[random2];
						String[] randomTransport = {"Uber/Lyft", "Zipcar"};
						int random3 = (int)(Math.random()*randomTransport.length);
						transportChoice = randomTransport[random3];
					}
				}
				if(random.equalsIgnoreCase("No")) {
					System.out.println("Do you want indoor or outdoor activities? Answer 'indoor', 'outdoor', 'neither'.");
					String activities = TextIO.getlnWord();
					if(activities.equalsIgnoreCase("indoor")) {
						activity = chooseIndoorActivity();
					}
					if (activities.equalsIgnoreCase("outdoor")){
						activity = chooseOutdoorActivity();
					}
					if(activities.equalsIgnoreCase("neither")) {
						activity = "Have fun! :)";
					}
					System.out.println("Are you up for a food adventure? Answer 'Yes' or 'No'.");
					String adventure = TextIO.getlnWord();
					if(adventure.equalsIgnoreCase("Yes")) {
						food = chooseCuisine();
						transportChoice = chooseTransportation();
					} else if (adventure.equalsIgnoreCase("No")) {
						System.out.println("thank you, next - Ariana Grande https://www.youtube.com/watch?v=gl1aHhXnN1k");
						food = "&";
						transportChoice = chooseTransportation();
					}
			}
			System.out.println("Here is your itinerary:");
			System.out.printf("%s%n%s%n%s%n",activity,food,transportChoice);
			keepGoing = true;
			}
		}
}

		public static String chooseCuisine() {
			System.out.println("Here is a list of cuisines: Korean, Japanese, Chinese, Thai, Vietnamese, Indian, Italian, American, Mediterranean, Mexican. Which one do you crave?");
			String cuisine = TextIO.getlnWord();
			String food = "";
			if(cuisine.equalsIgnoreCase("Korean")) {
				food = chooseKorean();
			} else if(cuisine.equalsIgnoreCase("Japanese")) {
				food = chooseJapanese();
			} else if(cuisine.equalsIgnoreCase("Chinese")) {
				food = chooseChinese();
			} else if(cuisine.equalsIgnoreCase("Thai")) {
				food = chooseThai();
			} else if(cuisine.equalsIgnoreCase("Vietnamese")) {
				food = chooseVietnamese();
			} else if(cuisine.equalsIgnoreCase("Indian")) {
				food = chooseIndian();
			} else if (cuisine.equalsIgnoreCase("Italian")) {
				food = chooseItalian();
			} else if(cuisine.equalsIgnoreCase("American")) {
				food = chooseAmerican();
			} else if(cuisine.equalsIgnoreCase("Mediterranean")) {
				food = chooseMediterranean();
			} else if(cuisine.equalsIgnoreCase("Mexican")) {
				food = chooseMexican();
			} else {
				System.out.println("thank you, next - Ariana Grande https://www.youtube.com/watch?v=gl1aHhXnN1k");
			}
			return food;

		}

		public static String chooseKorean(){
			System.out.println("How much are you willing to spend on a restaurant? Please enter in integer form.");
			int budget = TextIO.getlnInt();
			String food = "";
			if(budget >=0 && budget < 11) {
				System.out.println("Choose from the following: Grass Roots Cafe, OliToki, Misono Grill");
				food=TextIO.getln();
			} else if (budget >=11){
				System.out.println("Choose from the following: Seoul Soulongtang, SOJUba, K Restaurant, Haju Kitchen, Bonchon, BAB Korean Bistro");
				food=TextIO.getln();
			} else{
				System.out.println("Please put in a valid number.");
				chooseKorean();
			}
			return food;
		}

		public static String chooseChinese(){
			System.out.println("How much are you willing to spend on a restaurant? Please enter in integer form.");
			int budget = TextIO.getlnInt();
			String food = "";
			if(budget >= 0 && budget < 11){
				System.out.println("Choose from the following: Hong Kong Eatery, Clay Pot Cafe, He La Moon");
				food = TextIO.getln();
			} else if(budget >= 11){
				System.out.println("Choose from the following: Gourmet Dumpling House, New Golden Gate, Hot Eastern");
				food = TextIO.getln();
			} else{
				System.out.println("Please put in a valid number");
				chooseChinese();
			}
			return food;

		}

		public static String chooseMexican(){
			System.out.println("How much are you willing to spend on a restaurant? Please enter in integer form.");
			int budget = TextIO.getlnInt();
			String food = "";
			if(budget >= 0 && budget < 11){
				System.out.println("Choose from the following: El Pelón Taquería, Tenoch Mexican, Taqueria Jaliso");
				food = TextIO.getln();
			} else if(budget >= 11 && budget < 31){
				System.out.println("Choose from the following: Lolita Cocina & Tequila Bar, Locao Taqueria and Oyster Bar, El Centro");
				food = TextIO.getln();
			} else if(budget >= 31){
				System.out.println("Choose from the following:Temazcal Tequila Cantina, Toro");
				food = TextIO.getln();
			} else{
				System.out.println("Please put in a valid number");
				chooseMexican();
			}
			return food;
		}

		public static String chooseJapanese() {
			System.out.println("How much are you willing to spend at a restaurant? Please enter in integer form:");
			int budget = TextIO.getlnInt();
			String food = "";
			if(budget >= 0 && budget < 11) {
				System.out.println("Choose from the following: Cafe Mami, Pikaichi, Tampopo");
				food = TextIO.getln();
			} else if(budget >= 11 && budget < 31) {
				System.out.println("Choose from the following: Ittoku, Fish Market, Ganko Ittetsu Ramen, Genki Ya, Gyu Kaku");
				food = TextIO.getln();
			} else if(budget >= 31) {
				System.out.println("Choose from the following: Pabu, Douzo, Fugakyu");
			} else {
				System.out.println("Please put in a valid number.");
				chooseJapanese();
			}
			return food;
		}

		public static String chooseThai() {
			System.out.println("How much are you willing to spend at a restaurant? Please enter in integer form:");
			int budget = TextIO.getlnInt();
			String food = "";
			if(budget >= 0 && budget < 11) {
				System.out.println("Choose from the following: Daksen, S & I, Nud Pob");
				food = TextIO.getln();
			} else if(budget >= 11) {
				System.out.println("Choose from the following: Twelve Hours, Brown Sugar Cafe, Laughing Monk Cafe, Treetop, Kor Tor Mor");
				food = TextIO.getln();
			} else {
				System.out.println("Please put in a valid number.");
				chooseThai();
			}
			return food;
		}


		public static String chooseVietnamese() {
			System.out.println(" How much are you willing to spend at a restaurant? Please enter in integer form:");
			int budget = TextIO.getlnInt();
			String food = "";
			if(budget>=0 && budget <11){
				System.out.println("Choose from the following: Pho Pasteur, Ba Le, New Saigon, Le’s Restaurant");
				food = TextIO.getln();
			} else if(budget >=11 && budget <=30) {
				System.out.println("Choose from the following: Anh Hoang, Pho Countryside Boston, Pho Le, Beantown Pho and Grill");
				food = TextIO.getln();
			} else {
				System.out.println("Please put in a valid number");
				chooseVietnamese();
			}
			return food;
		}

		public static String chooseAmerican() {
			System.out.println(" How much are you willing to spend at a restaurant? Please enter in integer form:");
			int budget = TextIO.getlnInt();
			String food = "";
			if(budget>=0 && budget <11){
				System.out.println("Choose from the following: Roxy’s Grilled Cheese, Thornton's Restaurant, Rondo’s Sub Shop");
				food = TextIO.getln();
			} else if(budget >=11 && budget <=30) {
				System.out.println("Choose from the following: The Salty Pig, Legal Seafood Restaurant, Silvertone");
				food = TextIO.getln();
			} else if(budget >= 31) {
				System.out.println("Choose from the following: Neptune’s Oysters, Clink, Yvonne’s, Top of the Hub Restaurant");
			} else {
				System.out.println("Please put in a valid number");
				chooseAmerican();
			}
			return food;
		}
		public static String chooseIndian() {
			System.out.println(" How much are you willing to spend at a restaurant? Please enter in integer form:");
			int budget = TextIO.getlnInt();
			String food = "";
			if(budget>=0 && budget <11){
				System.out.println("Choose from the following: Chutneys, JMP Fine Indian Cuisine, Halal Indian Cuisine");
				food = TextIO.getln();
			} else if (budget >=11 && budget <=30){
				System.out.println("Choose from the following: Punjab Place, Himalayan Bistro, Mumbai Spice");
			} else if (budget >=31){
				System.out.println("Choose from the following: Taj Cafe");
			} else{
				System.out.println("Please put in a valid number. ");
				chooseIndian();
			}
			return food;
		}

		public static String chooseItalian(){
			System.out.println("How much are you willing to spend on a restaurant? Please enter in integer form.");
			int budget = TextIO.getlnInt();
			String food = "";
			if(budget >=0 && budget < 11) {
				System.out.println("Choose from the following: Bottega di Capri, Alfredo’s, Bottega Fiorentina");
				food=TextIO.getln();
			} else if (budget >=11 && budget <=  30){
				System.out.println("Choose from the following: Giacomo’s Ristorante, Carmelina’s, Pomodoro, Panza");
				food=TextIO.getln();
			} else if (budget >=31){
				System.out.println("Choose from the following: Da Vinci, SRV Boston, Mamma Maria");
			} else{
				System.out.println("Please put in a valid number.");
				chooseItalian();
			}
			return food;
		}

		public static String chooseMediterranean(){
			System.out.println("How much are you willing to spend on a restaurant? Please enter in integer form.");
			int budget = TextIO.getlnInt();
			String food = "";
			if(budget >=0 && budget < 11) {
				System.out.println("Choose from the following: Peperi Mediterranean Grill, Noon Mediterranean, Pita");
				food=TextIO.getln();
			} else if (budget >=11 && budget <=  30){
				System.out.println("Choose from the following: Committee, Metropolis, Mistral ");
				food=TextIO.getln();
			} else if (budget >=31){
				System.out.println("Choose from the following: Porto, Oleana, Trade ");
			} else{
				System.out.println("Please put in a valid number.");
				chooseMediterranean();
			}
			return food;
		}

		public static String chooseIndoorActivity() {
			System.out.println("How much are you willing to spend on an indoor activity? Please enter in integer form.");
			int indoorBudget = TextIO.getlnInt();
			String activity = "";
			if(indoorBudget >=0 && indoorBudget < 11) {
				System.out.println("Choose from the following: Isabella Stewart Gardner Museum, Paul Revere House, JFK Museum/Commonwealth Museum,  BPL - Copley" );
				activity =TextIO.getln();
			} else if (indoorBudget >11){
				System.out.println("Choose from the following: New England Aquarium, Museum of Fine Arts, Harvard Museum of Natural History, Museum of Science, Skywalk Observatory, Franklin Park Zoo");
				activity =TextIO.getln();
			} else{
				System.out.println("There are cheaper options! Please put in a valid number.");
				chooseIndoorActivity();
			}
			return activity;
		}


		public static String chooseOutdoorActivity(){
			System.out.println("How much are you willing to spend on an outdoor activity? Please enter in integer form.");
			int outdoorBudget = TextIO.getlnInt();
			String activity = "";
			if(outdoorBudget >=0 && outdoorBudget < 11) {
				System.out.println("Choose from the following: Boston commons/garden, Freedom Trail, Boston Harbor" );
				activity=TextIO.getln();
			} else if (outdoorBudget >=11 && outdoorBudget<=30){
				System.out.println("Choose from the following: Quincy Market, Duck Tours" );
				activity=TextIO.getln();

			}else if (outdoorBudget >=31){
				System.out.println("Choose from the following: Whale Watching, Kayak on the Charles River " );
				activity=TextIO.getln();
			} else{
				System.out.println("Please put in a valid number.");
				chooseOutdoorActivity();
			}
			return activity;
		}

		public static String chooseTransportation(){
			System.out.println("How much are you willing to spend on transportation? Please enter in integer form.");
			int transportBudget = TextIO.getlnInt();
			String transportChoice = "";
			if(transportBudget >= 0 && transportBudget < 11){
				System.out.println("Choose from the following: Walking, Biking, Bus, Subway");
				transportChoice = TextIO.getln();
			} else if (transportBudget >=11 && transportBudget <= 30){
				System.out.println("Commuter Rail");
				transportChoice = "Commuter Rail";
			} else if (transportBudget >=31){
				System.out.println("Choose from the following: Uber, Lyft, Zipcar");
				transportChoice = TextIO.getln();
			} else {
				System.out.println("Please put in a valid number.");
				chooseTransportation();
			}
			return transportChoice;
		}
}
