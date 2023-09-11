package AnimalFarm;

public class Main {
	public static void main(String[] args) {
		AnimalFarm animalfarm = new AnimalFarm();
		
		animalfarm.addDog("백구", 5.5, "흰색");
		animalfarm.find("백구");
		animalfarm.speakYou("백구");
		animalfarm.allSpeak();
		animalfarm.allList();
	}

}
