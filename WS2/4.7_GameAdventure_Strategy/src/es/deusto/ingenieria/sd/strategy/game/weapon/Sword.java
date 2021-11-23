package es.deusto.ingenieria.sd.strategy.game.weapon;

public class Sword implements WeaponBehaviour {

	@Override
	public void display() {
		System.out.println("   * A very thrusting sword.");
	}

	@Override
	public void use() {
		System.out.println("   * You slash madly with your sword.");
	}
}