package com.sportsComplex.task;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Slots {
	
	
	
	public void batminton()
	{
		HashMap<Integer,String> btslots = new HashMap<>();
		
		btslots.put(1,  " = 7am to 8am");
		btslots.put(2,  " = 8am to 9am");
		btslots.put(3,  " = 9am to 10am");
		btslots.put(4,  " = 10am to 11am");
		btslots.put(5,  " = 11am to 12am");
		btslots.put(6,  " = 12am to 1pm");
		btslots.put(7,  " = 2pm to 3pm");
		btslots.put(8,  " = 3pm to 4pm");
		btslots.put(9,  " = 4pm to 5pm");
		btslots.put(10, "= 5pm to 6pm");
		
	
				
		for(Map.Entry b : btslots.entrySet())
		{
			System.out.println(b.getKey()+" " + b.getValue());
		}
		
		System.out.println();
		
		System.out.println("select time slots ");
		Scanner sc= new Scanner(System.in);
		int choice = sc.nextInt();
		
		System.out.println();
		
		if(btslots.get(choice)!=null)
		{
			System.out.println("booking successfull  thankyou for booking");
			
			System.out.println();
			
			btslots.remove(choice);
			System.out.println("your booking : " + btslots.get(choice));
			
			
		}
		else
		{
			System.out.println("no slots available ");
		}
		
		

		System.out.println(" please press 1 to continue, press 2 for exit");
		
		int n=sc.nextInt();
		
		if(n==1)
		{
			batminton();
		}
		else {
			Sportclub sp = new Sportclub();
			sp.book();
		}
		
	}
		
		
		public void football()
		{
			HashMap<Integer,String> fslots = new HashMap<>();
			
			fslots.put(1,  " = 7:00am to 7:30am");
			fslots.put(2,  " = 7:30am to 8:00am");
			fslots.put(3,  " = 8:00am to 8:30am");
			fslots.put(4,  " = 8:30am to 9:00am");
			fslots.put(5,  " = 9:00am to 9:30am");
			fslots.put(6,  " = 9:30am to 10:00pm");
			fslots.put(7,  " = 2pm to 3pm");
			fslots.put(8,  " = 3pm to 4pm");
			fslots.put(9,  " = 4pm to 5pm");
			fslots.put(10, "= 5pm to 6pm");
			fslots.put(11, "= 6pm to 7pm");
			fslots.put(12, "= 7pm to 8pm");
			fslots.put(13,  " = 7am to 8am");
			fslots.put(14,  " = 8am to 9am");
			fslots.put(15,  " = 9am to 10am");
			fslots.put(16,  " = 10am to 11am");
			fslots.put(17,  " = 11am to 12am");
			fslots.put(18,  " = 12am to 1pm");
			fslots.put(19,  " = 2pm to 3pm");
			fslots.put(20,  " = 3pm to 4pm");
		
					
			for(Map.Entry b :fslots.entrySet())
			{
				System.out.println(b.getKey()+" " + b.getValue());
			}
			
			System.out.println();
			
			System.out.println("select time slots ");
			Scanner sc= new Scanner(System.in);
			int choice = sc.nextInt();
			System.out.println();
			if(fslots.get(choice)!=null)
			{
				System.out.println("booking successfull  thankyou for booking");
				
				System.out.println();
				fslots.remove(choice);
				System.out.println("your booking : " +fslots.get(choice));
				
				
			}
			else
			{
				System.out.println(" ");
			}
			
			

			System.out.println(" please press 1 to continue, press 2 for exit");
			
			int n=sc.nextInt();
			
			if(n==1)
			{
				football();
			}
			else {
				Sportclub sp = new Sportclub();
				sp.book();
			}
			
		}
			
			
			public void cricket()
			{
				HashMap<Integer,String> cslots = new HashMap<>();
				
				cslots.put(1,  " = 7am to 8am");
				cslots.put(2,  " = 8am to 9am");
				cslots.put(3,  " = 9am to 10am");
				cslots.put(4,  " = 10am to 11am");
				cslots.put(5,  " = 11am to 12am");
				cslots.put(6,  " = 12am to 1pm");
				
				cslots.put(7,  " = 2pm to 3pm");
				cslots.put(8,  " = 3pm to 4pm");
				cslots.put(9,  " = 4pm to 5pm");
				cslots.put(10, "= 5pm to 6pm");
				cslots.put(11, "= 6pm to 7pm");
				cslots.put(12, "= 7pm to 8pm");
			
						
				for(Map.Entry b : cslots.entrySet())
				{
					System.out.println(b.getKey()+" " + b.getValue());
				}
				
				System.out.println();
				
				System.out.println("select time slots ");
				Scanner sc= new Scanner(System.in);
				int choice = sc.nextInt();
				
				
				if(cslots.get(choice)!=null)
				{
					System.out.println("booking successfull  thankyou for booking");
					
					System.out.println();
					
		
					System.out.println("your booking : " +cslots.get(choice));
					cslots.remove(choice);
				}
				else
				{
					System.out.println(" ");
				}
				
				
				
				System.out.println(" please press 1 to continue, press 2 for exit");
				
				int n=sc.nextInt();
				
				if(n==1)
				{
					cricket();
				}
				else {
					Sportclub sp = new Sportclub();
					sp.book();
				}
				
			}
	}
	
	
