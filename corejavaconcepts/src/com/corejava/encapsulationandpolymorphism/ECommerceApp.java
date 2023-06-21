package com.corejava.encapsulationandpolymorphism;

public class ECommerceApp implements IItems {

	public static void main(String[] args) {
		
		ECommerceApp eapp = new ECommerceApp();
		Items item =eapp.addProducts();
		eapp.displayProducts(item);

	}

	@Override
	public Items addProducts() {
		
		Items item= new Items();
		
		item.setItemName("iPhone 14");
		item.setItemNumber(23456);
		item.setItemPrice(54500.00);
		
		System.out.println("Items added successfully");
		return item;
	}

	@Override
	public void displayProducts(Items item) {
		System.out.println(item.toString());
	}

	@Override
	public void modifyProduct() {
		// TODO Auto-generated method stub
		
	}

}
