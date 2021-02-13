package _01_sea_creature;

public class SeaCreatureRunner {

	public static void main(String[] args) {

	SeaCreature creature = new SeaCreature("Spongebob");
		creature.eat();
		
		System.out.println (creature.getName());
		
		SeaCreature creature1 = new SeaCreature("Patrick");
		creature1.eat();
		
		System.out.println (creature1.getName());
		
		SeaCreature creature2 = new SeaCreature("Squidward");
		creature2.eat();
		
		System.out.println (creature2.getName());
	}

}
