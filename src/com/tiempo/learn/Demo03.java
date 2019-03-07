package com.tiempo.learn;

public class Demo03 {

	public static void main(String[] args) {
		Player oneplayer = new Player();
		
		System.out.println(oneplayer.getHandleName());
		
		oneplayer.setHandleName("Vicente");
		System.out.println(oneplayer.getHandleName());
		
		Player secondplayer = new Player("Javiera");
		System.out.println(secondplayer.getHandleName());
		
		secondplayer.setLevel(5);
		System.out.println(secondplayer.getLevel());
		
	}

}
