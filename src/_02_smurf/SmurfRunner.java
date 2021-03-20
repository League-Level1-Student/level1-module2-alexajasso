package _02_smurf;

import _01_sea_creature.SeaCreature;

public class SmurfRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* 
 * 1. Watch this Smurf cartoon: https://www.youtube.com/watch?v=7-RDGT5Lsp8 
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * 3. & 4. see comments in code below
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. 
 */
	Smurf blue = new Smurf ("Smurf");
	blue.eat();
	
	System.out.println (blue.getName());
	
	Smurf blue1 = new Smurf ("Papa Smurf");
	
	System.out.println (blue1.getName());
	
	System.out.println (blue1.getHatColor());
	
	System.out.println (blue1.isGirlOrBoy());
	
Smurf blue2 = new Smurf ("Smurfette");
	
	System.out.println (blue2.getName());
	
	System.out.println (blue2.getHatColor());
	
	System.out.println (blue2.isGirlOrBoy());

	}

}
