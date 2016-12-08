package com.atguigu.struts2.helloworld;

public class Product {
	private Integer productID;
	private String productName;
	private String productPrice;
	private String productDesc;
	
	
@Override
	public String toString() {
		return "Product [productID=" + productID + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productDesc=" + productDesc +"]";
	}


public Integer getProductID() {
		return productID;
	}


	public void setProductID(int productID) {
		this.productID = productID;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}


	public String getProductDesc() {
		return productDesc;
	}


	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

public String save(){
	System.out.println("save:"+this);
	return "details";
}

}
