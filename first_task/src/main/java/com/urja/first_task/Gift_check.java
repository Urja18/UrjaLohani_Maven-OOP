package com.urja.first_task;
import java.util.*;
public class Gift_check {
	static List<New_sweet> sweets=new ArrayList<New_sweet>();
	static List<Choco> chocolates=new ArrayList<Choco>();
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] arg) {
	
	
	
		
		

			inputSweets();
			inputChocolate();
			
			while(true)
			{
				System.out.println("MENU");
				System.out.println("1.View The Chocoltes and Sweets");
				System.out.println("2.View The Total Weight Of The Gift");
				System.out.println("3.View The Candies In The Gift");
				System.out.println("4.Filter");
				System.out.println("5.Exit");
				int choice=sc.nextInt();
				 switch(choice)
				 {
				 case 1:
					 display();
					 break;
				 case 2:
					 System.out.println("The total weight of the gift:"+Weight());
					 break;
				 case 3:
					 System.out.println("The Candies are:");
					 toffeeDisplay();
					 break;
				 case 4:
					 System.out.println("Filter the chocolates and sweets according to: 1.Price 2.Weight");
					 int ch=sc.nextInt();
					 filter(ch);
					 break;
				 case 5:
					 System.out.println("Hey! You are Sweet! ThankYou");
					 System.exit(0);
				default:
					 System.out.println("Sorry!!");
				 }
			}
		}
		public static void inputSweets()
		{
			
			System.out.println("Enter the no of sweets:");
			for(int n=sc.nextInt();n>0;n--)
			{
				System.out.println("Enter the weight of the sweet:");
				int weight=sc.nextInt();
				System.out.println("Enter the price of the sweet:");
				int price=sc.nextInt();
				System.out.println("Enter the name of the sweet:");
				String name=sc.next();
				New_sweet sweet=new New_sweet(price,weight,name);
				sweets.add(sweet);
			}
		}
		
		
		public static void inputChocolate()
		{
			
			System.out.println("Enter the no of chocolates:");
			for(int n=sc.nextInt();n>0;n--)
			{
				System.out.println("Enter the weight of the chocolate:");
				int weight=sc.nextInt();
				System.out.println("Enter the price of the chocolate:");
				int price=sc.nextInt();
				System.out.println("Enter the type of chocolate: 1.Candy 2.Chocolate");
				int cat=sc.nextInt();
				System.out.println("Enter the name of the chocolate:");
				String name=sc.next();
				Choco chocolate=new Choco(price,weight,name,cat);
				chocolates.add(chocolate);
			}
		}	
		
		public static int Weight()
		{
			int totalWeight=0;
			for(Choco choco:chocolates)
				totalWeight+=choco.getWeight();
			for(New_sweet sweet:sweets)
				totalWeight+=sweet.getWeight();
			
			return totalWeight;
		}
		
		public static void toffeeDisplay()
		{
			for(Choco choco:chocolates)
			{
				if(choco.getchoco_type()==1)
					System.out.println(choco.toString());
			}
		}
		
		public static void filter(int ch) 
		{
			int lower,higher;
			if(ch==1)
			{
				System.out.println("Enter the lower price limit:");
				lower=sc.nextInt();
				System.out.println("Enter the upper price limit:");
				higher=sc.nextInt();
				for(Choco choco:chocolates)
				{
					if(choco.getPrice()>=lower&&choco.getPrice()<=higher)
						System.out.println(choco.toString());
				}
				for(New_sweet sweet:sweets)
				{
					if(sweet.getPrice()>=lower&&sweet.getPrice()<=higher)
						System.out.println(sweet.toString());
				}
			}
			else
			{
				System.out.println("Enter the lower weight limit:");
				lower=sc.nextInt();
				System.out.println("Enter the upper weight limit:");
				higher=sc.nextInt();
				for(Choco choco:chocolates)
				{
					if(choco.getWeight()>=lower&&choco.getWeight()<=higher)
						System.out.println(choco.toString());
				}
				for(New_sweet sweet:sweets)
				{
					if(sweet.getWeight()>=lower&&sweet.getWeight()<=higher)
						System.out.println(sweet.toString());
				}
			}
		}
		
		public static void display()
		{
			for(Choco choco:chocolates)
					System.out.println(choco.toString());
			for(New_sweet sweet:sweets)
					System.out.println(sweet.toString());
		}
	
}
	 

	


