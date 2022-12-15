package com.mymart.dao;
import com.mymart.model.Product;
import java.util.LinkedList;
public class ProductDAO {
	private static LinkedList<Product>List=new  LinkedList<>();
	public boolean addProduct(Product product) {
		boolean addStatus=false;
		List.add(product);
		addStatus=true;
		return addStatus;
	}
	
	public LinkedList<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return List;
	}

	
	

}
