package _03_tea_maker;

public class TeaMakerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Figure out how to make a cup of tea in this runner class, using the other classes below */
Kettle kettle = new Kettle ();
kettle.getWater();
kettle.boil();

TeaBag tea = new TeaBag("Passion Fruit");
Cup cup = new Cup ();
cup.makeTea(tea, kettle.getWater());

TeaBag tea1 = new TeaBag("Chamomile");
Cup cup1 = new Cup ();
cup1.makeTea(tea1, kettle.getWater());

TeaBag tea2 = new TeaBag("Green");
Cup cup2 = new Cup ();
cup2.makeTea(tea2, kettle.getWater());

TeaBag tea3 = new TeaBag("Mint");
Cup cup3 = new Cup ();
cup3.makeTea(tea3, kettle.getWater());


	}

}
