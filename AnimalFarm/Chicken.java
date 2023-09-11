package AnimalFarm;

public class Chicken extends Animal {
	public Chicken() {};
	
	public Chicken(String name, double weight, String color) {
		this.name = name;
		this.weight = weight;
		this.color = color;
	}
	
	public void speak() {
		System.out.println("꼬꼬댁!");
	}

}
