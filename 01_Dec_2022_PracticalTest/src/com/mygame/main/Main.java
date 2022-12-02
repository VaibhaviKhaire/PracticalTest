package com.mygame.main;
import com.mygame.dao.GameDAO;
import com.mygame.service.GameService;
import com.mygame.view.GameView;


public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				GameView view = new GameView();
				GameService service = new GameService();
				
				//String[] s = service.GameService();
				//int n = s.length;
				
				String name[] = view.displayCityNameWithBlanks();
				
				for(int i = 0 ; i <=4 ; i++)
				System.out.println(name[i]);
				
	}

	
}
