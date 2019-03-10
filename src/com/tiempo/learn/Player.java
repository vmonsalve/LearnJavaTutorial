package com.tiempo.learn;

public class Player {
	private String handleName;
	private int lives;
	private int level;
	private int score;
	private Weapon weapon;
	
	public Player(String handle){
		this.handleName = "Unknown Player";
		this.lives = 3;
		this.level = 1;
		this.score = 0;
		setDefaultWeapon();
	}
	
	public Player(String handle, int level) {
		setHandleName(handle);
		setLevel(level);
	}
	
	private void setDefaultWeapon() {
		this.weapon = new Weapon("Ak47", 150, 20);
	}
	
	public String getHandleName() { 
		return handleName; 
	}
	
	public void setHandleName(String handle){
		handleName= handle;
	}
	
	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}


	public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		this.lives = lives;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
