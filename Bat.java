public class Bat {
    private int energyLevel = 300;
	
	public void fly() {
		System.out.println("*flutter* *flutter* the giant bat flies away...");
		energyLevel -= 50;
		System.out.println("That action drained 50 energy. New energy level: " + energyLevel);
	}
	
	public void eatHumans() {
		System.out.println("*crunch* *crunch* the giant bat devours the bones of it's enemies...");
		energyLevel += 25;
		System.out.println("This revives it's energy! Energy increased to: " + energyLevel);
	}
	
	public void attackTown() {
		System.out.println("*crackle* *crackle* fire illuminates the night sky as citizens flea their burning city. The bat destroys everything in sight... ");
		energyLevel -= 100;
		System.out.println("Total carnage drained 100 energy. New energy level: " + energyLevel);
	}

}