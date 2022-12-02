package com.mygame.view;
import com.mygame.service.GameService;
import com.mygame.dao.GameDAO;
import com.mygame.dao.GameDAO;
public class GameView {
 GameService g=new GameService();
 int randomNumberArr[]=new int[10];
 

 public String[] displayCityNameWithBlanks() {
	 GameView m= new GameView();
	 String[] c=g.getCityNameService(c);
	
	for(int i=0;i<c.length;i++) {
		
		int length =c[i].length();
		
		char cityNameCharArr[]=new char[length];
		
		generateRandomNumber(length);
		
		for(int j=0;j<length;j++) {
			cityNameCharArr[j]=c[i].charAt(j);
			
			for(int k=0;k<randomNumberArr.length;k++) {	
				if(j==randomNumberArr[k])
				cityNameCharArr[j]='-';		
			}
		
		}
		char newCityName=new char(cityNameCharArr);
		
		char[][] displayCityNameWithBlanks;
		
		displayCityNameWithBlanks[i]=newCityName;
		System.out.println(displayCityNameWithBlanks[i]);
	}
}
public void generateRandomNumber(int count) {
	int minimum=0;
	int maximum=count;
	for(int k=0;k<=count/2;k++) {
			int randomNumber=minimum + (int)(Math.random() * maximum);
			
			randomNumberArr[k]=randomNumber;
			System.out.println(randomNumber);
			
	}
}		 
}
