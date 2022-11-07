package com.mystore.dao;
import com.mystore.model.Product;

public class ProductDAO {
	Product productArr[]=new Product[2];
	Product productArr1[]=new Product[2];
	
	int j=0;
	public void addProduct(Product product) {
		for(int i=0;i<productArr.length;i++)
		{
			if(productArr[i] == null)
			{
				productArr[i] = product;
				break;
			}
				
					
		}
		
	}
	public Product[]  getProductByNameStartWith(String s) throws NullPointerException {
		for(int i = 0; i < productArr.length;i++)
		{
			if(productArr[i].getproductName().startsWith(s))
			{
				productArr1[j] = productArr[i];
				j++;
			}
		}
		return productArr1;
	}
		
	public Product[] getAllProduct()
	{
		return productArr;
	}
	
}
