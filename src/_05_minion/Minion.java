package _05_minion;

public class Minion {

	private String name;
	private int eyes;
	private String color;
	private String master;

	public Minion(String name,int eyes, String color, String master) {
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;
		

	}

	public String getName() {
		return name;
	}
	
	public int getEyes() {
		return eyes;
	}
	
	public String getColor() {
		return color;
	}
	public void  setMaster(String master) {
		this.master = master;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
