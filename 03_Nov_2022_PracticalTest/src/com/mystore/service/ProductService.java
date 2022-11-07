package com.mystore.service;
import com.mystore.dao.ProductDAO;
import com.mystore.model.Product;

public class ProductService {
	ProductDAO productdao=new ProductDAO();
	
	public void addProductService(Product product) {
		productdao.addProduct(product);
		
		
	}
	public Product[] getProductByNameStartWithService(String s)
	{
		Product[] pr = productdao.getProductByNameStartWith(s);
		return pr;
	}
	
	public Product[] getAllProduct()
	{
		Product[] p = productdao.getAllProduct();
		return p;
	}

}
