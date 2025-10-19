abstract class Character{
	
	private String name;

	private int health;
	private int power;
	
	public Character(String name,int health,int power) {
		
		this.name=name;
		this.health=health;
		this.power=power;
		
	}
	public void setHealth(int health) {
		this.health=health;
		
	}
	
	public String getName() {
		return name;
	}
	public int getHealth() {
		return health;
	}
	public int getPower() {
		return power;
	}
	
	public abstract void attack(Character enemy);
	public abstract void defend(int damage );
	public  boolean isAlive() {
	return health>0;
	}
}

class Thor extends Character{

	public Thor(String name, int health, int power) {
		super(name, health, power);

	}

	@Override
	public void attack(Character enemy) {
		System.out.println("Thor attacks the "+enemy.getName()+" with his mighty hammer!");
		enemy.defend(getPower());
	}

	@Override
	public void defend(int damage) {
		int reducedDamage=damage-10;
		setHealth(getHealth()-reducedDamage);
		System.out.println("Thor blocks part of the attack! Health now:"+getHealth());
		
	}

}

class DoctorStrange extends Character{

	public DoctorStrange(String name, int health, int power) {
		super(name, health, power);
	}


	@Override
	public
	void attack(Character enemy) {
		System.out.println("Doctor Strange casts a spell on "+enemy.getName()+" !");
		enemy.defend(getPower());
	}

	@Override
	public
	void defend(int damage) {
		int reducedDamage=damage-5; 
		setHealth(getHealth()-reducedDamage);
		System.out.println("Doctor Strange defends with a magical shield! Health now:  "+getHealth());
		
	}



}


public class game {

	public static void main(String[] args) {
		
		System.out.println("welcome to the Battle between Thor ⚡ VS Doctor Strange🌀");
		System.out.println();
		Thor t=new Thor("Thor",100,40);
		DoctorStrange d=new DoctorStrange("Doctor Strange ",100,35);
		
		while(t.isAlive() && d.isAlive()) {
			t.attack(d);
			if(!d.isAlive()) break;
			
			d.attack(t);
			 System.out.println("---------------------------------------------------------------");
			 
		}
		
		if(t.isAlive()) {
			System.out.println("\n"+t.getName() +" wins with Battle ⚡");
		}
		else {
			System.out.println("\n"+d.getName() +" wins with Battle");
			
		}
		System.out.println("\n=== Game Over ===");
		
	}

}
