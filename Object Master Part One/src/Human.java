
public class Human {
protected int strength = 3;
protected int stealth = 3;
protected int intelligence = 3;
protected int health = 100;

public int attack(Human attacked){
	attacked.health = attacked.health - this.strength;
	return health;
}


}
