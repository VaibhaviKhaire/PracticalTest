package com.mystore.model;

public class Product {
 int productId;
 String productName;
 double productPrice;
 
 //without parameter
 public Product() {
	 
 }
 
 //with 3 parameter (for all member variable)
  public Product(int pid,String pname,double pprice) {
	 productId=pid;
	 productName=pname;
	 productPrice=pprice; 
  }
  
  //with 1 parameter (for productId)
  public Product(int pid){
	 productId=pid;
  }
  
  //with 1 parameter (for productName)
 public Product(String pname){
	 productName=pname;
 }
 
 //with 1 parameter (for productPrice)  
 public Product(double pprice) {
	 productPrice=pprice;
 }
 
//set method
 
 public void setProductId(int pid) {
	 productId=pid;
	
 }
 public void setproductName(String pname){
	 productName=pname;
 }
 public  void setproductPrice(double pprice) {
	 productPrice=pprice;
 } 
 
 //get method
 public int getproductId() {
	 return productId;
	
 }
 public String getproductName(){
	return  productName;
 }
 public  double getproductPrice() {
	return productPrice;
 }
	
}
