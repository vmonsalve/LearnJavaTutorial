package com.tiempo.learn;

public class Weapon {

	private String name;
	private int damageInflicted;
	private int hitPoint;
	
	public Weapon(String name, int damageInflicted, int hitPoint) {
		super();
		this.name = name;
		this.damageInflicted = damageInflicted;
		this.hitPoint = hitPoint;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDamageInflicted() {
		return damageInflicted;
	}
	public void setDamageInflicted(int damageInflicted) {
		this.damageInflicted = damageInflicted;
	}
	public int getHitPoint() {
		return hitPoint;
	}
	public void setHitPoint(int hitPoint) {
		this.hitPoint = hitPoint;
	}
}
