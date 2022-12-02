package com.mygame.service;
import com.mygame.dao.GameDAO;


public class GameService {
	
	
	
	public String[] getCityNameService(String[] CityName) {
		GameDAO g = new GameDAO();
		String s[] = g.getCityName();
		
		return s;
	}

	public String[] GameService() {
		// TODO Auto-generated method stub
		return null;
	}
	}
	


