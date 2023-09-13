package studio2;

import java.util.Scanner;
public class Ruin {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is the starting amount");
		int startAmount = in.nextInt();
		System.out.println("What is the win chance");
		int winchance = in.nextInt();
		System.out.println("What is the win limit");
		int winlimit = in.nextInt();
		int money = startAmount;
		
		
		
		System.out.println("How many days");
		int totalSimulations = in.nextInt();
		
		double ruinRate;
		
		for(int i = 0; i < totalSimulations; i++) {
			int plays = 0;
			money = startAmount;
			if(winchance != 50)
			{ruinRate= 1-(startAmount/winlimit);}
			else
			{
				double a = (1-winchance/winchance);  
				
				ruinRate = (Math.pow(a,startAmount) - Math.pow(a, winlimit))/(1-Math.pow(a, winlimit));
				System.out.println("The ruin rate is +" ruinRate);
				//To find the ruin rate: 1-(start/winlimit)
			// Only if winchance is not 50 
			// Otherwise the ruinRate is (a^startAmount -a^ winlimit)/1-a^winlimit 
			}
			ruinRate = 0;
			while (!(money < 0) && !(money > winlimit))
			
				{
					plays++;
					if (((int)(Math.random() * (100-1+1) + 1)) >= winchance)
					{
						money ++;
					}
					else
					{
						money --;				
					}

						
				}
			System.out.println("You played for " + (i+1) + " days.");
			System.out.println("There have been " + (plays) + " plays.");
			if(money >= winlimit) {
				System.out.println("Your day ended in success!");
			} else {
				System.out.println("Your day ended in failure!");
			}
		}
		
	
		
	}

}
