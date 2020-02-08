package com.urja.first_task;

public class Choco {
	int price,weight,cat;
	String name;
	private int choco_type;

	public Choco(int price, int weight,String name,int choco_type) {
	super();
	this.price = price;
	this.weight = weight;
	this.name=name;
	this.choco_type=choco_type;
	}


	public int getPrice()
	{
	return price;
	}


	public int getWeight()
	{
	return weight;
	}


	public String getName() {
	return name;
	}

	public int getchoco_type()
	{
	return choco_type;
	}

	@Override
	public String toString() {
	return "Name=" +  name + " [price=" + price + ", weight=" + weight  + "]";
	}


	}




