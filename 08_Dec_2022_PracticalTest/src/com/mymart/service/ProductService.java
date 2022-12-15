package com.mymart.service;
import java.util.LinkedList;
import com.mymart.dao.ProductDAO;
import com.mymart.model.Product;
public class ProductService {
	private static ProductDAO productDAO=new ProductDAO();
	
	public boolean addProductService(Product product) {
		boolean addStatus=productDAO.addProduct(product);
		return addStatus;
	}
	public LinkedList<Product>getAllProductsService(){
		LinkedList<Product> list=productDAO.getAllProducts();
		return list;
	}

}
