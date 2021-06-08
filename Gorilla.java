public class Gorilla extends Mammal {
	
	int energyLevel = this.displayEnergy();
	
	public void throwSomething() {
		System.out.println("The Gorilla just threw something...");
		energyLevel -= 5;
		System.out.println("That action drained 5 energy. New energy level: " + energyLevel);
	}
	
	public void eatBananas() {
		System.out.println("The Gorilla just ate some bananas...");
		energyLevel += 10;
		System.out.println("Bananas are a Gorilla's Favorite food! Energy increased to: " + energyLevel);
	}
	
	public void climb() {
		System.out.println("The Gorilla climbed a tree to get a better vantage point...");
		energyLevel -= 10;
		System.out.println("All of that effort drained 10 energy. New energy level: " + energyLevel);
	}

}
