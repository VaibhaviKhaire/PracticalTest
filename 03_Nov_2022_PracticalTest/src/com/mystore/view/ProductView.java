package com.mystore.view;
import com.mystore.service.ProductService;
import com.mystore.model.Product;
import java.util.Scanner;




public class ProductView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ProductService productservice=new ProductService();
		for(int i=0;i<2;i++) {
			System.out.println("Enter product id");
			int pid=sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter product name");
			String pname=sc.nextLine();
			
			System.out.println("Enter product price ");
			double pprice=sc.nextDouble();
			
			Product product = new Product(pid,pname,pprice);
			productservice.addProductService(product);
			
			
			
	}
		System.out.println("Enter the Product name first letter.");
		String s = sc.nextLine();
		
		Product[] S = productservice.getProductByNameStartWithService(s);
		
		Product[] productArr = productservice.getAllProduct();
		
		System.out.println("The Products with same First Letter are: ");
		for(int i = 0; i < S.length;i++)
		{
			if(S[i] != null)
				System.out.println(S[i].getproductName());
			
			else
				break;
		}
	}

}
