package com.sportsComplex.task;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;



public class Sportclub  
{

	static HashMap<Integer,String> cslots  = new HashMap<>();
	static HashMap<Integer,String> btslots = new HashMap<>();
	static HashMap<Integer,String> fslots  = new HashMap<>();
	
	
	
	public void book(){
		
		
		System.out.println("welcome to sports club ");
		
		
		System.out.println("please enter you name");
		
		
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		System.out.println("welocome " +name);
		
        System.out.println("available sports list");
		HashMap<Integer,String> list = new HashMap<>();
		
		list.put(1, "batminton");
		list.put(2, "football");
		list.put(3, "cricket");
		
		for(Map.Entry m  : list.entrySet())
		{
			
			System.out.println(m.getKey()+ " " + m.getValue());
		}
		
		
		System.out.println("choose number from one to three for selection");
		
		int option =sc.nextInt();
		
		switch(option)
		{
		case 1: batminton();
		break;
		case 2:football();
		break;
		case 3:cricket();
		break;
		default: 
			
		{
			System.out.println("choose keys from one to three only ");
		}
				
		
		}
	     
		
		
	}
	
	
	

	public void batminton()
	{
				
		for(Map.Entry b : btslots.entrySet())
		{
			System.out.println(b.getKey()+" " + b.getValue());
		}
		
		System.out.println();
		
		System.out.println("select time slots ");
		Scanner sc= new Scanner(System.in);
		int choice = sc.nextInt();
		
		System.out.println();
		
		if(choice!=0)
		{
			System.out.println("booking successfull  thankyou for booking");
			
			System.out.println();
			
			
			System.out.println("your booking : " + btslots.get(choice));
			
			btslots.remove(choice);
			
		}
		else
		{
			System.out.println("no slots available ");
		}
		
		
		try
		{
			FileWriter w = new FileWriter("data6.txt");
			w.write(btslots.get(choice));
			w.close();
							
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		
		System.out.println(" please press 1 to continue, press 2 for exit");
		
		int n=sc.nextInt();
		
		if(n==1)
		{
			batminton();
		}
		else {
			
			System.out.println("thankyou");
		}
		
	}
		
		
		public void football()
		{
			
			for(Map.Entry b :fslots.entrySet())
			{
				System.out.println(b.getKey()+" " + b.getValue());
			}
			
			System.out.println();
			
			System.out.println("select time slots ");
			Scanner sc= new Scanner(System.in);
			int choice = sc.nextInt();
			System.out.println();
			if(choice!=0)
			{
				System.out.println("booking successfull  thankyou for booking");
				
				System.out.println();
				
				System.out.println("your booking : " +fslots.get(choice));
				fslots.remove(choice);
				
			}
			else
			{
				System.out.println(" ");
			}
			
			try
			{
				FileWriter w = new FileWriter("data6.txt");
				w.write(fslots.get(choice));
				w.close();
						
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			

			System.out.println(" please press 1 to continue, press 2 for exit");
			
			int n=sc.nextInt();
			
			if(n==1)
			{
				football();
			}
			else {
			
			System.out.println("thankyou");
			}
			
		}
			
			
			public void cricket()
			{
					
				for(Map.Entry b : cslots.entrySet())
				{
					System.out.println(b.getKey()+" " + b.getValue());
				}
				
				System.out.println();
				
				System.out.println("select time slots ");
				Scanner sc= new Scanner(System.in);
				int choice = sc.nextInt();
				
				
				if(choice!=0)
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
				
				
				try
				{
					FileWriter w = new FileWriter("data6.txt");
					w.write(cslots.get(choice));
					w.close();
									
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
				
				
				System.out.println(" please press 1 to continue, press 2 for exit");
				
				int n=sc.nextInt();
				
				if(n==1)
				{
					cricket();
				}
				else {
					
				System.out.println("thankyou");
				}
				
			}
	public static void main(String[] args)
	{
		
		Sportclub sport = new Sportclub();
		
		File myfile = new File("data4.txt");
		try
		{
			myfile.createNewFile();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
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
		
		
		fslots.put(1,  " = 7:00am to 7:30am");
		fslots.put(2,  " = 7:30am to 8:00am");
		fslots.put(3,  " = 8:00am to 8:30am");
		fslots.put(4,  " = 8:30am to 9:00am");
		fslots.put(5,  " = 9:00am to 9:30am");
		fslots.put(6,  " = 9:30am to 10:00am");
		fslots.put(7,  " = 10:00am to 10:30am");
		fslots.put(8,  " = 10:30am to 11:00am");
		fslots.put(9,  " = 11:00am to 11:30am");
		fslots.put(10, "=  11:30am to 12:00pm");
		fslots.put(11, "=  12:00pm to 12:30pm");
		fslots.put(12, "=  12:30pm to 1:00pm");
		fslots.put(13,  " = 1:00pm to 1:30pm");
		fslots.put(14,  " = 1:30pm to 2:00pm");
		fslots.put(15,  " = 2:00pm to 2:30am");
		fslots.put(16,  " = 2:30pm to 3:00pm");
		fslots.put(17,  " = 3:00pm to 3:30pm");
		fslots.put(18,  " = 3:00pm to 3:30pm");
		fslots.put(19,  " = 3:30pm to 4:00pm");
		fslots.put(20,  " = 4:00pm to 4:30pm");
	
		sport.book();
	}
		
}
