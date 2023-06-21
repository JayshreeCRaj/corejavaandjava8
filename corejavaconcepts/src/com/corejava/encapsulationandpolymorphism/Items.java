package com.corejava.encapsulationandpolymorphism;

public class Items {
	
	private Integer itemNumber;
	private String itemName;
	private double itemPrice;
	
	Items(){
		itemNumber=111;
		itemName="";
		itemPrice=0.0;
	}
	
	public Integer getItemNumber() {
		return itemNumber;
	}
	
	public String getItemName() {
		return itemName;
	}
	
	public double getItemPrice() {
		return itemPrice;
	}
	
	public void setItemNumber(Integer itemNumber) {
		this.itemNumber=itemNumber;
	}
	
	public void setItemName(String itemName) {
		this.itemName=itemName;
	}
	
	public void setItemPrice(double itemPrice) {
		this.itemPrice=itemPrice;
	}
	
	@Override
	public String toString() {
		return "Items Details:\nItem Number="+itemNumber+"\nItem Name="+itemName+"\nItem Price="+itemPrice;
	}
}
